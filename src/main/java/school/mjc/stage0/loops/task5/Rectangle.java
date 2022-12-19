package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        if (length == 0 || height == 0) {
            return;
        }
        if (length < height) {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < length; j++) {
                    if (i > 0 && i < length) {
                        if (j > 0 && j < length - 1) {
                            System.out.print(" ");
                            continue;
                        }
                    }
                    System.out.print(8);
                }
                System.out.println();
            }
            return;
        }

        if (length > height) {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < length; j++) {
                    if (i > 0 && i < height - 1) {
                        if (j > 0 && j < length - 1) {
                            System.out.print(" ");
                            continue;
                        }
                    }
                    System.out.print(8);
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    if (i > 0 && i < length - 1) {
                        if (j > 0 && j < length - 1) {
                            System.out.print(" ");
                            continue;
                        }
                    }
                    System.out.print(8);
                }
                System.out.println();
            }
        }
    }
}

