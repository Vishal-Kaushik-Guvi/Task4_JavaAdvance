package Question4;

import java.util.HashMap;
import java.util.Scanner;
// Class student with data memebers
public class Student {
    HashMap<String, Integer> stdMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    private String stdName;
    private int stdGrade;

// add method taking information of student in console
    public void addStudent(HashMap<String, Integer> stdMap) {
        System.out.print("Enter new Student Name: ");
        stdName = sc.next();
        System.out.print("Enter new Student Grade: ");
        stdGrade = sc.nextInt();
/// put method of hasmap to add data into attributes
        stdMap.put(stdName, stdGrade);
        System.out.println("New Student added successfully!!");
    }
// remove methd to remove a student
    public void removeStudent(HashMap<String, Integer> stdMap) {
        System.out.print("Enter the Name of Student You want to Remove: ");
        stdName = sc.next();
        // condition if HashMap (stdMap) contains key(stdName)
        if (stdMap.containsKey(stdName)) {
        // remove method to remove data of that key
            stdMap.remove(stdName);
            System.out.println("Student Removed Successfully");
        } else {
            System.out.println("Student Not Found!!!");
        }
    }
  // display method to display grade of stduent through key
    public void displayStudent(HashMap<String, Integer> stdMap) {
        System.out.println("Enter the Name of Student You want to View");
        stdName = sc.next();
  // condition if key(stdName) exist in HashMap(stdMap)
        if (stdMap.containsKey(stdName)) {
  // putting values of stat student into a variable stdGrade
            int stdGrade = stdMap.get(stdName);
  //  Displaying Grade of that student
            System.out.println("Here the Grade of the Student");
            System.out.println("Student Grade :- " + stdGrade);
        } else {
            System.out.println("Student do not Exist!!!");
        }
    }
}
