package animal;

public abstract class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public abstract String makeNoise();

    public String roam() {
        return name + " is wandering around.";
    }
}
