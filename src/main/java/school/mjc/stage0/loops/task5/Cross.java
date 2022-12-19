package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printCross(int sideLength) {

        if (sideLength < 3) {
            return;
        }
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i != (sideLength / 2) && j != (sideLength / 2)) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(8);
            }
            System.out.println();
        }
    }
}