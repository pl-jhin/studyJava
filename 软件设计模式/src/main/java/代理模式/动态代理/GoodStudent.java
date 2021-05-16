package 代理模式.动态代理;

public class GoodStudent implements People {
    private String name;
    public GoodStudent(String name) {
        this.name = name;
    }

    @Override
    public void doOne() {
        System.out.println(name+"起立回答问题");
    }

    @Override
    public void doTwo() {
        System.out.println(name+"把收齐的作业交给老师");
    }
}
