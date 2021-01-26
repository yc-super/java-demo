package duotai;

public class Cat extends Animal {
    private int age;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame(){
        System.out.println("猫捉迷藏");
    }
}
