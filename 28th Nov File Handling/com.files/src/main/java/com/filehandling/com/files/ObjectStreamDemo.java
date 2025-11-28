package com.filehandling.com.files;

import java.io.*;

// 1. Make a class Serializable
class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class ObjectStreamDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 2. Create objects
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);

        // 3. Write objects to file
        FileOutputStream fos = new FileOutputStream("students.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);
        oos.writeObject(s2);

        oos.close();
        fos.close();

        System.out.println("Objects have been serialized to students.dat");

        // 4. Read objects back from file
        FileInputStream fis = new FileInputStream("students.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student obj1 = (Student) ois.readObject();
        Student obj2 = (Student) ois.readObject();

        ois.close();
        fis.close();

        System.out.println("Deserialized objects:");
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
