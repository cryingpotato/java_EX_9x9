package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args){
        for(int i = 1 ; i< 10 ; i++){
            for(int j = 1 ; j <10 ; j++)
                System.out.print(""+i+"*"+j+"="+(i*j)+"\t");
            System.out.println();
        }
    }
}
