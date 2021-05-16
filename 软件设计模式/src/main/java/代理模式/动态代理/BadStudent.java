package 代理模式.动态代理;

public class BadStudent implements People {
    private String name;
    public BadStudent(String name) {
        this.name = name;
    }


    @Override
    public void doOne() {
        System.out.println(name+"答到...");
    }

    @Override
    public void doTwo() {
        System.out.println(name+"交作业...");
    }
}
