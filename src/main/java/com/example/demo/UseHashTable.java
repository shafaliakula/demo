package com.example.demo;


import java.util.ArrayList;
import java.util.List;
import java.util.Hashtable;
import java.lang.Math;
/*
*  Sample input:
* 5
* 1, 2, 3, 4, 5
* */
import java.util.Hashtable;

public class UseHashTable {

    public static int checkPerfectsqaure(List<Integer> aList){
        int result=0;
        Integer[] pair={0,0};
        Hashtable<Integer,Integer[]> htable = new Hashtable<Integer, Integer[]>();

        for(int i=0;i<aList.size();i++) {
            for (int j = i + 1; j < aList.size(); j++) {
                int number = aList.get(i) + aList.get(j);
                double d = Math.sqrt(number);
                double d1 = Math.cbrt(number);
                if (d-(int)d!=0) {
                    pair[0]=aList.get(i);
                    pair[1]=aList.get(j);
                    if(!htable.contains(pair)){
                        htable.put(i,pair);
                    }
                }
                else
                    continue;
            }
        }
        result = htable.size();

        return result;
    }

    public static void main(String[] args){

        List<Integer> aList = new ArrayList<>();

        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);

        System.out.println(checkPerfectsqaure(aList));

    }
}
