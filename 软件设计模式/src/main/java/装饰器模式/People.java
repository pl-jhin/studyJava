package 装饰器模式;

public class People implements Student {
    private String name;

    public String getName() {
        return name;
    }

    public People(String name) {
        this.name = name;
    }

    @Override
    public void Reply() {
        System.out.println(name+"到");
    }
}
