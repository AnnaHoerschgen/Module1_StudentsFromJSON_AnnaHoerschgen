/*
 * Name: Anna Hoerschgen
 * Date: January 28, 2025
 * Filename: ModuleOne.java
 * Assignment: Students from a [JSON] File
 */

// Imports
import com.google.gson.*;
import java.io.*;
import java.util.*;

public class ModuleOne {
    public static void main(String[] args) {
        // enter main program
    }
    
}

class Student {
    int id;
    String name;
    int age;
    String grade;

    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}