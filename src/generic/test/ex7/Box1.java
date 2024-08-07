package generic.test.ex7;

public class Box1<T extends BioUnit> {
    private T bioUnit;

    public T getBioUnit() {
        return bioUnit;
    }

    public void setBioUnit(T bioUnit) {
        this.bioUnit = bioUnit;
    }
}
