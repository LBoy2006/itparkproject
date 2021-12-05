package lesson9;

public final class Truck extends Automobile {

    public Truck(String model) {
        super(model = "Грузовик " + model);
        maxDistance = 1200;
    }

    @Override
    public void move() {
        int distance = (int) (Math.random() * 1000);
        if (this.maxDistance <= distance) {
            System.out.println(model + " не смог проехать " + distance + "км");
        } else System.out.println(model + " проехал " + distance + "км");
    }
}


