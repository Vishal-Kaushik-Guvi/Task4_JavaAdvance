package Question3;

import java.util.Scanner;

public class WeekDays {  
      // String array to store Weekdays name using static so that it can accessed insdie method as well
        static String[] Name = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};
        public static void main(String[] args) {
        // Scanner to take day position as input.
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Day Position(0-6): ");
            int day = sc.nextInt();
        // try catch block to handle exception.
         try {
        // Condition to make WeekDays between 0-6
            if (day>=0 && day<=6) {
                System.out.println("WeekDay: " +Name[day]);
            }else{
        // thorwing exception with custom message
                throw new IndexOutOfBoundsException("Weekdays are UnAcceptable Exception!!!!");
            }
         } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
         }
         finally{
            sc.close();
         }
        }
}

// ------------------OutPut--------------------
// Enter the Day Position(0-6): 0
// WeekDay: Sunday

// ------------------Custom Message Exception-----------
// Enter the Day Position(0-6): 9
// java.lang.IndexOutOfBoundsException: Weekdays are UnAcceptable Exception!!!!
//         at Question3.WeekDays.main(WeekDays.java:20)
