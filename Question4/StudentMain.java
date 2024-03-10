package Question4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMain {

  public static void main(String[] args) {
    // HshMap
    HashMap<String, Integer> stdMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    String stdName;
    int stdGrade;
    // Taking intial Students data into scanner
    System.out.println("Enter Number of Students");
    int stdNum = sc.nextInt();
    for (int i = 0; i < stdNum; i++) {
      System.out.print("Enter Student Name: ");
      stdName = sc.next();
      System.out.print("Enter Student Grade: ");
      stdGrade = sc.nextInt();

      stdMap.put(stdName, stdGrade);
    }

    Student std = new Student();
    // Giving choice to choose a method to performe
    int choice;
    do {
      System.out.println("\n1. Add Student");
      System.out.println("2. Remove Student");
      System.out.println("3. Display Student");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();
      sc.nextLine(); // Consume newline character

      switch (choice) {
        case 1:
          std.addStudent(stdMap);
          break;
        case 2:
          std.removeStudent(stdMap);
          break;
        case 3:
          std.displayStudent(stdMap);
          break;
        case 4:
          break;
        default:
          System.out.println("Invalid Choice! Please try again.");
      }
   // Display the data of student after every method
      for (Map.Entry<String, Integer> entry : stdMap.entrySet()) {
        stdName = entry.getKey();
        stdGrade = entry.getValue();
        System.out.println("Name :- " + stdName + " | " + "Grade :- " + stdGrade);
      }
    } while (choice != 4);

    sc.close(); // Close the Scanner after its usage is complete
  }
}


//--------------------------OUTPUT---------------------------

//---------------Existing Student-----------------
// Enter Number of Students
// 3
// Enter Student Name: Tarun
// Enter Student Grade: 44
// Enter Student Name: Ravi
// Enter Student Grade: 76
// Enter Student Name: Vishal
// Enter Student Grade: 99

//--------------Add New Student----------------
// Enter new Student Name: Mohan
// Enter new Student Grade: 65
// New Student added successfully!!
// Name :- Mohan | Grade :- 65
// Name :- Tarun | Grade :- 44
// Name :- Ravi | Grade :- 76
// Name :- Vishal | Grade :- 99

//---------------------Removing Student--------------------------
// Enter the Name of Student You want to Remove: Vishal
// Student Removed Successfully
// Name :- Tarun | Grade :- 44
// Name :- Ravi | Grade :- 76

// ------------------Displaying Student Grade--------------------------
// Enter the Name of Student You want to View
// Mohan
// Here the Grade of the Student
// Student Grade :- 65
// Name :- Mohan | Grade :- 65
// Name :- Tarun | Grade :- 44
// Name :- Ravi | Grade :- 76