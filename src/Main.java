import java.util.Random;

public class Main extends ProfiledClass{
    @Override
    public void run() {
        long ergebnis = 1;
        for (long i = 1; i < 1000000000; i++) {
            ergebnis += i;
        }
        System.out.println("Ergebnis ist: " + ergebnis);
    }
    public static void main(String[] args) {
        Profiler profiler = new Profiler(Main.class);
        profiler.start();
        profiler.printResults();

        DoppListe doppListe = new DoppListe();

        Random r = new Random();
        int zufahlzahl = 10000;
        for(int k = 0; k <10000; k++){
            doppListe.prepend(r.nextInt(zufahlzahl));
        }

        doppListe.removeElem(2);

        System.out.println("In der Position 1 befindet sich Element: "+doppListe.get(1));

        System.out.println("Element befindet sich in der Position: "+doppListe.contains(555));

        System.out.println("Anzahl von Elementen: "+doppListe.size());
    }
}
