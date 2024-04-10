package global.goit;

public class TakeLastArrayElementExample {


    /**
     * Ця програма демонструє як ми можемо отримати останній
     * елемент списку з невідомим розміром.
     *
     * @param args аргументи програми, кількість елементів невідома.
     */
    public static void main(String[] args) {

        int argsSize = args.length;

        String lastArgument = args[argsSize - 1];

        System.out.println("Last element in the arguments array: " + lastArgument);

    }

}
