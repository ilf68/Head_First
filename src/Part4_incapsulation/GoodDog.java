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
            System.out.println("Гав Гав");
        } else if (size > 14) {
            System.out.println("Вуф Вуф");
        } else  {
            System.out.println("Тяф Тяф");
        }
    }
}
class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Первая собака " + one.getSize() + "кг");
        System.out.println("Вторая собака " + two.getSize() + "кг");
        one.bark();
        two.bark();
    }
}