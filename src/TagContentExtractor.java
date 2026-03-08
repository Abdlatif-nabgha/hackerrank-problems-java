import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class TagContentExtractor {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        // 1. create pattern
        Pattern p = Pattern.compile("<([^>]+)>([^<>]+)</\\1>");
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
			Boolean found = false;
            Matcher m = p.matcher(line);
            
            while (m.find()) {
                System.out.println(m.group(2));
                found = true;
            }
            if (!found) System.out.println("None");
			testCases--;
		}
        in.close();
	}
}



