package com.customertimes.task6;

//6) Create a new class. Make it impossible to create a new object of this class using a constructor.
// Provide an appropriate public method that will allow clients of your class create a new object.

public class Main {

    public static void main(String[] args) {
        ClassA classA = ClassA.create();
    }
}
