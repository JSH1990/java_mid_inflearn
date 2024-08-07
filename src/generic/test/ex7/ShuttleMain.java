package generic.test.ex7;

public class ShuttleMain {
    public static void main(String[] args) {
        Shuttle<BioUnit> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));
        shuttle1.showInfo();
    }
}
