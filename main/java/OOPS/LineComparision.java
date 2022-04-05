package OOPS;
import java.util.Scanner;

public class LineComparision {
    public static double lengthCalc(double x1, double y1, double x2, double y2) {
        double length = Math.sqrt(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        return length;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to line comparision program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1, y1 and x2, y2");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double length = lengthCalc(x1, y1, x2, y2);
        System.out.println(length);
    }
}