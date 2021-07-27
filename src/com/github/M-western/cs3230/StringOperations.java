package com.github.M-western.cs3230;
import java.util.List;
import java.util.ArrayList;

public class StringOperations{
    public static List<Boolean> palindrome(List<String> foo){
        List<Boolean> answers = new ArrayList<Boolean>();
        for(int i = 0; i < foo.length; i++){
            Stringbuilder oof = new Stringbuilder();
            String foobar = foo.get(i);
            oof.append(foobar);
            oof.reverse();
            String raboof = oof.toString();
            if(foobar.equalsIgnorecase(raboof)){
                answers.add(true);
            } 
            else{
                answers.add(false);
            }
        }
        return answers;
    }
}