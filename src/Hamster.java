public class Hamster extends Animal implements Printable {
    private int speed;

    public Hamster(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void print() {
        System.out.println("Hamster name: " + getName() + ", age: " + getAge() + ", speed: " + getSpeed());
    }
}