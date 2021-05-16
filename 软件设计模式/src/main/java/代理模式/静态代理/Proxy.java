package 代理模式.静态代理;

public class Proxy {
    private Student student;

    public Proxy(String Name) {
        this.student = new Student(Name);
    }
    public void doSomething(){
        doOne();
        student.doOne();
        doTwo();
        student.doTwo();
    }
    public void doOne(){
        System.out.println("喂喂喂"+student.getName()+"老师来第一件事");
    }
    public void doTwo(){
        System.out.println("喂喂喂"+student.getName()+"老师来第二件事");
    }
}
