package phone;

public class Person {
    private String name;
    private Phone phone;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void buyPhone(Phone phone){
        this.phone = phone;
        this.phone.printLogo(name);
    }

    public void turnOn(){
        this.phone.turnOn(name);
    }
}
