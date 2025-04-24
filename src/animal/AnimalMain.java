package animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] pets = {
                new Cat("Garfield"),
                new Dog("God")
        };

        for (Animal a : pets) {
            System.out.println(a.makeNoise());
            System.out.println(a.roam());
            System.out.println();
        }
    }
}
