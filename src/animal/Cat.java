package animal;

public class Cat extends Feline {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return getName() + " says: meow!";
    }
}
