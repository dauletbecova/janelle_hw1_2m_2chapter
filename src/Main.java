public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = creeateObject("2й");
        animals[1] = creeateObject("3й");
        animals[2] = creeateObject("4й");
        for (Animal animal : animals) {
            if (animal instanceof Printable) {
                Printable printable = (Printable) animal;
                printable.print();
            }
        }
    }

    public static Animal creeateObject(String className) {
        switch (className) {
            case "2й":
                return new Cat("Musy", 4, "Britain breed");
            case "3й":
                return new Dog("Meyson", 2, "Black");
            case "4й":
                return new Hamster("Cucu", 1, 1);
            default:
                return null;
        }
    }
}