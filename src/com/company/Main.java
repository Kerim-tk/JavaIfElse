package com.company;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String a = "";
        if(n%2==1){
            a = "Weird";
        }
        else{
            if(n<=2 && n<=5){
                a = "Not Weird";

            } else if(n>=6 && n<=20){
                a = "Weird";
            } else {
                a = "Not Weird";
            }
        } System.out.println(a);
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}
