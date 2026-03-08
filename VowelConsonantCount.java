import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

-------------------------------------------------------------------------



public class CountVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;

        str = str.toLowerCase();  // convert to lowercase

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}


---------------------------------------------------------------------------

Remove Duplicate Characters : 

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char c : str.toCharArray()) {
            set.add(c);
        }

        for(char c : set) {
            System.out.print(c);
        }
    }
}
