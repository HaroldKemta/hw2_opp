import java.util.Scanner;

public class DateandTimeTester {

   public void run() {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a date and time (MM/DD hh:mm) : ");

      while (true) {
         String input = scan.nextLine();
         if (isValid(input)) {
            System.out.println("You entered a valid date and time");
            break;
         } else {
            System.out.println("Enter a correct date");
         }
      }

      scan.close();
   }

   public boolean isValid(String input) {
      String[] parts = input.split(" ");
      if (parts.length != 2) {
         return false;
      }

      String date = parts[0];
      String time = parts[1];

      return isValidDate(date) && isValidTime(time);
   }

   public boolean isValidDate(String date) {
      String[] parts = date.split("/");

      if (parts.length != 2) {
         return false;
      }

      int month = getMonth(date);
      int day = getDay(date);

      if (month < 1 || month > 12) {
         return false;
      }

      // Validate day based on the month
      if (day < 1 || day > getMaxDaysInMonth(month)) {
         return false;
      }

      return true;
   }

   public int getMonth(String date) {
      String[] parts = date.split("/");
      return Integer.parseInt(parts[0]);
   }

   public int getDay(String date) {
      String[] parts = date.split("/");
      return Integer.parseInt(parts[1]);
   }

   public boolean isValidTime(String time) {
      String[] parts = time.split(":");

      if (parts.length != 2) {
         return false;
      }

      int hour = getHour(time);
      int minute = getMinute(time);

      // Corrected logic for time validation
      if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
         return false;
      }

      return true;
   }

   public int getHour(String time) {
      String[] parts = time.split(":");
      return Integer.parseInt(parts[0]);
   }

   public int getMinute(String time) {
      String[] parts = time.split(":");
      return Integer.parseInt(parts[1]);
   }

   private int getMaxDaysInMonth(int month) {
      if (month == 4 || month == 6 || month == 9 || month == 11) {
         return 30; // April, June, September, November
      } else if (month == 2) {
         return 28; // Ignoring leap years for simplicity
      } else {
         return 31;
      }
   }

   public static void main(String[] args) {
      new DateandTimeTester().run();
   }
}


 