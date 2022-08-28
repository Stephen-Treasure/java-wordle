package wordle;

import org.json.JSONArray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        final String TEXT_RESET = "\u001B[0m";
        final String TEXT_GREEN = "\u001B[32m";
        final String TEXT_YELLOW = "\u001B[33m";

        String data = new String(Files.readAllBytes(Path.of("./word-list.json")));
        JSONArray jsonArray = new JSONArray(data);
        System.out.println(jsonArray);


        //*237
        int rand = (int) (Math.random() * 237);

        String wordle = (String) jsonArray.get(rand);

        System.out.println(wordle);

        Scanner sc = new Scanner(System.in);
        String guess = "";

        int counter = 0;
        System.out.println("Worlde\n");

        while (!guess.equals(wordle)) {

            guess = sc.nextLine();
            if (guess.length() > 5)
                guess = guess.substring(0, 5);

            if (wordle.contains(Character.toString(guess.charAt(0)))) {
                if (wordle.charAt(0) == guess.charAt(0)) {
                    System.out.print(TEXT_GREEN + guess.charAt(0) + TEXT_RESET);
                } else {
                    System.out.print(TEXT_YELLOW + guess.charAt(0) + TEXT_RESET);
                }
            } else {
                System.out.print(guess.charAt(0));
            }
            if (wordle.contains(Character.toString(guess.charAt(1)))) {
                if (wordle.charAt(1) == guess.charAt(1)) {
                    System.out.print(TEXT_GREEN + guess.charAt(1) + TEXT_RESET);
                } else {
                    System.out.print(TEXT_YELLOW + guess.charAt(1) + TEXT_RESET);
                }
            } else {
                System.out.print(guess.charAt(1));
            }
            if (wordle.contains(Character.toString(guess.charAt(2)))) {
                if (wordle.charAt(2) == guess.charAt(2)) {
                    System.out.print(TEXT_GREEN + guess.charAt(2) + TEXT_RESET);
                } else {
                    System.out.print(TEXT_YELLOW + guess.charAt(2) + TEXT_RESET);
                }
            } else {
                System.out.print(guess.charAt(2));
            }
            if (wordle.contains(Character.toString(guess.charAt(3)))) {
                if (wordle.charAt(3) == guess.charAt(3)) {
                    System.out.print(TEXT_GREEN + guess.charAt(3) + TEXT_RESET);
                } else {
                    System.out.print(TEXT_YELLOW + guess.charAt(3) + TEXT_RESET);
                }
            } else {
                System.out.print(guess.charAt(3));
            }
            if (wordle.contains(Character.toString(guess.charAt(4)))) {
                if (wordle.charAt(4) == guess.charAt(4)) {
                    System.out.print(TEXT_GREEN + guess.charAt(4) + TEXT_RESET);
                } else {
                    System.out.print(TEXT_YELLOW + guess.charAt(4) + TEXT_RESET);
                }
            } else {
                System.out.print(guess.charAt(4));
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
