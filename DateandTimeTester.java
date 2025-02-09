import java.util.Scanner;

 public class DateandTimeTester {

   public void run () {

      Scanner scan = new Scanner(System.in);

      System.out.println("Enter a date and time (MM/DD hh:mm) : ");

      String input= scan.nextLine();

      if (isValid(input)) {

         System.out.println("You entered a correct date");

      }

         else { 

            System.out.println("enter a correct date");

         }

      scan.close();
   }




   public boolean isValid(String input) {

      String[] parts = input.split(" ");
      
      if (parts.length != 2) {return false;}

      String date = parts [0];
      String time = parts [1];

      return isValidDate(date);
      
      return isValidTime(time);


   }


 }
