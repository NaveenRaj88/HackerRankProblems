package com.code.quiz;

/**
 * Created by Naveen Kumar .A on 12/9/16.
 */
public class ParsingException {

    public static void parse(String str){
        float f = 0;
        try{
            float f1 = Float.parseFloat(str);
        }catch (NumberFormatException ex){
            f=0;
        }finally {
            System.out.println(f);
        }
    }
    public static void main(String[] args) {
        parse("invalid");
    }
}
