package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    //TODO:
    // Write unit tests to find the errors in BalancedBrackets.
    //  a. The tests you write should guide how you revise the sourcecode.
    //      Use TDD to first write tests that will work for the desired behavior of BalancedBrackets.
    //      When your tests fail, correct the class to pass your tests.
    //  b. The content of your tests is up to you, but you should write at least 12 tests.
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }

    //region True Cases
    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void completeBracketsWithFullWord(){ assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]")); }

    @Test
    public void completeBracketsSplitWord(){ assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]")); }

    @Test
    public void completeBracketsBeforeWord(){ assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode")); }

    @Test
    public void emptyStringNoBrackets(){ assertTrue(BalancedBrackets.hasBalancedBrackets("")); }

    @Test
    public void completeDoubleBrackets(){assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));}
    //endregion

    //region False Cases
    @Test
    public void incompleteOpeningBracket(){ assertFalse(BalancedBrackets.hasBalancedBrackets("[")); }

    @Test
    public void incompleteClosingBracket(){ assertFalse(BalancedBrackets.hasBalancedBrackets("]")); }

    @Test
    public void incompleteReversedOrderBracket(){ assertFalse(BalancedBrackets.hasBalancedBrackets("][")); }

    @Test
    public void incompleteReversedOrderWithWord(){ assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code[")); }

    @Test
    public void incompleteDoubleReverseBrackets(){ assertFalse(BalancedBrackets.hasBalancedBrackets("][][")); }
    //endregion

}
