package com.junit.com.AppTest;

public class GCDemo {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called for object: " + this);
    }

    public static void main(String[] args) {
        GCDemo obj1 = new GCDemo();
         GCDemo obj2 = new GCDemo();
 
        // Now these objects are eligible for GC
        obj1 = null;
        obj2 = null;

        // Suggest JVM to run garbage collector
        System.gc();

        System.out.println("Requested garbage collection");
    }
}
