package com.customertimes.task1;

//1) Create 2 classes with the same name, but put them in different packages. For example, com.domainname.modulename.
//Create a third class with the main method. In the main method create two different objects of your classes specifying
// the full name of the classes (including packages).

public class Main {
    public static void main(String[] args) {

        com.customertimes.task1.packagea.ClassA classApa = new com.customertimes.task1.packagea.ClassA();
        com.customertimes.task1.packageb.ClassA classApb = new com.customertimes.task1.packageb.ClassA();
    }
}
