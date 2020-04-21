public class DoppListe {
    private Knoten anfang;
    private Knoten ende;

    public DoppListe(){
        anfang = null;
        ende = null;
    }
    private boolean isEmpty(){
        return anfang == null;
    }

    //____a)prepend - Element am Anfang einfügen___________________________________________________________

    public void prepend(int zahl){
        Knoten node = new Knoten(zahl);
        if(isEmpty())
            ende = node;
        else
            anfang.prev = node;

        node.next = anfang;
        anfang = node;
    }

    //____b)append - Element am Ende einfügen______________________________________________________________

    public void append(int zahl){
        Knoten node = new Knoten(zahl);
        if(isEmpty())
            anfang = node;
        else
            ende.next = node;
        node.prev = ende;
        ende = node;
    }
    //___c)insert - Element an einer angegebenen Position einzufügen_______________________________________

    public void insert(int zahl, int position){
        Knoten current = anfang;
        int i = 0;

        while (current != null && i != position){
            current = current.next;
            i++;
        }
        Knoten nodeAdd = new Knoten(zahl);
        current.prev.next = nodeAdd;
        nodeAdd.prev = current.prev;
        current.prev = nodeAdd;
        nodeAdd.next = current;
    }
    //__d)get - ein Element an einer gegebenen Position abrufen____________________________

    public int get(int position){
        Knoten node = anfang;
        int i = 0;
        while (node != null){
            if(i==position)
                return node.zahl;
            node = node.next;
            i++;
        }
        return -1;
    }
    //__e)remove - Element an einer angegebenen Position löschen____________________________

    public void removeElem(int position){
        Knoten node = anfang;
        int i = 0;
        while (i <position -1){
            node = node.next;
            i++;
        }
        if(node == null){
            System.out.println("List is Empty");
        }
        else if (i == position){
            node = null;
        } else {
            Knoten deleteElement = node.next;
            node.next = deleteElement.next;
        }
    }
    //__f)contains - prüft, ob das übergebene Element in der Liste enthalten ist______________________

    public int contains(int elem){
        Knoten node = anfang;
        int i = 0;
        while (node != null){
            if(node.zahl == elem)
                return i;
            node = node.next;
            i++;
        }
        return -1;
    }

    //__g)size - gibt aus, wie viele Elemente in der Liste enthalten sind___________________________

    public int size(){
        Knoten node = anfang;
        int count = 0;

        if(isEmpty())
            anfang = node;
        else
            while (node != null) {
                node = node.next;
                count++;
            }
        return count;
    }

    public void print(){
        Knoten node = anfang;

        while (node != null){
            System.out.println(node.zahl);
            node = node.next;
        }
    }

}


