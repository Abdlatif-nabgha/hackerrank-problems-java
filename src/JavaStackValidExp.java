import java.util.*;

public class JavaStackValidExp {
    
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            Stack<Character> stack = new Stack<>();
            boolean isValidExp = true;
            for (Character c : input.toCharArray()) {
                if(c == '(' || c == '{' || c == '[') 
                    stack.add(c);
                else {
                    if (stack.isEmpty()) {
                        isValidExp = false;
                        break;
                    } else {
                        if (stack.pop() != reverseChar(c)) {
                            isValidExp = false;
                            break;
                        }
                    }
                }
            }
            System.out.println(stack.isEmpty() && isValidExp);
        }
        
        sc.close();
    }
    
    private static char reverseChar(char c) {
        return switch(c) {
            case '}' -> '{';
            case ']' -> '[';
            case ')' -> '(';
            default -> c;
        };
    }
   
}
