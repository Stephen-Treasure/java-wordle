package wordle;

import java.io.IOException;
import java.util.Scanner;

public class Game {


    public static void guessingGame() throws IOException {

        final String TEXT_RESET = "\u001B[0m";
        final String TEXT_GREEN = "\u001B[32m";
        final String TEXT_YELLOW = "\u001B[33m";

        String wordle=  Word.Word();

        Scanner sc = new Scanner(System.in);
        String guess = "";

        int counter = 0;
        System.out.println("Worlde\n" +
                "The game has begun, please type a 5 letter word and press enter\n");
        while (!guess.equals(wordle)) {

            guess = sc.nextLine();
            if (guess.length() > 5)
                guess = guess.substring(0, 5);


            for(int i = 0; i < wordle.length(); i++){
                if (wordle.contains(Character.toString(guess.charAt(i)))) {
                    if (wordle.charAt(i) == guess.charAt(i)) {
                        System.out.print(TEXT_GREEN + guess.charAt(i) + TEXT_RESET);
                    } else {
                        System.out.print(TEXT_YELLOW + guess.charAt(i) + TEXT_RESET);
                    }
                } else {
                    System.out.print(guess.charAt(i));
                }

            }
            System.out.println();
            if (guess.equals(wordle)) {
                System.out.println("Congratulations you got the right answer!");
            }
            counter++;
            if (counter == 6) {
                System.out.println("ooo sorry you didnt get it, the answer was: " + wordle);
                break;
            }
        }
    }
}
