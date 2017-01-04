package com.code.quiz;

import java.io.IOException;

/**
 * Created by Naveen Kumar .A on 12/9/16.
 */

class Parent {
    static void test() throws IOException {
        System.out.println("Parent");
    }

}

class Child extends Parent{

    static void test() //throws Exception // this is the problem even in static methods
     {
        System.out.println("Child");
    }
}

public class StaticMethodInvocInPolyMorphism {

    public static void main(String[] args) {

        try {
            Parent p = new Child();
            p.test();
        }catch (Exception ex ){
            System.out.println(ex);
        }
    }
}
