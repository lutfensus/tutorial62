package animal;

public abstract class Canine extends Animal {
    protected Canine(String name) {
        super(name);
    }

    @Override
    public String roam() {
        return getName() + " roams in a pack.";
    }
}
