package P03_ForLoop.Lab;

import java.util.Scanner;

public class P05_CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));

        }
    }
}
