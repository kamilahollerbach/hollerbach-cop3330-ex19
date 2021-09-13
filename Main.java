/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kamila Hollerbach
 */

package com.company;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your height in inches: ");
        double height = sc.nextDouble();
        System.out.println("Enter your weight in pounds: ");
        double weight = sc.nextDouble();

        double BMI = (weight / (height * height)) * 703;

        System.out.println("Your BMI is " + String.format("%.2f",BMI));

        if(BMI >= 18.5 && BMI <= 25){
            System.out.println("You are within the ideal weight range");
        }
        else if(BMI >25){
            System.out.println("You are overweight. You should see your doctor.");
        }
        else if(BMI < 18.5){
            System.out.println("You are underweight. You should see with your doctor.");
        }
    }
}



