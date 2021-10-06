package com.company;

public class Main {

    public static void main(String[] args) {
	     System.out.println("Hello, World");
         //Variables
        float sho =  3.24f;

        sho = 32;
        System.out.println(sho);
        // 1. java is case sensitive:
        int age = 30;
        int AGE = 32;
        System.out.println(age);
        System.out.println(AGE);

        //2. Variables must start with letter or _ or $ but not with digits
        int agee= 30;
        int _age = 31;
        int $age = 32;
        //int 1age = 33; because we should not start with a digit
        System.out.println(agee);
        System.out.println(_age);
        System.out.println($age);
       // System.out.println(1age);
        float b = 2.5f;
        String myString = "Sreekar";
        char c = 'a';
        System.out.println(b);
        System.out.println(myString);
        System.out.println(c);


    }
}
