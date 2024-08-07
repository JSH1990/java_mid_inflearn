package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Animal> animalBox = new Box<>();

        //Animal 포함 상위 타입 전달가능
        writeBox(animalBox);

        Animal animal = animalBox.get();
        System.out.println(animal);
    }

    static void writeBox(Box<? super Animal > box) {
        box.set(new Dog("멍멍이", 200));
    }
}
