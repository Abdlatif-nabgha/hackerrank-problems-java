import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
HackerRank Java 1D Array (Part 2) problem solution – In this HackerRank java Array (Part 2) problem in the java programming language. Let’s play a game on an array! You’re standing at index 0 of an n-element array named game. From some index i (where 0<=i<=n), you can perform one of the following moves:

Move Backward: If cell i-1 exists and contains a 0, you can walk back to cell i-1.

Move Forward: 

If cell i+1 contains a zero, you can walk to cell i+1.
If cell i+leap contains a zero, you can jump to cell i+leap.
If you’re standing in cell n-1 or the value of i+leap>=n, you can walk or jump off the end of the array and win the game.
In other words, you can move from index i to index i+1, i-1, or i+leap as long as the destination index is a cell containing a 0. If the destination index is greater than n-1, you win the game.


*/
public class Java1DArray2 {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return win(leap, game, 0);
    }

    private static boolean win(int leap, int[] game, int index) {
        // BASE CASE 1: WE ESCAPED THE ARRAY -> WIN
        if (index >= game.length) return true;
        
        // BASE CASE 2 : Invalid position -> LOSE
        if (index < 0 || game[index] == 1) return false;
        
        // MARK as visited (set to 1)
        game[index] = 1;
        
        // TRY ALL MOVES, return true if any one of them lead to win
        return win(leap, game, index+leap) || 
                win(leap, game, index + 1) ||
                win(leap, game, index - 1);
    }
    /*
     * BFS implementation
     * 
     */
    public static boolean canWinBFS(int leap, int[] game) {
    int n = game.length;
    Queue<Integer> queue = new LinkedList<>();
    queue.add(0); // start from index 0

    while (!queue.isEmpty()) {
        int index = queue.poll(); // take next position to explore

        // try all 3 moves
        int[] moves = {index + 1, index + leap, index - 1};

        for (int next : moves) {
            if (next >= n) return true; // escaped! WIN ✅

            if (next >= 0 && game[next] == 0) {
                game[next] = 1;        // mark as visited
                queue.add(next);       // add to queue to explore later
            }
        }
    }
    return false; // queue empty, no way out ❌
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
