//1. Write a program to print the frequency of each character in a String.


import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "example string"; // You can change this to any string you want to analyze
        printCharacterFrequency(input);
    }

    public static void printCharacterFrequency(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }

        for (char c : frequencyMap.keySet()) {
            System.out.println(c + ": " + frequencyMap.get(c));
        }
    }
}

