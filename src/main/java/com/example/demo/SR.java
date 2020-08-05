package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

//1. check 2 strings if one is a permutation of another;
public class SR {

    public static void main(String[] args) {

        String string1 = "abcbacddd";
        String string2 = "acd";

        char[] c = string1.toCharArray();
        char[] c1 = string2.toCharArray();

        Arrays.sort(c);
        Arrays.sort(c1);
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(c1));


        boolean result = isPermutation(c,c1);
        System.out.println(result);

    }

    public static boolean isPermutation(char[] c, char[] c1){
        boolean result = false;
        Arrays.asList(c).contains(Arrays.asList(c1));
        
        return result;
    }

}
