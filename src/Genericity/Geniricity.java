package Genericity;
/*
* 泛型类格式：public class Geniricity<T>
* 泛型方法格式：public <K> void show(K k)
 * */
public class Geniricity<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <K> void show(K k){
        System.out.println(k);
    }

}
