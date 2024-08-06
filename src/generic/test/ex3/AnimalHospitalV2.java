package generic.test.ex3;

public class AnimalHospitalV2<T> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup(){
        //T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용

//        System.out.println(animal.getName());
//        System.out.println(animal.getSize());
//        animal.sound();
    }

    public T bigger(T target){

//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
