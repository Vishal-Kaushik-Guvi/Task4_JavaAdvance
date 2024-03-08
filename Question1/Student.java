package Question1;

import java.util.Scanner;

public class Student {
    // Data Members of Class Student.
    private int roll_no;
    private int age;
    private String Name;
    private String Course;
    
    // Default Constructor of Class Student.
    public Student() {
        super();
    }
    
    // Parameterised Constructor of Class Student.
    public Student(int roll_no, int age, String name, String course) {
        super();
        this.roll_no = roll_no;
        this.age = age;
        Name = name;
        Course = course;
    }
    
    // User Defined Exception For Wrong Age.
    class WrongAgeException extends Exception {
        public WrongAgeException(String message) {
            super(message);
        }
    }
    // User Defined Exception of Invalid Expressions in Name
    class InvalidNameException extends Exception{
        InvalidNameException(String message){
            super(message);
        }
    }
    
    // Method to display Details of Student
    public void Display() throws WrongAgeException, InvalidNameException{
        Scanner sc = new Scanner(System.in);

    // Taking Student Details in Input
        System.out.print("Enter Name: ");
        Name = sc.next();
        System.out.print("Enter Course: ");
        Course = sc.next();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter Roll No: ");
        roll_no = sc.nextInt();
    
    // For loop to check each of character of Name
        for (char c : Name.toCharArray()) {
    
   // Condition for Invalid Name Exception
            if (!Character.isLetter(c)) {
                throw new InvalidNameException("InvalidNameException!!!");
            }
        } 
    
    // Condition for Wrong Age Exception
        if (age < 15 || age > 21) {
            throw new WrongAgeException("AgeNotWithinRangeException!!!");
        }else {
            System.out.println("Data is Correct!!!");
        }


    }
 }
