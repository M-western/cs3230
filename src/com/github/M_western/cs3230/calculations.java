package src.com.github.M_western.cs3230;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class calculations{
    public static int sum(int[] arr){
        int total = 0;
        for(int i =0; i<arr.length;i++){
            total += arr[i];
        }
        return total;
    }
    public static List evens(int[] arr){
        List<Integer> evensList = new ArrayList<Integer>();
        for(int i = 0; i<arr.length;i++){
            if(arr[i] %2 ==0){
                evensList.add(arr[i]);
            }
        }
        return evensList;
    }
    public static List odds(int[] arr){
        List<Integer> oddsList = new ArrayList<Integer>();
        for(int i = 0; i<arr.length;i++){
            if(arr[i] %2 !=0){
                oddsList.add(arr[i]);
            }
        }
        return oddsList;
    }
    public static int max(int[] arr){
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr){
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

   
}