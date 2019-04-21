import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class CH2_1 {
   private static String[] days = new String[]{ "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; 

   public static void printDays(){
      for(int i=0; i<days.length; i++) {
         System.out.printf("%s\t", days[i]);
      }
      System.out.println();
   }

   public static void main(String[] args) {
      printDays();
      LocalDate today = LocalDate.now();
      LocalDate date = LocalDate.of(today.getYear(), today.getMonthValue(), 1);
      int pos = date.getDayOfWeek().getValue() == 7 ? 0 : date.getDayOfWeek().getValue();

      for (int i = 0; i < pos; i++) {
         System.out.print("\t");
      }

      while(date.getMonthValue() == today.getMonthValue()){
         String format = pos++ % 7 == 6 ? "%d\n" : "%d\t";
         System.out.printf(format, date.getDayOfMonth());
         date = date.plusDays(1);
      }
   }
}