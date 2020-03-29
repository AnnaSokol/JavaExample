public class Counter {
    int counter;

    //---------------------Variante 1------------------------------------
    public synchronized void inc(){  //increment
        counter++;
    }
    public synchronized void dec(){   //decrement
        counter--;
    }
    public int getCounter() {
        return counter;
    }

    //---------------------Variante 2-------------------------------------

   /*
   Object o = new Object();
    public void inc(){
       synchronized(o) {
            counter++;
       }
    }

    public void dec(){
       synchronized(o) {
             counter--;
       }
    }
    */
   //--------------------Variant 3----------------------------------------
   /*
   public synchronized static void someMethod(){
       Class<Counter> counterClass = Counter.class;
   }

    */
}
