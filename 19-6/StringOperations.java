package com.mycompany.mavenproject4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringOperations {

    public String findDuplicates(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.append(entry.getKey()).append(" ");
            }
        }

        return result.toString().trim();
    }

    public String removeSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }

    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringOperations obj = new StringOperations();

        while (true) {

            System.out.println("\n1. Find Duplicate Characters");
            System.out.println("2. Remove Spaces");
            System.out.println("3. Reverse String");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter String: ");
                    String s1 = sc.nextLine();
                    System.out.println("Duplicates: "
                            + obj.findDuplicates(s1));
                    break;

                case 2:
                    System.out.print("Enter String: ");
                    String s2 = sc.nextLine();
                    System.out.println("Result: "
                            + obj.removeSpaces(s2));
                    break;

                case 3:
                    System.out.print("Enter String: ");
                    String s3 = sc.nextLine();
                    System.out.println("Reversed: "
                            + obj.reverseString(s3));
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}