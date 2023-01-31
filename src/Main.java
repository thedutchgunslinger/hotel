import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
    Groep<Gast> klanten = new Groep<Gast>();
    for(int i = 0; i < 40; i++){
        System.out.println(klanten.isLeeg());
        Gast nieuweGast = new Gast();
        klanten.add(nieuweGast);
        System.out.println(nieuweGast.toString());
    }

    System.out.println("-------------------------");
        Iterator<Gast> it = klanten.iterator();
        int teller = 0;
        while(it.hasNext()){
            System.out.println(it.next());
            System.out.println(klanten.getCapaciteit());
            System.out.println(teller++);
        }

    }
}