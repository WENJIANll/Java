package set;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratoror {
    public static void main(String[] args) {
        Teacherlist tlist = new Teacherlist();
        tlist.add("wenjian");
        tlist.add("wuwuwu");
        tlist.add("yyyyyy");
//        for (String s : tlist) {
//            System.out.println(s);
//        }
        Teacherlist.@NotNull Teacherlisttor it = tlist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Teacherlist implements Iterable<String> {
    private List<String> tlist = new ArrayList<>();

    void add(String name) {
        tlist.add(name);
    }

    @NotNull
    @Override
    public Teacherlisttor iterator() {
        return new Teacherlisttor(this.tlist.size());
    }

    class Teacherlisttor implements Iterator<String> {
        int index = 0;

        Teacherlisttor(int size) {
            this.index = size;
        }

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public String next() {
            index--;
            // 内部类可以使用  外部类.this  来获得当前外部类的this引用
            return Teacherlist.this.tlist.get(index);
        }

    }
}
