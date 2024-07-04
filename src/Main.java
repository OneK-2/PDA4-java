public class Main {

    public static void main(String[] args) {
        Person jaeYong = new Person("재용");
        Person jobs = new Person("잡스");

        iPhone apple = new iPhone();
        Galaxy samsung = new Galaxy();

        jaeYong.buyPhone(samsung);
        jaeYong.turnOn();

        jobs.buyPhone(apple);
        jobs.turnOn();

    }

}