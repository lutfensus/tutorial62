package animal;

public abstract class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String makeNoise();

    public String roam() {
        return getName() + " is wandering around.";
    }
}
