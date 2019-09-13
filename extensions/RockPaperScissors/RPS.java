package RockPaperScissors;

import support.cse131.ArgsProcessor;

public class RPS {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int numberRounds = ap.nextInt("How many rounds would you like to play");
        int counter = 1;
        int winsComputer = 0;
        int winsCycle = 0;
        for (int i=0;i <= numberRounds; ++i) {
            //Cycle move//
            int cycleMove = counter;
            counter = counter +1;
            if (counter ==4){
                counter = 1;
            }

            //random computer move//
            int compMove = (int)(Math.random()*3) + 1;
            System.out.println(compMove + "computer");
            System.out.println(cycleMove + "cycle");

            //Rock = 1 Paper = 2 Scissors = 3//
            if (compMove == cycleMove){
                System.out.println("tie");
            }
            if(compMove == 1 && cycleMove == 2){
                System.out.println("Computer loses");
                winsCycle = winsCycle +1;
            }
            if(compMove == 1 && cycleMove == 3){
                System.out.println("Computer Wins");
                winsComputer = winsComputer+1;
            }
            if(compMove == 2 && cycleMove == 1){
                System.out.println("Computer Wins");
                winsComputer = winsComputer+1;
            }
            if(compMove == 2 && cycleMove == 3){
                System.out.println("Computer loses");
                winsCycle = winsCycle +1;
            }
            if(compMove == 3 && cycleMove == 1){
                System.out.println("Computer loses");
                winsCycle = winsCycle +1;
            }
            if(compMove == 3 && cycleMove == 2){
                System.out.println("Computer Wins");
                winsComputer = winsComputer+1;
            }







        }
        double cycleWins = (double)winsCycle/numberRounds*100;
        double computerWins = (double)winsComputer/numberRounds*100;
        System.out.println(winsComputer);
        System.out.println(winsCycle);
        System.out.println("Cycle Win Percentage " + cycleWins + " %");
        System.out.println("Computer Win Percentage " + computerWins + " %");




    }
}


