package village;

public class SomeVillage {
    protected int counter;
    public SomeVillage() {
        this.counter = -1;
    }
    public SomeVillage(int a) {
        this.counter = a;
    }
    public String toString() {
        return String.format("SomeString = %d", counter);
    }
}
