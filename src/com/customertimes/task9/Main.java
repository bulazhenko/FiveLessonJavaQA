package com.customertimes.task9;

import com.customertimes.task9.Classone;

//9) What is the different between static and non-static field of a class? Create an example to demostrate this concept.

public class Main {

    public static void main(String[] args) {
        Classone classone = new Classone();

        classone.bike = 1;

        Classone.car = 1;

    }
}
