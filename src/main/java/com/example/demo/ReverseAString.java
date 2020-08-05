package com.example.demo;
import org.apache.logging.log4j.util.StringBuilderFormattable;

import java.util.Scanner;


//Implement logic to check uniqueness of string in space.
public class ReverseAString {

    public static boolean IsUnique(String word){
        int i= 0,j=0;
        if(word!= null) {
            while (i < word.length()) {
                for (j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        return false;
                    }
                }
                i++;
            }
        }

        return true;
    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        String word = s.next();

        Boolean b = IsUnique(word);

    }

}