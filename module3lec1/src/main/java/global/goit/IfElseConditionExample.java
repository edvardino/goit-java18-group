package global.goit;

public class IfElseConditionExample {

    /**
     * This program calculates whether you can cross a street or no.
     * It expects three arguments. First one, the total number of seconds the green
     * lights for pedestrians are on. The second, boolean argument that says whether
     * the green lights for pedestrians are on at the moment. The third, the number
     * of seconds the green lights will be on at the moment of a decision to be made.
     *
     * @param args the arguments for this program to work with.
     */
    public static void main(String[] args) {
        
//        int greenLightsSecondsTotal = Integer.parseInt(args[0]);
//        boolean pedestrianLightsAreGreen = Boolean.parseBoolean(args[1]);
//        int greenLightsSecondsLeft = Integer.parseInt(args[2]);

        int greenLightsSecondsTotal = 30;
        boolean pedestrianLightsAreGreen = true;
        int greenLightsSecondsLeft = 25;
        // enough time means that you have more than 70% of the total time
        boolean enoughTimeToCross = (greenLightsSecondsLeft * 100 / greenLightsSecondsTotal) > 70;
        boolean shouldWeCrossStreet = pedestrianLightsAreGreen && enoughTimeToCross;

        if (shouldWeCrossStreet) {
            System.out.println("We are crossing the street!");
        } else {
            System.out.println("We are waiting for the next green lights for pedestrians to cross!");
        }

    }

}
