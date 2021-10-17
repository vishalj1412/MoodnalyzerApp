package org.exceptions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    //method for mood test
    @Test
    public void MoodTest(){
        //create object of class
            MoodAnalyzer analyzemood=new MoodAnalyzer();
            //pass the message
            String moodreturn=analyzemood.analyzeMood("i am sad");
            //check test case is true or false
          Assert.assertEquals("sad",moodreturn);
          System.out.println(moodreturn);

        }
}
