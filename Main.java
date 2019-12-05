package com.xunsheng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static String string;

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter a String : ");
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();
        List<Character> vowel = new ArrayList<Character>();
        List<Character>consonant = new ArrayList<Character>();
        check(string, vowel, consonant);
        System.out.println("Input: " + string);
        System.out.println("Output: " );
        Object[] vowelArray = vowel.toArray();
        Object[] consonantArray = consonant.toArray();
        System.out.println("Vowel " + Arrays.toString(vowelArray));
        System.out.println("Consonant " + Arrays.toString(consonantArray));

    }

    public static void check(String string, List<Character> vowel, List<Character> consonant){
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i = 0 ; i < string.length(); i++){
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u' ||
                    string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U'){

                vowel.add(string.charAt(i)) ;
            }
            else if (Character.isDigit(string.charAt(i))){

            }
            else if (string.charAt(i) == ' '){

            }
            else{
                consonant.add(string.charAt(i));
            }
        }

    }
}
