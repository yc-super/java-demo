package Abstract;

public abstract class Animal {

    private int age=20;
    private final String city="北京";

    public abstract void eat();

    public void sleep(){
        System.out.println("睡觉");
    }
}
