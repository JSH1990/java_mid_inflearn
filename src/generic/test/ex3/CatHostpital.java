package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Cat;

public class CatHostpital {
    private Cat animal;

    public void setAnimal(Cat animal) {
        this.animal = animal;
    }
    
    public void checkup(){
        System.out.println(animal.getName());
        System.out.println(animal.getSize());
        animal.sound();
    }
    
    public Cat bigger(Cat target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
