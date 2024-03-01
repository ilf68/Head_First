package writing_programm_5;

public class SimpleDotComGame {
    public static void main (String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int x = (int)( Math.random() * 7 );
        int [] locations =  {x, x+1, x+2};
        theDotCom.setLocatonCells(locations);
        boolean iaAlive = true;

        while (iaAlive == true) {
            String guess = helper.getUserInput("������� ����� �� 0 �� 9");
            String result = theDotCom.checkYouself(guess);
            numOfGuesses++;
            if (result.equals("�������")) {
                iaAlive = false;
                if (numOfGuesses < 5) {
                    System.out.println("��� ������������� " + numOfGuesses + " �������");
                } else {
                    System.out.println("��� ������������� " + numOfGuesses + " �������");
                }
            }
        }

    }
}
