package Interface;
/*
* 接口的特点：
*       1. 用关键字interface修饰
*       2. 类实现接口用关键字implement
*       3. 接口不能实例化
*               如何实例化：参照多态的形式，通过实现类对象实例化，这叫接口多态
*               多态的几种形式：具体类多态，抽象类多态，接口多态
*               多态的前提：有继承或实现关系，有方法重写，有父类（或父接口）引用指向子类（或实现类）对象
*
* */

/*
* 接口的成员特点：
*       1. 只能是常量    默认修饰符：public static final
*       2. 构造方法：
*               没有构造方法（接口主要是对行为进行抽象的，没有具体存在）
*               一个类如果没有父类，默认继承至Object类
*       3. 成员方法：
*               只能是抽象方法
*               默认修饰符：public abstract(不能有static方法，static和abstract是不能共存的)
*               关于接口中的方法，jdk8和jdk9有一些新特性
*
* */

/*
* 继承抽象类的类，必须实现抽象类中所有抽象方法；
* 同样的，实现接口的类，必须实现接口中所有抽象方法，而接口中所有方法都是抽象的，也就是说一个类实现一个接口，就要实现这个接口所有的方法
* */

/*
 * 接口与接口之间叫继承，一个接口可以继承多个接口
 * Java中是存在多继承的，体现在接口与接口之间的关系
* */
public class InterfaceDemo {
    public static void main(String[] args) {
        Jumpping jump=new JumppingImpl();
        jump.jump();

    }
}
