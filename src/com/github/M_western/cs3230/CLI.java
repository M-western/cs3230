package src.com.github.M_western.cs3230;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CLI{


public static Scanner myScan = new Scanner(System.in);

    public static int getUserInput(){
        String userString = myScan.next();
        int i = 0;
        try{
            i = Integer.parseInt(userString);
        }
        catch(NumberFormatException ex){
            System.out.println("Invalid input: " + userString);
        }
        myScan.nextLine();
        return i;
    }

    public static int[] getNewNumbers(){
        System.out.println("Enter a list of numbers seperated by a space:");
        String[] userInts = myScan.nextLine().split("\\s+");
        int[] nums = new int[userInts.length];
        for(int i = 0; i <userInts.length; i++){
            try{
                nums[i] = Integer.parseInt(userInts[i]);
            }
            catch(NumberFormatException ex){
                System.out.println("Invalid number:" + userInts[i]);
            }
        }
        return nums;
    }

    public static List<String> getStrings(){
        System.out.println("Enter a list of strings seperate by spaces, no commas:");
        String[] inputString = myScan.nextLine().split("\\s+");
        List<String> userStrings = new ArrayList<String>(Arrays.asList(inputString));
        return userStrings;
    }
}