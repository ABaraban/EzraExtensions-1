package speeding;

import support.cse131.ArgsProcessor;

public class SpeedLimit {
    public static void main(String[] args) {
        //Prompting human for # of sticks to start with//
        ArgsProcessor ap = new ArgsProcessor(args);
        int speedLimit = ap.nextInt("What was the speed limit?");
        int actualSpeed = ap.nextInt("How fast were you going?");
        int speedDifferential = actualSpeed - speedLimit;
        int addedFine = speedDifferential - 10;
        int fine = (speedDifferential < 10) ? 50 : 50 + (addedFine * 10);
        System.out.println("You reported a speed of " + actualSpeed + " MPH for a speed limit of " + speedLimit + "");
        System.out.println("You went " + speedDifferential + " over the speed limit.");
        System.out.println("Your fine is " + fine + " $.");
    }
}
