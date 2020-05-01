import java.util.Random;

public class Main extends ProfiledClass{
    @Override
    public void run() {
        DoppListe liste = new DoppListe();
        Random r = new Random();
        for(int k = 0; k <10; k++){
            liste.prepend(r.nextInt(10));
        }
        liste.get(3);                             //ein Element an einer gegebenen Position abrufen

        liste.contains(5);                        //prüft, ob das übergebene Element in der Liste enthalten ist

        liste.size();                             //gibt aus, wie viele Elemente in der Liste enthalten sind
        System.out.println("___________________");

        liste.print();                            //Die Zahlen werden vom Anfang bis zum Ende ausgegeben.
        liste.removeElem(4);                 //Element an einer angegebenen Position löschen
        System.out.println("____________________");
        liste.size();                              // löscht ein Element
        liste.print();
    }

    public static void main(String[] args) {
        Profiler profMain = new Profiler(Main.class);
        profMain.start();
        profMain.printResults();
    }
}
