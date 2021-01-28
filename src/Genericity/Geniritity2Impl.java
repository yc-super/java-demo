package Genericity;

public class Geniritity2Impl<T> implements Geniritity2<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
