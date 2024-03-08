package Question2;

import java.util.Scanner;

public class Voter extends Exception{
   private int voterId;
   private String voterName;
   private int voterAge;

public Voter(){

}

public Voter(int voterId, String voterName, int voterAge, String message) {
    super(message);
    this.voterId = voterId;
    this.voterName = voterName;
    this.voterAge = voterAge;
} 

public void checkAge()throws Voter{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Voter Id: ");
    voterId =sc.nextInt();
    System.out.print("Enter your Name: ");
    voterName = sc.next();
    System.out.print("Enter your Age: ");
    voterAge = sc.nextInt();
    if (voterAge<18) {
        throw new Voter(voterId, voterName, voterAge, "Invalid Age of Voter!!");
    }else{
        System.out.println("Your are eligible to vote!!!");
    }
}
}
