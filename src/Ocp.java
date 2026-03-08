import java.util.ArrayList;
import java.util.List;

public class Ocp {
    public static void main(String[] args) {
        int temperature = 4;
        long humidity = -temperature + temperature * 3;
        if (temperature>=4)
            if (humidity < 6) System.out.println("Too Low");
            else System.out.println("Just Right");
        else System.out.println("Too High");

        printReptile(6);

        List<Integer> myFavoriteNumbers = new ArrayList<>();
        myFavoriteNumbers.add(10);
        myFavoriteNumbers.add(14);
        for (var a : myFavoriteNumbers) {
            System.out.print(a + ", ");
            break;
        }
        for (int b : myFavoriteNumbers) {
            System.out.print(b + ", ");
            continue;
        }
        for (Object c : myFavoriteNumbers)
            System.out.print(c + ", ");

        
    }

    public static void printReptile(int category) {
        var type = switch(category) {
        case 1,2 -> "Snake";
        case 3,4 -> "Lizard";
        case 5,6 -> "Turtle";
        case 7,8 -> "Alligator";
        default -> "Unknown";
        };
        System.out.print(type);
    }


}

// 
