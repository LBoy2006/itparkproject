package lesson9;

public abstract class Automobile {
    String model;
    int maxDistance;

    public Automobile(String model) {
        this.model = model;
    }

    public abstract void move();
}