package RockPaperScissors;

import support.cse131.ArgsProcessor;

public class RPS {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int numberRounds = ap.nextInt("How many rounds would you like to play");
        int i = 0;
        while (i <= numberRounds) {
            int firstMove = ap.nextInt("Rock Paper or Scissors");
            int secondMove = ap.nextInt("Rock Paper or Scissors");

        }
    }
}

