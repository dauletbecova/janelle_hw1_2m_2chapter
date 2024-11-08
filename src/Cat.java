public class Cat extends Animal implements Printable {
    private String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void print() {

        System.out.println("Cat name: " + getName() + ", age: " + getAge() + ", breed: " + getBreed());
    }
}
