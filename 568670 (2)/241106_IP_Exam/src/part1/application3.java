import nl.saxion.app.SaxionApp;

import java.util.ArrayList;
import java.util.Arrays;

public class ExamQuestions implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new ExamQuestions(), 1000, 500);
    }

    @Override
    public void run() {
        // 1. Calculate Discounted Price
        SaxionApp.printLine("calculateDiscountedPrice(100, 20) = " + calculateDiscountedPrice(100, 20));
        SaxionApp.printLine("calculateDiscountedPrice(50, 10) = " + calculateDiscountedPrice(50, 10));

        SaxionApp.printLine();

        // 2. Convert Fahrenheit to Celsius
        SaxionApp.printLine("convertFahrenheitToCelsius(32) = " + convertFahrenheitToCelsius(32));
        SaxionApp.printLine("convertFahrenheitToCelsius(212) = " + convertFahrenheitToCelsius(212));

        SaxionApp.printLine();

        // 3. Find the Minimum of Three Numbers
        SaxionApp.printLine("minOf3Numbers(3, 7, 5) = " + minOf3Numbers(3, 7, 5));
        SaxionApp.printLine("minOf3Numbers(-10, -5, -20) = " + minOf3Numbers(-10, -5, -20));

        SaxionApp.printLine();

        // 4. Remove the Shortest Word from a List
        ArrayList<String> words = new ArrayList<>(Arrays.asList("cat", "elephant", "dog"));
        SaxionApp.printLine("removeShortestWord(" + words + ") = " + removeShortestWord(words));

        SaxionApp.printLine();

        // 5. Reverse the Characters in a String
        SaxionApp.printLine("reverseString(\"hello\") = " + reverseString("hello"));
        SaxionApp.printLine("reverseString(\"Java\") = " + reverseString("Java"));

        SaxionApp.printLine();

        // 6. Interleave Two Arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        SaxionApp.printLine("interleaveArrays([1, 2, 3], [4, 5, 6]) = " + Arrays.toString(interleaveArrays(array1, array2)));

        SaxionApp.printLine();

        // 7. Calculate Factorial
        SaxionApp.printLine("calculateFactorial(5) = " + calculateFactorial(5));
        SaxionApp.printLine("calculateFactorial(0) = " + calculateFactorial(0));

        SaxionApp.printLine();

        // 8. Check for Palindrome
        SaxionApp.printLine("isPalindrome(\"madam\") = " + isPalindrome("madam"));
        SaxionApp.printLine("isPalindrome(\"hello\") = " + isPalindrome("hello"));

        SaxionApp.printLine();

        // 9. Count Vowels in a String
        SaxionApp.printLine("countVowels(\"Hello\") = " + countVowels("Hello"));
        SaxionApp.printLine("countVowels(\"Java\") = " + countVowels("Java"));

        SaxionApp.printLine();

        // 10. Find the Second Largest Number in an Array
        int[] numbers = {1, 5, 3, 7, 5};
        SaxionApp.printLine("findSecondLargest([1, 5, 3, 7, 5]) = " + findSecondLargest(numbers));
    }

    // 1. Calculate Discounted Price
    double calculateDiscountedPrice(double price, double discountPercentage) {
        double newPrice = price * (1-discountPercentage/100);
        return newPrice;
    }

    // 2. Convert Fahrenheit to Celsius
    double convertFahrenheitToCelsius(int tempInFahrenheit) {
        double convertFahrenheit = (tempInFahrenheit - 32) * 5 / 9;
        return convertFahrenheit;
    }

    // 3. Find the Minimum of Three Numbers
    int minOf3Numbers(int number1, int number2, int number3) {
        if (number1 < number2&&number1 < number3) {
            return number1;
        }else if (number2 < number1&&number2 < number3) {
            return number2;
        }else return number3;
    }

    // 4. Remove the Shortest Word from a List
    ArrayList<String> removeShortestWord(ArrayList<String> words) {
        int shortIndexword = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() < words.get(shortIndexword).length()) ;
            shortIndexword = i;
        }
           words.remove(shortIndexword);
        return words;
    }

    // 5. Reverse the Characters in a String
    String reverseString(String input) {
        String reversedString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString += input.charAt(i);
        }
        return reversedString;
    }

    // 6. Interleave Two Arrays
    int[] interleaveArrays(int[] array1, int[] array2) {
        // Your co
        return new int[0];
    }

    // 7. Calculate Factorial
    long calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // 8. Check for Palindrome
    boolean isPalindrome(String input) {

        return false;
    }

    // 9. Count Vowels in a String
    int countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            ch = Character.toLowerCase(ch);
            if (ch == 'a'|| ch =='o' || ch =='u'|| ch =='i' || ch =='e');
        } count ++;
        return count;
    }

    // 10. Find the Second Largest Number in an Array
    int findSecondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];

            }
        } else if (numbers[0] > largest) {
            largest = numbers[0];
        }
        return secondLargest;
    }
}
