package eumee;

enum RepCodeEnum {
    SUCCESS(1, "success"),
    NAME_ALREADY_EXIST(3, "name already exist"),
    UNKNOWN_ERROR(9, "unknown error");

    private int code;
    private String msg;
    //枚举类的构造方法（code就是上面传的1，2，3；msg是上面传的success，name already exist，unknown error）
    RepCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
    //也可以覆盖方法
    @Override
    public String toString() {
        return this.msg;
    }

    public static void main(String[] args) {
        RepCodeEnum repCodeEnum = RepCodeEnum.SUCCESS;
        System.out.println("状态码:" + repCodeEnum.getCode() + "状态信息:" + repCodeEnum.getMsg());
    }
}
//测试

