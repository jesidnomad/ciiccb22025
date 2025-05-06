package otherFolder.tcoders;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner wordInput = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String wordStringChecker = wordInput.nextLine();

      
        StringBuilder sb = new StringBuilder(wordStringChecker);
        String wordStringRev = sb.reverse().toString();

      
        System.out.println(wordStringChecker.equals(wordStringRev) ? "Palindrome" : "Not");
    }
}
