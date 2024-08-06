package generic.test.ex3;

import generic.animal.Animal;

public class AnimalHospitalV1 {

    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void checkup(){
        System.out.println(animal.getName());
        System.out.println(animal.getSize());
        animal.sound();
    }

    public Animal bigger(Animal target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
