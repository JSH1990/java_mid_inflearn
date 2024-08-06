package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        DogHostpital dogHostpital = new DogHostpital();
        CatHostpital catHostpital = new CatHostpital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 50);

        dogHostpital.setAnimal(dog);
        dogHostpital.checkup();

        catHostpital.setAnimal(cat);
        catHostpital.checkup();

//        dogHostpital.setAnimal(cat); //다른타입입력하면 컴파일오류

        dogHostpital.setAnimal(dog);
        Dog biggerdog = dogHostpital.bigger(new Dog("멍멍이2", 150));
        System.out.println(biggerdog);

    }
}
