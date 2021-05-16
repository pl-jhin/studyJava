package 装饰器模式;

public class main {
    public static void main(String[] args) {
        Student people1 = new People("张三");
        people1 = new DoOne((People) people1);
        people1.Reply();

        Student people2 = new People("李四");
        people2 = new DoTwo((People) people2);
        people2.Reply();


    }
}
