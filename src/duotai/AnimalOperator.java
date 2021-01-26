package duotai;

public class AnimalOperator {
    public void operate(Animal animal){
        animal.eat();
//        animail.kanmen();//多态的弊端，不能使用子类特有的功能
    }
}
