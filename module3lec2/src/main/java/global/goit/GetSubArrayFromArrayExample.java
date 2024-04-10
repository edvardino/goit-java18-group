package global.goit;

import java.util.Arrays;

public class GetSubArrayFromArrayExample {

    // aa bb cc dd
    public static void main(String[] args) {

        System.out.println("Original array of args: " + Arrays.toString(args));

        String arg1 = args[1];
        String arg2 = args[2];

        String[] subArgs = {arg1, arg2};

        System.out.println(
                "All args, except 1st and last: " + Arrays.toString(subArgs)
        );
    }

}
