package P01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P02_RadiansToDegrees {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //четем от конзолата
        double radians = Double.parseDouble(scanner.nextLine());

        //преобразуваме радианите в градуси
        double degrees = radians * 180 /Math.PI;

        //принтираме на конзолата
        System.out.println(degrees);

    }
}
