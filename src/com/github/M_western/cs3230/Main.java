package src.com.github.M_western.cs3230;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class Main{

    public static void main(String[] args){
        
        while(true){

            boolean math = false;
            boolean stringMenu = false;
        
            System.out.println("Matt Western Assignment 3");
            System.out.println("Main Menu");
            System.out.println("1. Math Menu");
            System.out.println("2. String Menu");
            System.out.println("3. Exit");
            int menuInput = CLI.getUserInput();
            switch(menuInput){
                case 1:
                    math = true;
                    break;
                case 2:
                    stringMenu = true;
                    break;
                default:
                    System.exit(0);
            }

        while(math){
            int[] nums = CLI.getNewNumbers();
            System.out.println("1. Update");
            System.out.println("2. Sum");
            System.out.println("3. Even");
            System.out.println("4. Odd");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("7. Exit");
            int userInput = CLI.getUserInput();
            switch(userInput){
                case 1:
                    System.out.println("Selected: 1");
                    nums = CLI.getNewNumbers();
                    break;
                case 2:
                    System.out.println("Selected: 2");
                    System.out.println(calculations.sum(nums));
                    break;
                case 3:
                System.out.println("Selected:3");
                    System.out.println(calculations.evens(nums));
                    break;
                case 4:
                System.out.println("Selected:4");
                    System.out.println(calculations.odds(nums));
                    break;
                case 5:
                System.out.println("Selected:5");
                    System.out.println(calculations.max(nums));
                    break;
                case 6:
                System.out.println("Selected:6");
                    System.out.println(calculations.min(nums));
                    break;
                default:
                    math = false;
                    break;
            }
        }
        List<String> stringList;
        while(stringMenu){
            System.out.println("1. Palindrome");
            System.out.println("2. Main Menu");
            System.out.println("3. Exit");
            int stringNums = CLI.getUserInput();
            switch(stringNums){
                case 1:
                    stringList = CLI.getStrings();
                    System.out.println(StringOperations.palindrome(stringList));
                    break;
                case 2:
                    stringMenu = false;
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
}