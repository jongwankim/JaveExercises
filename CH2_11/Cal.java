import java.time.DayOfWeek;
import java.util.LinkedHashMap;
import java.time.LocalDate;
import java.util.Map;
import static java.time.LocalDate.*;
import static java.lang.System.*;

/*
 * Rewrite the Cal class to use static imports for the System and LocalDate classes.
 */

public class Cal {
   private static String[] days = new String[]{ "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; 

   public static void printDays(){
      for(int i=0; i<days.length; i++) {
         out.printf("%s\t", days[i]);
      }
      out.println();
   }

   public static void main(String[] args) {
      printDays();
      LocalDate today = now();
      LocalDate date = of(today.getYear(), today.getMonthValue(), 1);
      int pos = date.getDayOfWeek().getValue() == 7 ? 0 : date.getDayOfWeek().getValue();

      for (int i = 0; i < pos; i++) {
         out.print("\t");
      }

      while(date.getMonthValue() == today.getMonthValue()){
         String format = pos++ % 7 == 6 ? "%d\n" : "%d\t";
         out.printf(format, date.getDayOfMonth());
         date = date.plusDays(1);
      }
   }
}
