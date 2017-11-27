package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem4Test {
    Problem4 problem4 = new Problem4();

    @Test
    public void createMapTest(){
        String expected = "{a=4, b=2}";
        String actual = problem4.getMapOfCharacterAndAppearance("aabbaa").toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkIfStringCanBePalindrome1Test(){
        String testString = "aaabbbb";
        String expected = "YES";

        String actual = problem4.canStringBePalindrome(testString);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkIfStringCanBePalindrome2Test(){
        String testString = "cdefghmnopqrstuvw";
        String expected = "NO";

        String actual = problem4.canStringBePalindrome(testString);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkIfStringCanBePalindrome3Test(){
        String testString = "cdcdcdcdeeeef";
        String expected = "YES";

        String actual = problem4.canStringBePalindrome(testString);

        Assert.assertEquals(expected,actual);
    }
}
