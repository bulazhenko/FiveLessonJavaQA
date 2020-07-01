package com.customertimes.task11;

//11) Create a class with two different methods and two fields.
//One of methods should be static, another - non-static.
//The same thing should be done with class fields(first - static, second - non-static).
//These two methods should change the corresponding fields of the class when called.
// Create another class with main method to test your code.

public class Main {

    public static void main(String[] args) {
        First first = new First();
         First.change(4);

         first.anotherChange(8);
    }
}
