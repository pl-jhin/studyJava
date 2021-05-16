package 代理模式.静态代理;

public class Student implements People {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void doOne() {
        System.out.println(name+"到..."+"然后睡着了...");
    }

    @Override
    public void doTwo() {
        System.out.println(name+"交作业...");
    }
}
