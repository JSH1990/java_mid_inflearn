package generic.test.ex5;

import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍", 200));
        WildcardEx.<Dog>printGenericV1(dogBox);

        WildcardEx.<Dog>printGenericV2(dogBox);

        Dog dog = WildcardEx.printGenericV3(dogBox);
        Cat cat = WildcardEx.printGenericV3(catBox);

        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printWildcardV2(dogBox);

        WildcardEx.printAndReturnWildcard(dogBox);
//        WildcardEx.printAndReturnWildcard(objectBox); // 와일드카드에 상한선이 정해져 animal 상속받지않으면 들어갈수없다.
    }
}
