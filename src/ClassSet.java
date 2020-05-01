import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class ClassSet extends ProfiledClass{
    public void run() {

        //Es werden 10 Zufallszahlen in die Menge eingefügt__________________________________-
            Set<Integer> menge = new HashSet<>();
            Random r = new Random();
            for (int k = 0; k < 10; k++) {
                menge.add(r.nextInt(10));
            }

        //Die Zahlen werden vom Anfang bis zum Ende ausgegeben._________________________________

            Iterator<Integer> it = menge.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

        // Die Anzahl der Elemente in der Menge wird ausgegeben___________________________________

            System.out.println("Menge mit " + menge.size() + " Elementen ");
            System.out.println("___________________");

    }
    public static void main(String[] args) {
       Profiler profiler = new Profiler(ClassSet.class);
       profiler.start();
       profiler.printResults();
    }
}
