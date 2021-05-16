package 装饰器模式;

public class DoOne extends Decoretor {
    public DoOne(People people) {
        super(people);
        DoOne(people.getName());
    }
    public void DoOne(String name){
        System.out.println(name+"擦黑板");
    }
}
