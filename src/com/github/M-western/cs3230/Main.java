package com.github.M-western.cs3230;
import java.util.Arrays;
import java.util.List;

public class main{
    public static void main(String[] args){
        int argLength = args.Length;
        int[] fin = new Int[argLength];
        for(int i = 0; i < argLength; i++){
            fin[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Sum: " + sum(fin));
        System.out.println("Evens: " + evens(fin));
        System.out.println("Odds: " + odds(fin));
        System.out.println("Max: " + max(fin));
        System.out.println("Min: " + min(fin));
    }
    public static int sum(int[] arr){
        int count = arr[0] + 1;
        int total = 0;
        for(int i =1; i<count;i++){
            total += arr[i];
        }
        return total;
    }
    public static List evens(int[] arr){
        int count = arr[0] + 1;
        List<Integer> evensList = new ArrayList<Integer>();
        for(int i = 1; i<count;i++){
            if(arr[i] %2 ==0){
                evensList.add(arr[i]);
            }
        }
        return evensList;
    }
    public static List odds(int[] arr){
        int count = arr[0] + 1;
        List<Integer> oddsList = new ArrayList<Integer>();
        for(int i = 1; i<count;i++){
            if(arr[i] %2 !=0){
                oddsList.add(arr[i]);
            }
        }
        return oddsList;
    }
    public static int max(int[] arr){
        int count = arr[0] + 1;
        int max = arr[1];
        for(i = 1; i<count; i++){
            if(arr[i > max]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr){
        int count = arr[0] + 1;
        int min = arr[1];
        for(i = 1; i<count; i++){
            if(arr[i < min]){
                min = arr[i];
            }
        }
        return min;
    }
}