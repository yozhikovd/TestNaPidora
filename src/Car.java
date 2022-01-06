import java.util.Arrays;

public class Car {

    private String[] allPassenger = new String[4];

    public Car() {
    }

    public Car(String[] allPassenger) {
        this.allPassenger = allPassenger;
    }

    @Override
    public String toString() {
        return "Машина {" +
                "Пассажиры =" + Arrays.toString(allPassenger) +
                '}';
    }
}
