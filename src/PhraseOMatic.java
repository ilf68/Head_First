public class PhraseOMatic {
    public static void main(String[] args){
        String[] wordListOne = {"Ккруглосуточный","трёхзвенный","3000-футовый","взаимный","обоюдный выигрыш",
                "фронтэнд","на основе WEB","проникающий","умный","шесть сигм","метод критического пути","динамичный",
                "партийный"};
        String[] wordListTwo = {"уполномоченный","трудный","чистый продукт","ориентированный","центральный",
                "распределённый","кластеризированный","фирменный","нестандартный ум","позиционированный","сетевой",
                "сфокусированный","общий"};
        String[] wordListThree = {"процесс","пункт разгрузки","выход из положения","тип структуры",
                "талант","подход","уровень завоеванного внимания","портал","обзор"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Всё, что нам нужно, - это " + phrase);
    }
}
