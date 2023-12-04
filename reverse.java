import java.util.Scanner;


public class reverse {

    private static String normal = "";
    private static String reversed = "";
    public static void main (String[] args) {

        System.out.print("Enter string to reverse: ");
        Scanner scanner = new Scanner(System.in);


        // take in input for original normal string using scanner
        normal = scanner.nextLine();


        // reverse the string by running through the original one character at a time
        for (int i = 0; i < normal.length(); i++){
            reversed = normal.charAt(i) + reversed;
        }

        // output the reversed string
        System.out.println("String reversed: "+ reversed);

        scanner.close();



    }
}