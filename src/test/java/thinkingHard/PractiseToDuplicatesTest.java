package thinkingHard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PractiseToDuplicatesTest {
    PractiseToDuplicates po;
    @Before
    public void setUp(){
        po = new PractiseToDuplicates();
    }

    @Test
    public void shouldReturnEight(){
        //Given
        Integer[] test1 = {1, 4, 6, 23, 45, 2, 4, 1, 1};
        Integer occuranceOfDuplicates = 3;
        //When
        int result = po.checkForNTimesDuplicates(test1, occuranceOfDuplicates);
        int expected = 8;
        //Then
        Assert.assertEquals(expected, result);
    }
    @Test
    public void shouldReturnSix(){
        //Given
        Integer[] test1 = {1, 2, 2, 1, 3, 3, 2, 1, 1};
        Integer occuranceOfDuplicates = 3;
        //When
        int result = po.checkForNTimesDuplicates(test1, occuranceOfDuplicates);
        int expected = 6;
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnMinusOne(){
        //Given
        Integer[] test1 = {1, 5, 8, 2, 4};
        Integer occuranceOfDuplicates = 1;
        //When
        int result = po.checkForNTimesDuplicates(test1, occuranceOfDuplicates);
        int expected = -1;
        //Then
        Assert.assertEquals(expected, result);
    }

}