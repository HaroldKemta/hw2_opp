import java.util.Scanner;

 public class DateandTimeTester {

   public void run () {

      Scanner scan = new Scanner(System.in);

      System.out.println("Enter a date and time (MM/DD hh:mm) : ");

      String input= scan.nextLine();

      while (true) {
         if (isValid(input)) {

            System.out.println("You entered a valid date and time");
            break;

         }

            else { 

               System.out.println("enter a correct date");

         }

      }

      scan.close();
   }




   public boolean isValid(String input) {

      String[] parts = input.split(" ");
      
      if (parts.length != 2) {return false;}

      String date = parts [0];
      String time = parts [1];

      return isValidDate(date) && isValidTime(time);
      
   }



   public boolean  isValidDate( String date ) {

      String[] parts = date.split("/");

      if (parts.length != 2) { return false; }

      int month;

      month = getMonth( date );

      int day;

      day = getDay(date);
      
   }



   public int getMonth (String date){

      String[] parts = date.split("/");

      int month;

      month = Integer.parseInt(parts[0]);
      
      return month;

   }



   public int getDay ( String date) {


      String parts = date.split("/");


   }

 }
