package jvmsd.chapterseven.common;

public class ConstantClass {
    public static final int i1 = 1;
    static{
        System.out.println("ConstantClass init!");
    }
    // public static String HELLOWORLD = "helloworld";
    public static final String HELLOWORLD = "helloworld";
}
