package P03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        //преобразуваме всичко в минуту
        //проверяваме дали е пристигнал на време
        //

        int sumMinutesExam = hourExam * 60 + minutesExam;
        int sumMinutesArrival = hourArrival * 60 + minutesArrival;

        int difference = Math.abs(sumMinutesArrival - sumMinutesExam);

        if(sumMinutesArrival > sumMinutesExam){
            System.out.println("Late");
            if(difference<60){
                System.out.printf("%d minutes after the start", difference);
            }else{
                int hours = difference / 60;
                int minutes = difference % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        }else if (difference <= 30){
            System.out.println("On time");
            if (sumMinutesArrival != sumMinutesExam){
                System.out.printf("%d minutes before the start", difference);
            }
        }else{
            System.out.println("Early");
            int hours = difference / 60;
            int minutes = difference % 60;

            if(difference < 60){
                System.out.printf("%d minutes before the start", difference);
            }else{
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        }


    }
}
