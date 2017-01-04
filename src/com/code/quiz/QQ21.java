package com.code.quiz;

/**
 * Created by Naveen Kumar .A on 12/9/16.
 */
public class QQ21 {

    public static void main(String[] args) {
        System.out.println(method());
    }

    static int method(){
        try{
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {
            throw new NullPointerException();
        }
    }
}
