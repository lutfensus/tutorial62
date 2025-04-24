package animal;

public abstract class Feline extends Animal {
    protected Feline(String name) {
        super(name);
    }

    @Override
    public String roam() {
        return getName() + " prowls silently.";
    }
}
