package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BonusBalancedBracketsTest {
    //TODO: Figure out how to do this with dynamic array?
    int[] numArr = { 2, 3, 4, 10, 40 };

    @Test
    public void testForZeroIndex(){
        assertEquals(0, BonusBinarySearch.binarySearch(numArr, 2));
    }

    @Test
    public void testForFirstIndex(){
        assertEquals(1, BonusBinarySearch.binarySearch(numArr, 3));
    }

    @Test
    public void testForSecondIndex(){
        assertEquals(2, BonusBinarySearch.binarySearch(numArr, 4));
    }

    @Test
    public void testForThirdIndex(){
        assertEquals(3, BonusBinarySearch.binarySearch(numArr, 10));
    }

    @Test
    public void testForLastIndex(){
        assertEquals(numArr.length -1, BonusBinarySearch.binarySearch(numArr, 40));
    }
}
