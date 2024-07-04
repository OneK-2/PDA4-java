public class Main {

    public static void main(String[] args) {
        Person jaeYong = new Person("재용", 50);
        Person jobs = new Person("잡스", 50);

        iPhone apple = new iPhone();
        apple.printLogo(jobs.getName());
        apple.turnOn(jobs.getName());

        Galaxy samsung = new Galaxy();
        samsung.printLogo(jaeYong.getName());
        samsung.turnOn(jaeYong.getName());

    }

}