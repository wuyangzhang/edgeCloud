package test;

/**
 * Created by Wuyang on 3/2/17.
 */
class MyThread implements Runnable{
    public static int ticket = 5;
    public void run(){
        for (int i=0;i<10;i++)
        {
            if(ticket > 0){
                System.out.println("ticket = " + ticket--);
            }
        }
    }
}

public class MultiThread{
    public static void main(String[] args){
       MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
       System.identityHashCode(t1);

    }
}
