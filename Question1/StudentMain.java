package Question1;

import Question1.Student.InvalidNameException;
import Question1.Student.WrongAgeException;


public class StudentMain {
    public static void main(String[] args) {
    
    // Student Class Object
        Student std = new Student();
   // try-catch block to handle Exceptions
        try {
            std.Display();
        } catch (WrongAgeException | InvalidNameException e) {
            // Print the message of the caught exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}


// ------------------ output ---------------------------
// Enter Name: Vishal
// Enter Course: BCA
// Enter age: 16
// Enter Roll No: 44
// Data is Correct!!!

// ------------------for wrong age ---------------------
// Enter Name: Vishal
// Enter Course: BCA
// Enter age: 12
// Enter Roll No: 44
// Error: AgeNotWithinRangeException!!!

// ------------------for wrong name --------------------
// Enter Name: #123
// Enter Course: BCA
// Enter age: 16
// Enter Roll No: 44
// Error: InvalidNameException!!!