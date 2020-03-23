public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(" Hi Anna");

        //creating new thread with extending Thread class
        SumIntegers sum = new SumIntegers();
        sum.start();
       // Thread.sleep(125);
        sum.join();
        System.out.println(sum.getCounter());

        //creating new thread with Runnable interface
        SumIntegers2 s2 = new SumIntegers2();
        Thread t = new Thread(s2);
        t.start();
    }
}
