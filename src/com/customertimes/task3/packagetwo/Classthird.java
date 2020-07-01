package com.customertimes.task3.packagetwo;

import com.customertimes.task3.packageone.Classone;

//Answer the question: What is a package-private access? Create a simple program to demostrate the package-private access.
//Tips:
// - Create two different packages
// - Create 3 classes. 2 classes should be in the first package, 3rd class - in the second package.
// - Create in one of the classes some package-private members(fields or methods).
// - In another two classes create objects of the class with package-private members and try to access its members.


public class Classthird {


    Classone classone = new Classone();

    // Because: 'cat()' is not public in 'com.customertimes.task3.packageone.Classone'. Cannot be accessed from outside package

    void test() {
        classone.cat();
    }
}
