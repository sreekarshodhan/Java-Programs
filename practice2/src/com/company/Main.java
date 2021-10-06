package com.company;
import java.util.*;
public class Main {

       public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        //PRINTING A NUMBER GIVEN BY USER
      System.out.println("Enter the Number= ");
        int input = scanner.nextInt();


        System.out.println("The Number is:" + input);
       //ADDING TWO NUMBERS BY TAKING USER INPUT
           System.out.println("Enter two numbers: ");
     int a = scanner.nextInt();
     int b = scanner.nextInt();
           System.out.println("Num1 : " +a+ "and Num2 :" +b );
           System.out.println("The sum of two numbers is : "+(a+b));
       //MULTIPLYING TWO FLOATING POINT NUMBERS TAKING USER INPUT
           System.out.println("Enter the two floating point numbers: ");
           float a3 = scanner.nextFloat();
           float b3 = scanner.nextFloat();

           System.out.println("Multiplication of two floating point numbers is: " +a3*b3);
       //PRINTING THE ASCII VALUE OF THE CHARACTER RECEIVED FROM USER
           char ch = scanner.next().charAt(0);
           System.out.println("The asscii value of character: "+ (int)ch);
           System.out.println("Enter two numbers: ");
           int a1 = scanner.nextInt();
           int b1 = scanner.nextInt();
           System.out.println("------------Before swapping----------");
           System.out.println("The numbers are , num1 = "+a1+"and num2 = "+b1);
           int temp;
           temp = a1;
           a1 = b1;
           b1 = temp;
           System.out.println("-------------After swapping---------");
           System.out.println("The numbers are , num1 = "+a1+ "and num2 = "+b1);
        //CHECKING WHETHER THE GIVEN NUMBER IS EVEN OR ODD
          System.out.println("Enter numbers: ");
          int a2 = scanner.nextInt();
          //int b = scanner.nextInt();

          if(a2%2==0){
             System.out.println("The number is even");
          }
          else{
             System.out.println("The number is odd");
          }
        //CHECKING WHETHER THE GIVEN CHARACTER IS VOWEL OR CONSONANT
          System.out.println("Enter the character: ");
          char ch1 = scanner.next().charAt(0);
          if(ch1 == 'a'|| ch1 == 'e'|| ch1 == 'i'|| ch1 == 'o'|| ch1=='u'){
             System.out.println("This is a vowel.");
          }
          else{
             System.out.println("This is a consonant.");
          }
        //FINDING THE LARGEST OF THREE NUMBERS
          int n1 = scanner.nextInt();
          int n2 = scanner.nextInt();
          int n3 = scanner.nextInt();

          if(n1>n2&&n1>n3){
             System.out.println(n1+"is the largest number");
          }
          else if(n2>n3){
             System.out.println(n2+"is the largest number");
          }
          else {
             System.out.println(n3+"is the largest number");
          }

          float f = (float)20d + 20.02f; // 1
          long n = 10 + 2L;       // 2
          byte b4 = (byte) ((byte)n + 5);

       }
}
