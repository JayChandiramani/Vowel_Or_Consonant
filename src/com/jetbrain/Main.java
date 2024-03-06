package com.jetbrain;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	char alphabet;
	Scanner VC=new Scanner(System.in);

	//User Input
        System.out.println("Please enter an alphabet.");
        alphabet=VC.next().charAt(0);

    //Switch Case
        switch (alphabet) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println(alphabet + " is a vowel.");
            default -> System.out.println(alphabet + " is a consonant.");
        }
    }
}
