package writing_programm_5;

public class SimpleDotCom {
    int[] locatonCells;
    int numOfHits = 0;

    public void setLocatonCells(int[] locs) {
        locatonCells = locs;
    }

    public String checkYouself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "����";
        for (int cell : locatonCells) {
            if (guess == cell) {
                result = "�����";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locatonCells.length) {
            result = "�������";
        }
        System.out.println(result);
        return result;
    }

}
