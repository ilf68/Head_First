package part6;
import  java.util.*;
public class DotCom {
    private ArrayList<String> locatonCells;
    private String name;

    public void setLocatonCells(ArrayList<String> loc) {

        locatonCells = loc;
    }
    public  void setName(String n) {
        name = n;
    }
    public String checkYourself(String userInput) {
        String result = "����";
        int index = locatonCells.indexOf(userInput);
        if (index >= 0) {
            locatonCells.remove(index);
            if(locatonCells.isEmpty()) {
                result = "�������";
                System.out.println("��! �� ��������" + name + " :( ");
            } else {
                result = "�����";
            }
        }

        return result;
    }

}
