package lesson9;

public final class Car extends Automobile {

    public Car(String model) {
        super(model = "Легковой автомобиль " + model);
        maxDistance = 500;
    }

    @Override
    public void move() {
        int distance = (int) (Math.random() * 1000);
        if (this.maxDistance <= distance) {
            System.out.println(model + " не смог проехать " + distance + "км");
        } else System.out.println(model + " проехал " + distance + "км");
    }
}