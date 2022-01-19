import javax.xml.transform.Result;

/**
 * Created by Alexey Egorov
 * Date: 18.01.2022
 */

public class HomeWorkApp {

    public static void main (String[] args) {
        System.out.println("Homework ready");

        printTreeWords();
        checkSumSign();
        printColor(50);
        compareNumbers();
    }
    public static void printTreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        if ((a+b) >= 0){
            System.out.println("Сумма положительная");
        }
        if ((a+b) < 0){
            System.out.println("Сумма отрицательная");
        }

    }
    public static void printColor(int value){
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value >= 0 && value <= 100){
            System.out.println("Жёлтый");
        }
        else {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers(){
        int a = 5;
        int b = 8;
        if (a >= b){
            System.out.println("a >= b");
        }
        else{
            System.out.println("a < b");
        }

    }


}
