package org.example.LT2_P2;

import java.util.Scanner;

public class SimpleAddition {

    public static void main(String[] args) {

        int num1, num2;

        System.out.println("Starting the program.");
        num1 = AcceptIntegerInputFromUser();
        num2 = AcceptIntegerInputFromUser();

        System.out.println("Entered first number to add is : " + num1);
        System.out.println("Entered second number to add is : " + num2);

        System.out.println("Addition of " + num1 + " and " + num2 + " is : " + addFunction(num1,num2));

    }


    private static int AcceptIntegerInputFromUser() {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Please enter the integer value to add : ");
            String strNum = sc.nextLine();

            try {
                num = Integer.parseInt(strNum);
                isValid = true;
            }
            catch (NumberFormatException e )
                {
                    System.out.println("\n\nThat's not a valid integer value.\nPlease try again!!!\n\n\n");
            }
        }


        return num;
    }


    private static int addFunction(int num1, int num2) {

       return(num1 + num2);
    }
}
