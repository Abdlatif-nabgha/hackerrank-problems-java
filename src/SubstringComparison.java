import java.util.Scanner;
import java.util.stream.IntStream;

public class SubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
    String smallest = IntStream.range(0, s.length() - k + 1)
                               .mapToObj(i -> s.substring(i, i + k))
                               .min(String::compareTo)
                               .get();
                               
    String largest = IntStream.range(0, s.length() - k + 1)
                              .mapToObj(i -> s.substring(i, i + k))
                              .max(String::compareTo)
                              .get();
    
    return smallest + "\n" + largest;
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}