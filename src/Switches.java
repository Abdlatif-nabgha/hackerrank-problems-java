public class Switches {
        public static void main(String[] args) {
            final int score1 = 8, score2 = 3;
            char myScore = 7;
            String goal = switch (myScore) {
                default -> {yield "unknown";}
                case score1 -> "great";
                case 2, 4, 6 -> "good";
                case score2, 0 -> {yield "bad";}
                case 1 -> {yield "bad";}
            };
            System.out.println(goal);
        }
}
