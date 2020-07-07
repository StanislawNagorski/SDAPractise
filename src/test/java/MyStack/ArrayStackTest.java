package MyStack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStackTest {
    private ArrayStack myArrayStack;

    @Before
    public void setUp(){
        myArrayStack = new ArrayStack();
    }

    @Test
    public void push() {
        //Given
        //When
        myArrayStack.push("Czy się dodałeś Stringu?");
        String expected = "Czy się dodałeś Stringu?";
        //Then
        Assert.assertEquals(expected,myArrayStack.stackData[0]);
    }

    @Test
    public void pop() throws Exception {
        //Given
        myArrayStack.push("Czy się dodałeś Stringu?");
        //When
        String expected = "Czy się dodałeś Stringu?";
        //Then
        Assert.assertEquals(expected, myArrayStack.pop());
    }

    @Test (expected = Exception.class)
    public void popShouldTrowExepectionWhenEmpty() throws Exception {
        //Given
        //When
        //Then
        myArrayStack.pop();
    }

    @Test
    public void peek() {
        //Given
        myArrayStack.push("Czy się dodałeś Stringu?");
        //When
        String expectedString = "Czy się dodałeś Stringu?";
        String result = myArrayStack.peek();
        //Then
        Assert.assertEquals(expectedString, result);
        assertTrue(myArrayStack.stackData.length > 0);
    }

    @Test
    public void isEmpty() {
        //Given
        myArrayStack.push("Czy się dodałeś Stringu?");
        //When

        //Then
        Assert.assertFalse(myArrayStack.isEmpty());
    }
    @Test
    public void isNOTEmpty() {
        //Given
        //When
        //Then
        Assert.assertTrue(myArrayStack.isEmpty());
    }

    @Test
    public void willExpend(){
        //Given
        for (int i = 0; i < 101; i++) {
            myArrayStack.push(String.valueOf(i));
        }
        myArrayStack.push("Czy przejdzie?");
        //When
        boolean expected = myArrayStack.stackData.length >= 100;
        //Then
        Assert.assertTrue(expected);
    }

    @Test
    public void willAddAfterExpend() throws Exception {
        //Given
        for (int i = 0; i < 103; i++) {
            myArrayStack.push(String.valueOf(i));
        }
        myArrayStack.push("Czy przejdzie?");
        //When
        String expected = "Czy przejdzie?";
        String result = myArrayStack.pop();
        //Then
        Assert.assertEquals(expected,result);
    }
}