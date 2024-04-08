package global.goit;

public class CircumflexLogicalOperatorExample {
    public static void main(String[] args) {

        // оператор ^ (XOR) для boolean змінних
        System.out.println("true ^ true = " + (true ^ true));
        System.out.println("false ^ false = " + (false ^ false));
        System.out.println("true ^ false = " + (true ^ false));
        System.out.println("false ^ true = " + (false ^ true));


        // оператор ^ (XOR) для int змінних
        System.out.println();
        System.out.println("Encrypting value 138...");
        int encryptionKey = 7;
        int encryptedValue = 138 ^ encryptionKey;
        System.out.println("Encrypted value: " + encryptedValue);

        int decryptedValue = encryptedValue ^ encryptionKey;
        System.out.println("Decrypted value: " + decryptedValue);
        System.out.println("Decrypted value with incorrect Key: " + (encryptedValue ^ 2));
    }
}