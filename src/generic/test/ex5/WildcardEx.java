package generic.test.ex5;

import generic.animal.Animal;
/*
제네릭 메서드 실행예시

1. 전달
printGeneric(dogBox)

2. 제네릭 타입 결정 dogBox는 Box<Dog> 타입, 타입 추론 -> T의 타입은 Dog
static <T> void printGenericV1(Box<T> box){
sop(box.get())

3. 타입 인자 결정
static <Dog> void printGenericV1(Box<Dog> box){
sop(box.get())

4. 최종 실행 메서드
static void printGenericV1(Box<Dog> box){


와일드 카드 실행예시
1. 전달
printWildcardV1(dogBox)

//이것은 제네릭 메서드가 아니다. 일반적인 메서드이다.
2. 최종 실행 메서드, 와일드카드 ?는 모든 타입을 받을수있다.
static void printWildcardV1(Box<?> box){
sop(box.get())


#printAndResultGeneric()은 다음과 같이 전달한 타입을 명확하게 반환할 수있다. (구체적인 반횐티입을 받고싶은 경우)
Dog dog = WildcardEx.printAndReturnGeneric(dogBox)

반면에 printAndReturnWildcard()의 경우 전달한 타입을 명확하게 반환할수 없다. 여기서는 Animal 타입으로 변환한다.
Animal animal = WildcardEx.printAndResultWildcard(dogBox)
 */

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box){
        System.out.println(box.get());
    }


    //Box<Dog>, Box<Cat>, Box<object>
    static void printWildcardV1(Box<?> box){
        System.out.println(box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println(t.getName());
    }

    static <T extends Animal> T printGenericV3(Box<T> box){
        T t = box.get();
        System.out.println(t.getName());
        return t;
    }

    static void printWildcardV2(Box<? extends Animal> box){ //이 메서드에 들어오는 박스 와일드 타입에 제한을 둘수있다.
        Animal animal = box.get();
        System.out.println(animal.getName());
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println(animal.getName());
        return animal;
    }
}
