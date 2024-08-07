package generic.test.ex7;

/*
여러분은 게임속 캐릭터를 클래스로 만들어야한다.
BioUnit은 유닛들의 부모클래스이다.
BioUnit의 자식클래스로 Marine, Zealot, Zergling이 있다.
*/

public class BioUnit {
    private String name;
    private int hp;

    public BioUnit(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "BioUnit{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
