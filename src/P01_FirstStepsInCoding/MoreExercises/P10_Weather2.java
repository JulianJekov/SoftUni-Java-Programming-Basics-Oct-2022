package P01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P10_Weather2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degree = Double.parseDouble(scanner.nextLine());

        if (degree < 5) {
            System.out.println("unknown");
        } else if (degree <= 11.9) {
            System.out.println("Cold");
        } else if (degree <= 14.9) {
            System.out.println("Cool");
        } else if (degree <= 20) {
            System.out.println("Mild");
        } else if (degree <= 25.9) {
            System.out.println("Warm");
        } else if (degree <=35.00){
            System.out.println("Hot");
        }else{
            System.out.println("unknown");
        }

        }
    }
