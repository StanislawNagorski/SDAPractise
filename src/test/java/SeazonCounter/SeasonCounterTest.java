package SeazonCounter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeasonCounterTest {

    @Test
    public void shouldReturnCurrentSeason(){
        //Given
        String season = "201911";
        int numberOfSeasonsToAdd = 0;

        //When
        String expected = "201911";
        String result = SeasonCounter.addSeason(season, numberOfSeasonsToAdd);

        //Then
        Assert.assertEquals(expected, result);
    }

    //addSeason("202012", 1) ----> "202021" (+ 1 to następny seson)

    @Test
    public void shouldReturnNextSeason(){
        //Given
        String season = "201911";
        int numberOfSeasonsToAdd = 1;

        //When
        String expected = "201912";
        String result = SeasonCounter.addSeason(season, numberOfSeasonsToAdd);

        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnTwoNextSeason(){
        //Given
        String season = "201911";
        int numberOfSeasonsToAdd = 2;

        //When
        String expected = "201921";
        String result = SeasonCounter.addSeason(season, numberOfSeasonsToAdd);

        //Then
        Assert.assertEquals(expected, result);
    }

    //addSeason("201821", 2) ----> "201911"

    @Test
    public void shouldReturnNextYearSameSeason(){
        //Given
        String season = "201911";
        int numberOfSeasonsToAdd = 4;

        //When
        String expected = "202011";
        String result = SeasonCounter.addSeason(season, numberOfSeasonsToAdd);

        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnNextYearNextSeason(){
        //Given
        String season = "201911";
        int numberOfSeasonsToAdd = 5;

        //When
        String expected = "202012";
        String result = SeasonCounter.addSeason(season, numberOfSeasonsToAdd);

        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnNextTenYearsNextSeason(){
        //Given
        String season = "201911";
        int numberOfSeasonsToAdd = 41;

        //When
        String expected = "202912";
        String result = SeasonCounter.addSeason(season, numberOfSeasonsToAdd);

        //Then
        Assert.assertEquals(expected, result);
    }

}