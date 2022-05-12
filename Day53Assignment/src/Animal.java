public class Animal {
    private String name;
    private boolean isDog;

    public Animal(String petname, boolean petdog) {
        this.name = petname;
        this.isDog = petdog;
    }

    public String getName() {
        return name;
    }

    public boolean getisdog() {
        return isDog;
    }

    public String toString() {
        String s;
        s = getName() + " is a dog = " + getisdog();
        return s;
    }
}
