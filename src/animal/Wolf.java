package animal;

public class Wolf extends Canine {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return getName() + " howls: AUuUuUu!\uD83C\uDDF9\uD83C\uDDF7";
    }
}
