package animal;

public class Dog extends Canine {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return getName() + " says: bark!";
    }
}
