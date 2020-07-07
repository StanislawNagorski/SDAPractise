package SeazonCounter;

public class SeasonCounter {

    private static String[] SEASON_MARKS = {"11","12","21","22"};

    public static String addSeason(String inputSeason, int givenSeasonToAdd){

        if (givenSeasonToAdd == 0){
            return inputSeason;
        }

        int givenYear = Integer.parseInt(inputSeason.substring(0,4));
        String givenSeason = inputSeason.substring(4,6);

        int numberOfYearsToAdd = givenSeasonToAdd / 4;
        int numberOfSeasonToAdd = (givenSeasonToAdd % 4);

        int resultYear = givenYear + numberOfYearsToAdd;
        String resultYearString = String.valueOf(resultYear);

        if (numberOfSeasonToAdd==0){
            return resultYearString+givenSeason;
        } else {
            return resultYearString + SEASON_MARKS[numberOfSeasonToAdd];
        }
    }
}


