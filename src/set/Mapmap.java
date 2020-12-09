package set;

import org.jetbrains.annotations.NotNull;

import java.util.*;


// HashMap之所以能根据key直接拿到value，原因是它内部通过空间换时间的方法，用一个大数组存储所有value，并根据key直接计算出value应该存储在哪个索引
public class Mapmap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("wenjian",100);
        map.put("qinken",98);
        for (String s : map.keySet()){
            System.out.println(s);
        }
        for (Map.Entry<String,Integer> s : map.entrySet()){
            System.out.println(s);
        }

        Map<Student,Integer> smap = new HashMap<>();
        smap.put(new Student("wenjian",25,"daxue"),100);
        smap.put(new Student("qinken",24,"jialidundaxue"),98);
        Integer out = smap.get(new Student("wenjian",25,"daxue"));
        System.out.println(out);
        System.out.println(new Student("wenjian",25,"daxue").hashCode());
        System.out.println(new Student("wenjian",25,"daxue").hashCode());

        // 这个new TreeMap<>(new Comparator<Student>() {}) 传入的Comparator怎么这么写啊
        Map<Student, Integer> treemap = new TreeMap<>(new Comparator<Student>() {
            public int compare(Student p1, Student p2) {
                return p1.name.compareTo(p2.name);
            }
        });
    }
}
class Student{
    public String name;
    private int age;
    private String school;

    public Student(String name,int age,String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public boolean equals(@NotNull Object o){
        if (o instanceof Student){
            Student s = (Student) o;
            return Objects.equals(this.name,s.name) && Objects.equals(this.school,s.school) && this.age == s.age;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.school) + this.age;
    }
}