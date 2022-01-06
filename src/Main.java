import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Алексей", "24", orientationRandom());
        Passenger passenger2 = new Passenger("Даниил", "25", orientationRandom());
        Passenger passenger3 = new Passenger("Иван", "24", orientationRandom());
        Passenger passenger4 = new Passenger("Андрей", "24", orientationRandom());

        Car car = new Car(new String[]{passenger1.toString(), passenger2.toString(), passenger3.toString(), passenger4.toString()});
        System.out.println(car.toString());

    }

    public static String orientationRandom() {
        int max = 2;
        int a = (int) (Math.random() * ++max);
        if (a == 2) {
            return "Пидор";
        }
        return "Нормальный пацан";
    }
}
