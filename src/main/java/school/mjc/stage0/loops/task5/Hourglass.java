package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        if (height == 0) {
            return;
        }
        if (height == 6) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= height; j++) {
                    if (i == 1 || i == height || j == i || j == height - i + 1 ||
                            (j - i == 1 || j - i == 2) && i < 3 || (i - j == 1 || i - j == 2) && i > 4) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        if (height < 6) {
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

    public static void main(String[] args) {
        printHourglassOfGivenSize(3);
    }
}