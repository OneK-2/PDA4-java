public class Galaxy implements Phone {


    @Override
    public void printLogo(String name) {
        System.out.println(name + "님이 삼송폰을 구매했습니다.");
    }

    @Override
    public void turnOn(String name) {
        System.out.println(name + "님이 삼송폰을 켰습니다.");
        System.out.println("*** 폰 켜지는 중 ***");
    }
}
