import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     //   tersine cevirmek
        String original = "Salam necesen?";

        int stringLength = original.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = original.charAt(i) + result;
        }
        System.out.println(result);


        //    Polindrom
        String text = "rada";

        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        System.out.println((reverse.toString()).equals(clean));







    }
}




