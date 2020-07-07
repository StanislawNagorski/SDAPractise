package thinkingHard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PractiseOneTest {
    PractiseOne po;
    @Before
    public void setUp(){
        po = new PractiseOne();
    }

    @Test
    public void shouldReturnSix(){
        //Given
        Integer[] test1 = {1, 4, 6, 23, 45, 2, 4, 1, 1};
        //When
        int result = po.checkForDuplicates(test1);
        int expected = 6;
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnMinusOne(){
        //Given
        Integer[] test1 = {1, 5, 8, 2, 4};
        //When
        int result = po.checkForDuplicates(test1);
        int expected = -1;
        //Then
        Assert.assertEquals(expected, result);
    }


}