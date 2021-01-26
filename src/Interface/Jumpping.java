package Interface;

public interface Jumpping extends Jumpping2,Jumpping3{
    public static final int age=20;//public static final可以不用写，说明接口中的成员变量都被public static final修饰，都是常量


    public abstract void jump();//public abstract可以不用写，说明接口中的方法都被public abstract修饰，都是抽象方法

    public abstract void jump2();//public abstract可以不用写，说明接口中的方法都被public abstract修饰，都是抽象方法
}
