package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {

        if (height == 0) {
            return;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i > 0 && i < height - 1) {
                    if (j > 0 && j < height - 1) {
                        if (i == height / 2) {
                            if (j != height / 2) {
                                System.out.print(" ");
                                continue;
                            }
                            System.out.print(8);
                            continue;
                        }
                        System.out.print(8);
                        continue;
                    }
                    System.out.print(" ");
                    continue;
                }
                System.out.print(8);
            }
            System.out.println();
        }
    }
}