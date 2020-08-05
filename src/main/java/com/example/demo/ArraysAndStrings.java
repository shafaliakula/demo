package com.example.demo;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArraysAndStrings {

    public static boolean isPermutaion(String s, String s1){

        char[] s_arr = s.toCharArray();
        char[] s1_arr = s1.toCharArray();

        if(s_arr.equals(s1_arr)){
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {

        String s = "qwerty";
        String s1= "qwerr";

        boolean permute = isPermutaion(s, s1);
    }
}
