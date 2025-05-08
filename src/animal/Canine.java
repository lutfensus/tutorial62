package animal;

public abstract class Canine extends Animal {
    public Canine(String name) {
        super(name);
    }

    @Override
    public String roam() {
        return getName() + " roams in a pack.";
    }
}
