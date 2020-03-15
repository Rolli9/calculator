package com.company;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        //Numerical input
        int num1;
        int num2;

        String operation;

        Scanner input = new Scanner(System.in);

       System.out.println("Please enter first number");
       num1 = input.nextInt();

       System.out.println("Please enter second number");
       num2 = input.nextInt();


       Scanner op = new Scanner (System.in);
       System.out.println("Please enter operation");
       operation = op.next();


       if (operation.equals("+"))
        {
       System.out.println("Your answer is " + (num1 + num2));
        }
      if (operation.equals("-"))
        {
         System.out.println("Your answer is" + (num1 - num2));
        }
      if (operation.equals("/"))
        {
       System.out.println("Your answer is" + (num1 / num2));
        }
      if (operation.equals("*"))
        {
       System.out.println("Your answer is" + (num1 + num2));
        }
    }

    }


