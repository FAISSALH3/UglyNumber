package com.Faissal;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;


public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        try {
            HashMap<String, Integer> citiesIknow = new HashMap<>();

            citiesIknow.put("Fayssal", 19);
            citiesIknow.put("yasssin", 20);

            i =0 ;

            System.out.println(citiesIknow.remove("Fayssal"));

        }
        catch (Exception e)
        {
            System.out.println("someThing Is Wrong here");
        }
        finally {
            System.out.println("The 'try catch' is finished.");
        }

        ArrayList <Integer> Age = new ArrayList<>();

        System.out.println("how many numbers you want to sort ?");
        int s =scanner.nextInt();
        System.out.println("start to input your numbers");
        for(int j=1 ; j<s ; j++)
        {
            int in = scanner.nextInt();
            Age.add(in);
        }

        System.out.println("the sorted numbers are :");

        Collections.sort(Age);
        for(int i : Age)
        {
            System.out.println(i);
        }


    }


    public static boolean isFacotorPrime(int number) {

        while (number != 1) {
            number = SumOfintegers(number);
        }
        if (number == 1) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean containsDuplicate(int[] nums) {

        int count=0;
        for(int i=1; i <nums.length;i++ )
        {
            for(int j=0 ; j< i; j++)
            {
                if(nums[j]==nums[i]) {
                    count++;
                }
            }
        }
        if(count >0)
        {
            return true;
        }
        return false;
    }


    public static int SumOfintegers(int n)
            {
                int number =n ;
                int sum =0;
                int news = 0;
                while (number > 0) {

                    int num = number % 10;
                    number /= 10;
                    news = num * num;
                    sum = sum + news;

                }
                return sum;
            }
}