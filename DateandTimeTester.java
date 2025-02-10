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

      if ((month >= 1 && month <= 12 ) && (day >=1 && day <= 30)) {

         return true;
         
      } else { return false; }
      
     
      
   }



   public int getMonth (String date){

      String[] parts = date.split("/");

      int month;

      month = Integer.parseInt(parts[0]);
      
      return month;

   }



   public int getDay ( String date) {


      String[] parts = date.split("/");

      int day; 

      day = Integer.parseInt(parts[1]);

      return day;


   }

   public boolean isValidTime(String time) {

      String[] part= time.split(":");

      if ( part.length != 2 ) { return false; }

      int hour ;

      hour = getHour(time); 

      int minute;

      minute= getMinute(time);

      if ((hour <= 1 && hour >= 23) && (minute <= 1 && minute >= 59)) {
         return true;

       } else  { return false; } 
      





      


   }

   public int getHour(String time) {

      String[] parts = time.split(":");

      int hour ;

      hour = Integer.parseInt(parts[0]) ;

      return hour;

   }


   public int getMinute( String time) {

      String [] parts = time.split(":");

      int min; 

      min = Integer.parseInt(parts[1]);

      return min;


   }

 }
