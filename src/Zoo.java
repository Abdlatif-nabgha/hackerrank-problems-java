public class Zoo {
    enum Animal {BIRD, FISH, MAMMAL}
    static void printLocation(Animal a) {
        long type = switch(a) {
            case BIRD -> 1;
            case FISH -> 2;
            case MAMMAL -> 3;
            default -> 0;
        };
        System.out.print(type);
        System.out.println();
    }

    public static void main(String[] args) {
        printLocation(Animal.MAMMAL);

        boolean keepGoing = true;
        int result = 15, meters = 10;
        do {
            meters--;
            if (meters==8) keepGoing = false;
            result -= 2;
        } while (keepGoing);
        System.out.println(result);

        int numFish = 4;
        String fishType = "tuna";
        String anotherFish = String.valueOf(numFish + 1);
        System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);
        System.out.println();
    }
}
