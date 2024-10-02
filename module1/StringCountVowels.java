package module1;
import java.util.Scanner;
public class StringCountVowels {
 public static void main(String[] args) {
   int vowel = 0;
   int consonant = 0;
   Scanner scn = new Scanner(System.in);
   System.out.print("Your String: ");
   String strng = scn.nextLine();
    strng = strng.toLowerCase();
   for (int s = 0; s < strng.length(); s++) 
   {
     if (strng.charAt(s) == 'a' || strng.charAt(s) == 'e' || strng.charAt(s) == 'i' || strng.charAt(s) == 'o'
         || strng.charAt(s) == 'u') {
       // Increments the vowel counter
       vowel++;
   } else if (strng.charAt(s) >= 'a' && strng.charAt(s) <= 'z') {
       consonant++;
     }
   }
   System.out.println("vowels: " + vowel);
   System.out.println("consonants: " + consonant);
   scn.close();
 }
}