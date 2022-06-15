import org.apache.commons.collections4.list.TreeList;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class Laufzeitanalyse {

    public static long append100k(Collection<Integer> c){

        Random random = new Random();

        //akutelle Zeit
        LocalTime zeit1 = java.time.LocalTime.now();

        for (int i = 0; i <= 100000; i++) {

            //Random Zahlen hinzufügen bis 100000 Zahlen in Liste sind
            c.add(random.nextInt());
        }

        //Dauer der Init- Befüllung
        LocalTime nachInit = java.time.LocalTime.now();
        long elapsedTimeAfterInit = Duration.between(zeit1, nachInit).toMillis();

        System.out.println("Dauer der initialen Befüllung: " + elapsedTimeAfterInit + " ms");
        return elapsedTimeAfterInit;
    }

    public static long insert10k(List<Integer> c){

        Random random = new Random();

        //aktuelle Zeit
        LocalTime zeit1 = java.time.LocalTime.now();

        for (int i = 0; i <= 10000; i++) {

            c.add(random.nextInt(0, 99999 + i), random.nextInt());
        }

        //aktuelle Zeit
        LocalTime zeit2 = java.time.LocalTime.now();

        //Dauer zw. Init und Einfügen an beliebigen Index
        long elapsedTime = Duration.between(zeit1, zeit2).toMillis();
        System.out.println("Dauer Befüllung an Zufallsindex: " + elapsedTime + " ms");
        return elapsedTime;

    }

    public static void main(String[] args) {
        //TreeList
        TreeList<Integer> treeList = new TreeList<>();

        //ArrayList
        List<Integer> integerList = new ArrayList<>();

        //LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("TreeList");

        append100k(treeList);
        insert10k(treeList);

        System.out.println("ArrayList");

        append100k(integerList);
        insert10k(integerList);

        System.out.println("LinkedList");

        append100k(linkedList);
        insert10k(linkedList);

    }
}
