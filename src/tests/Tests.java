package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import patterns.SingletonPattern.SingletonClasseChallenge;


public class Tests {

    @Test
    public void test(){
        SingletonClasseChallenge challange1 = SingletonClasseChallenge.getInstance();
        SingletonClasseChallenge challange2 = SingletonClasseChallenge.getInstance(2);


        assertEquals(challange1, challange2);
        assertEquals(challange1.challenge(5), challange2.challenge(5));


    }


}