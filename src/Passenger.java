public class Passenger {

    private String name;
    private String age;
    private String Orientation;

    public Passenger() {

    }
    public Passenger(String name, String age, String orientation) {
        this.name = name;
        this.Orientation = orientation;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getOrientation() {
        return Orientation;
    }

    @Override
    public String toString() {
        return "Пассажир{" +
                "Имя='" + name + '\'' +
                ", Возраст='" + age + '\'' +
                ", Ориентация='" + Orientation + '\'' +
                '}';
    }
}
