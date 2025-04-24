package animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Garfield"),
                new Lion("king"),
                new Dog("tofi"),
                new Wolf("Bozkurtt")
        };

        for (Animal a : animals) {
            System.out.println(a.makeNoise());
            System.out.println(a.roam());
            a.sleep();
            System.out.println();
        }
    }
}
