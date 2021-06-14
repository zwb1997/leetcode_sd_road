package jvmsd.chaptersix;

public class AboutField {

    public static void main(String[] args) {
        Sub1 sb1 = new Sub1();
        Super1 super1 = sb1;
        System.out.println(sb1.str);
        System.out.println(super1.str);
        Sub1.doSomething();
        System.out.println(Super1.test());
    }

}

class Super1 {
    protected String str = "super";

    protected static void doSomething() {
        System.out.println("super do!");
    }

    public static double test() {
        return 0.1 * 0.1;
    }
}

class Sub1 extends Super1 {
    public int str = 1;
}