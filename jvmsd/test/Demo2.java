package jvmsd.test;

public interface Demo2 extends Demo1{
    /**
     * asd
     */
    @Override
    default void do1() {
        // TODO Auto-generated method stub
        System.out.println("do so...");
    }
   
}
