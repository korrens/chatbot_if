package korens;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello there!");
        boolean running = true;
        while (running == true) {
            System.out.println(" ");
            String answer = input.nextLine();
            if (answer.equals("Hi")) {
                System.out.println("Hello! How you feeling now?");
            } else if (answer.equals("Fine")) {
                System.out.println("Glad to hear! Want to hear a joke to make your mood even better?");
            } else if (answer.equals("Yes")) {
                System.out.println("What's the best thing about Switzerland? I don't know, but the flag is a big plus! \n Hope I made you smile, bye!");
            } else if (answer.equals("Bye")) {
                System.out.println("Have a nice day!");
            } else {
                System.out.println("Sorry! I am new to this and I didn't understand you. Try to ask me in a different way!");
            }
        }
    }
}