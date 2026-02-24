import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
            Calendar c = Calendar.getInstance();
            c.set(year, month - 1, day);
            String dayName = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
            return dayName.toUpperCase();
    }

}

public class DateTime {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
                BufferedWriter bufferedWriter =
                        new BufferedWriter(new OutputStreamWriter(System.out));
                
                String[] firstMultipleInput =
                        bufferedReader.readLine().trim().split(" ");
                
                int month = Integer.parseInt(firstMultipleInput[0]);
                int day = Integer.parseInt(firstMultipleInput[1]);
                int year = Integer.parseInt(firstMultipleInput[2]);
                
                String res = Result.findDay(month, day, year);
                
                bufferedWriter.write(res);
                bufferedWriter.newLine();
                bufferedWriter.flush(); // important for stdout
        }
    }
}
