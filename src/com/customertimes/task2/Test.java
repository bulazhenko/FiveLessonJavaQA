package com.customertimes.task2;
import com.customertimes.task1.*;

//2) Take the classes from the task 1. Create a new test class. Import everything (*) from your created packages.
// Now try to create objects of your classes without specifying the packages in front of the class names.
// What happened? How can we avoid this?

public class Test {
    new ClassA();

}
// Error displayed, because we has not specified correct class package.
// We should specify package when creating a new object!