package 装饰器模式;

public class Decoretor implements Student {
    private People people;

    public Decoretor(People people) {
        this.people = people;
    }

    @Override
    public void Reply() {
        people.Reply();
    }
}
