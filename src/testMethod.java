import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class testMethod {


    public static void main(String[] args) throws Exception {
        System.out.println( "hello world");
        if ("".equals("")){
            System.out.println("hello xiao mi qi");
            List<Object> list = new ArrayList<>();
            Thread thread1 = new Thread();
            thread1.start();
            TimeUnit.SECONDS.sleep(10);
            System.out.println("等待时间结束");
            Lock lock = new ReentrantLock();
            Condition condition = lock.newCondition();
            condition.await();




        }


    }






}
