package lesson9;

public class AutomobileRunner {
    public static void main(String[] args) {
        Car lada = new Car("Лада");
        Car ford = new Car("Форд");
        Car mazda = new Car("Мазда");
        Car kia = new Car("Киа");
        Car bmw = new Car("БМВ");
        Truck kamaz = new Truck("Камаз");
        Truck man = new Truck("Ман");
        Truck zil = new Truck("Зил");
        Truck mercedes = new Truck("Мерседес");
        Truck maz = new Truck("Маз");
        Automobile[] automobiles = new Automobile[] {lada,ford,maz,man,mercedes,mazda,kamaz,kia,bmw,zil};
        for (Automobile automobile : automobiles) automobile.move();
    }
}