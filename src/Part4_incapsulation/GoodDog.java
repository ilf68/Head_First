package Part4_incapsulation;

public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    void bark(){
        if (size > 60) {
            System.out.println("��� ���");
        } else if (size > 14) {
            System.out.println("��� ���");
        } else  {
            System.out.println("��� ���");
        }
    }
}
class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("������ ������ " + one.getSize() + "��");
        System.out.println("������ ������ " + two.getSize() + "��");
        one.bark();
        two.bark();
    }
}