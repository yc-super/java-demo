package MultiThread.ProducerAndCustomer;

public class Box {
    private int milk;
    private Boolean status=false;

    public synchronized void get(){
        if(status){
            System.out.println("用户拿到第"+milk+"瓶奶");
            status=false;
            notifyAll();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void put(int milk){
        if(status){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk=milk;
        System.out.println("送奶工将第"+milk+"瓶奶送入奶箱");
        status=true;
        notifyAll();
    }
}
