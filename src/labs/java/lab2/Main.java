package lab2;

import java.util.Objects;
import java.util.Random;

public class Main {
    private static final int MIN_WIDTH = 2;
    private static final int MIN_HEIGHT = 2;
    private static final int MAX_WIDTH = 20;
    private static final int MAX_HEIGHT = 20;

    public static void main(String[] args) {
        System.out.println("Оберить спосіб створення матриці:");
        System.out.println("0 - випадкове створення");
        System.out.println("1 - вручну");

        var scanner = new Scanner();
        var userInput = scanner.scanUserInput();
        var random = new Random();
        int width, height;
        int[][] matrix;

        if (Objects.equals(userInput, "0")) {
            width = random.nextInt(MAX_WIDTH - MIN_WIDTH + 1) + MIN_WIDTH;
            height = random.nextInt(MAX_HEIGHT - MIN_HEIGHT + 1) + MIN_HEIGHT;

            matrix = createMatrix(width, height);
        }
        else if (Objects.equals(userInput, "1")) {

            System.out.println("Введіть ширину:");
            width = Integer.parseInt(scanner.scanUserInput());

            System.out.println("Введіть висоту:");
            height = Integer.parseInt(scanner.scanUserInput());

            matrix = createMatrix(width, height);
        }
        else {
            System.out.println("Ви вибрали неіснуючу опцію.");
            return;
        }

        System.out.println("Матриця " + width + "x" + height + ":");
        outputMatrix(matrix, width, height);

        System.out.println("мін: " + getMinValue(matrix, width, height));
        System.out.println("макс: " + getMaxValue(matrix, width, height));
        System.out.println("середнє: " + getMeanValue(matrix, width, height));
    }

    private static void outputMatrix(int[][] matrix, int width, int height) {
        for (int i = 0; i < height; i++) {
            System.out.println();

            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        System.out.println();
    }

    private static int[][] createMatrix(int width, int height) {
        var matrix = new int[height][width];
        var random = new Random();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        return matrix;
    }

    private static int getMinValue(int[][] matrix, int width, int height) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                var item = matrix[i][j];

                if (item < min) {
                    min = item;
                }
            }
        }

        return min;
    }

    private static int getMaxValue(int[][] matrix, int width, int height) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                var item = matrix[i][j];

                if (item > max) {
                    max = item;
                }
            }
        }

        return max;
    }

    private static int getMeanValue(int[][] matrix, int width, int height) {
        var totalLength = height * width;
        int sum = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sum += matrix[i][j];
            }
        }

        return sum / totalLength;
    }
}