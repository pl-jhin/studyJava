package 装饰器模式;

public class DoTwo extends Decoretor {
    public DoTwo(People people) {
        super(people);
        DoTwo(people.getName());
    }
    public void DoTwo(String name){
        System.out.println(name+"打扫卫生");
    }
}
