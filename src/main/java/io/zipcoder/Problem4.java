package io.zipcoder;

import java.util.HashMap;

public class Problem4 {

    public HashMap<Character,Integer> getMapOfCharacterAndAppearance(String str){
        HashMap<Character,Integer> appearanceMap = new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++){
            Character currentCharacter = str.charAt(i);
            if(appearanceMap.containsKey(currentCharacter)){
                appearanceMap.put(currentCharacter,appearanceMap.get(currentCharacter)+1);
            }else{
                appearanceMap.put(currentCharacter,1);
            }
        }
        return appearanceMap;
    }

    public String canStringBePalindrome(String str){
        int numberOfCharactersWithOddNumberAppearances = 0;
        for(Integer currentValue : getMapOfCharacterAndAppearance(str).values()){
            if(currentValue % 2 != 0){
                numberOfCharactersWithOddNumberAppearances ++;
            }
        }
        //if more then 1 character has an odd number of appearance the string can not be a palindrome
        return numberOfCharactersWithOddNumberAppearances > 1 ? "NO" : "YES";
    }
}
