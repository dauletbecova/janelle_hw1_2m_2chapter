public class Dog extends Animal implements Printable {
    private String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("Dog name: " + getName() + ", age: " + getAge() + ", color: " + getColor());
    }
}
