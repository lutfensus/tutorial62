package animal;

public class Lion extends Feline {
    public Lion(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return getName() + " roars: RAAWR!";
    }
}
