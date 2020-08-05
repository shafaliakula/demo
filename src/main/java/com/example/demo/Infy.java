package com.example.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

//Question: Print the name of Developers sorted in the ascending order of their experience

public class Infy {

        private static final String DEVELOPER = "Developer";
        private static final String MANAGER = "Manager";
        private static final String TESTER = "Tester";
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
                employees.add(new Employee("AAA", 9, TESTER));
                employees.add(new Employee("BBB", 5, DEVELOPER));
                employees.add(new Employee("CCC", 12, MANAGER));
                employees.add(new Employee("DDD", 7, TESTER));
                employees.add(new Employee("EEE", 4, DEVELOPER));
                employees.add(new Employee("FFF", 9, DEVELOPER));
                employees.add(new Employee("GGG", 3, TESTER));
                employees.add(new Employee("HHH", 3, DEVELOPER));

            //printName(employees);

            String stringV = "pwwkew";

            findLength(stringV);


        }

        public static void printName(List<Employee> empls){

           //empls.stream().collect(Collectors.groupingBy((x)->x.getExperience()));

            empls.stream().filter(x->x.getRole().equals(DEVELOPER)).sorted(Comparator.comparing(Employee::getExperience)).forEach((x)->System.out.println(x.getName()));
        }

        public static void findLength(String s){
            //storing substring
            List<Character> mp = new ArrayList<>();
            int result=0;
            int maxlength=0;
            int substringstartIndex=0;
            for(int i =0;i<s.length();i++){

                if(!mp.contains(s.charAt(i))){
                    mp.add(s.charAt(i));
                    result++;

                }
                else{
                    if(result>maxlength){
                        maxlength=result;
                    };
                    result=0;
                    mp.clear();
                    i=substringstartIndex;
                    substringstartIndex=i+1;
                }
            }

            System.out.println(maxlength);
        }


}
