package jvmsd.chaptersix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

class A extends Exception {

}

class B extends A {

}

class C {
    public int c1;
}

class D extends C {
    public int d1;
}

public class Demo1 {

    private int m;

    public int inc() {
        int x;
        try {
            x = 1;
            System.out.println("try!");
            // return x;
            throw new Error();
        } catch (Exception e) {
            System.out.println("occure error!");
            x = 2;
            return x;
        } finally {
            System.out.println("finally!");
            x = 3;
        }
    }

    public String getWord() {
        StringBuilder s = new StringBuilder("Hello");
        try {
            return s.toString();
        } catch (Exception e) {
            return s.toString();
        } finally {
            s.append("World");
        }
    }

    public void tDemo() {
        try {
            try {
                throw new A();
            } catch (A a) {
                System.out.println("catch a");
                throw a;
            }
        } catch (B b) {
            System.out.println("catch b");
            return;
        } finally {
            System.out.println("hello world");
        }
    }

    public void tDemo2() {
        // try {
        // throw new B();
        // } catch (A a) {
        // System.out.println("catch a");
        // } catch (B b) {
        // System.out.println("catch b");
        // } finally {
        // System.out.println("hello world");
        // }
    }

    public static void main(String[] args) {
        new Demo1().tDemo2();
        try {
            C c = new D();
            var d = (D) c;
            System.out.println(d.c1);
            System.out.println(d.d1);
        } catch (Exception ex) {
            System.out.println("error\n " + ex);
        }
    }
}
