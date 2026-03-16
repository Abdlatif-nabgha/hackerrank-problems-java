import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



public class Array2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "")
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        // write your code here 
        int largestSumHourglass = Integer.MIN_VALUE;
        int size = arr.size();
        // iterate through list 
        for (int i = 0; i < size - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                int sum = 
                    // top row
                    arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)
                    // middle row
                    +arr.get(i+1).get(j+1)
                    // bottom row
                    +arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                largestSumHourglass = Math.max(largestSumHourglass, sum);
            }
        }
        System.out.println(largestSumHourglass);
        bufferedReader.close();
    }
}
