package duotai;

/*
* 多态：同一个对象，在不同时刻表现出的不同形态
*
* 多态的前提：
*       要有继承或实现关系
*       要有方法的重写
*       要有父类引用指向子类对象
* */

/*
* 多态中访问特点：
*       成员变量：编译看父类，运行看父类
*       成员方法：编译看父类，运行看子类（如果子类中没有方法，则运行时使用父类方法）
*       静态方法：编译看父类，运行看父类
* */

/*
 * 多态的好处：提高了程序扩展性；
 *   具体体现：定义方法的时候，使用父类型作为参数，将来在使用的时候，使用具体的子类型参与操作
 *
 * 多态的彼端：不能使用子类的特有功能
 *
 * */



public class MainDemo {
    public static void main(String[] args) {
//        AnimalOperator animalOperator = new AnimalOperator();
//
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//
//        animalOperator.operate(cat);
//        animalOperator.operate(dog);

        Animal a=new Cat();//向上转型，父类引用指向子类对象
        a.eat();
//        a.playGame();//报错:a是父类引用，不能访问子类特有功能

        ((Cat)a).playGame();//可以，此处为向下转型，将a转为子类引用
    }
}
