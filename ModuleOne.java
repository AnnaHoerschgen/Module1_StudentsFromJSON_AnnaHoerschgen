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
        // Path to the JSON file
        String filePath = "students.json";

        try {
            // Create a Gson object to parse the JSON file
            Gson gson = new Gson();

            // Read the JSON file and parse it into a list of Student objects
            FileReader reader = new FileReader(filePath);
            List<Student> students = gson.fromJson(reader, List.class);

            // Close the file reader
            reader.close();

            // Print the details of each student in a user-friendly format
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (JsonSyntaxException e) {
            System.out.println("Error parsing the JSON file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    } // end main
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