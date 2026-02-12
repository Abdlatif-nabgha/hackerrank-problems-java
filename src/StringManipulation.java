import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        String A=scanner.next();
        String B=scanner.next();
        scanner.close();
        
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(Character.toUpperCase(A.charAt(0))
        + A.substring(1) + " " + Character.toUpperCase(B.charAt(0))
        + B.substring(1)
        );
    }
}



