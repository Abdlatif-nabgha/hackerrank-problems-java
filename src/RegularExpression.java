import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

        // 1. compile pattern
        Pattern p = Pattern.compile("a"); // match one 'a'

        // 2. create matcher
        Matcher m = p.matcher("say hello to java");

        // 3. find matches
        while (m.find()) {
            System.out.println(m.group() + " at index " + m.start());
        }
    }
}
