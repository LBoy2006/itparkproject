package lesson8;

public class AnimalsRunner {
    public static void main(String[] args) {
        Animal cat = new Cat("Том");
        Animal dog = new Dog("Шарик");
        Animal cow = new Cow("Фрося");
        Animal fox = new Fox("Рыжик");
        Animal sheep = new Sheep("Долли");
        Animal[] animals = new Animal[] {cat, dog, cow, fox, sheep};
        for (Animal animal: animals) animal.getVoice();
    }
}
