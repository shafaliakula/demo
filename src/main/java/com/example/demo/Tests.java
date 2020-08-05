package com.example.demo;
//create a list , 7 employee objects, Employee(name,city), print number of employees by city(groupby)

//create a deadlock

//bubble sort: 1,7,3,0,7,2.1

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Tests {


    public static void printByCity(ArrayList<Employee1> employeeArrayList){



/*
        System.out.println(employeeArrayList.stream().collect(Collectors.groupingBy(Employee1::getCity)));
        System.out.println(employeeArrayList.stream().collect(Collectors.groupingBy(Employee1::getName)));
*/


    }


    public static void BubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }

    static class Employee1{

        public static void Employee1(){}

        private String name;
        private String city;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }



    public static void main(String[] args){
        int[] a = {9,2,6,4,7,8,1};
        BubbleSort(a);

        List<Employee1> employeeList = new ArrayList<Employee1>();
        Employee1 e1 = new Employee1();
        Employee1 e2 = new Employee1();
        e1.setName("Shafali");
        e1.setCity("Austin");
        e2.setName("Adarsh");
        e2.setCity("Corpus Christi");
        employeeList.add(e1);
        employeeList.add(e2);

        printByCity((ArrayList<Employee1>) employeeList);
    }

}
