package writing_programm_5;


public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int locations [] = {2, 3, 4};
        dot.setLocatonCells(locations);
        String userGuess = "5";
        String result = dot.checkYouself(userGuess);
        }
    }
