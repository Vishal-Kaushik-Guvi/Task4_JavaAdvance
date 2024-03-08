package Question2;

public class VoterMain {
    public static void main(String[] args) {
        Voter vote = new Voter();
        try {
            vote.checkAge();
        } catch (Voter e) {
            e.printStackTrace();
        }
    } 
}

//-----------------------OUTPUT---------------------
// Enter your Voter Id: 1
// Enter your Name: Vishal
// Enter your Age: 18
// Your are eligible to vote!!!

//----------------------Wrong Vote Age----------------
// Enter your Voter Id: 1
// Enter your Name: Vishal
// Enter your Age: 16
// Question2.Voter: Invalid Age of Voter!!
//         at Question2.Voter.checkAge(Voter.java:30)
//         at Question2.VoterMain.main(VoterMain.java:7)