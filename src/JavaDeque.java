import java.util.*;

public class JavaDeque {
    public static void main(String[] args)  {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> freq = new HashMap<>(); // num -> count in window
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            
            // Add new element to window
            deque.addLast(num);
            freq.merge(num, 1, Integer::sum);
            
            // Shrink window if exceeds m
            if (deque.size() > m) {
                int removed = deque.removeFirst();
                freq.merge(removed, -1, Integer::sum);
                if (freq.get(removed) == 0) {
                    freq.remove(removed);
                }
            }
            
            // Track max distinct count across all windows
            max = Math.max(max, freq.size());
        }
        
        System.out.println(max);
    }
}