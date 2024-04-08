package global.goit;

public class TernaryOperatorExample {

    /**
     * This program calculates your bus fare for this ride. It expects
     * two arguments. The first one, your age. The second one, the discount
     * in percents if any (zero if you are not eligible for a discount).
     *
     * @param args the arguments for this program to work with.
     */
    public static void main(String[] args) {

        int passengerAge = Integer.parseInt(args[0]);
        int discountPercents = Integer.parseInt(args[1]);

        boolean passengerIsChild = passengerAge < 12;
        String message = passengerIsChild ? "You are a child, you ride for free"
                : "Your fare is %.2f usd";

        if (passengerIsChild) {
            System.out.println(message);
            return;
        }

        float baseFare = 5F;
        float passengerFare = baseFare * (100 - discountPercents) / 100;

        System.out.printf(message, passengerFare);
    }

}
