package com.customertimes.task5;

//Answer the question: What is a private access? Create a simple program to demostrate the private access.
//Tips:
// - Create two classes
// - In on of them create private members
// - In the second class create an object of the first class
// - Try to access the private members

public class SecondClass {

    FirstClass firstClass = new FirstClass();

    // 'tiger()' has private access in 'com.customertimes.task5.FirstClass'

    void test() {
        FirstClass.tiger();
    }
}
