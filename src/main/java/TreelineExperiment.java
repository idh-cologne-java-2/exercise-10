import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
class TreelineExperiment {



    public TreelineExperiment(){

    }
    public static void timeTest(List<Integer> list){
        Random random = new Random(0);
        for (int i = 0; i < 10000; i++)
            list.add(random.nextInt());
        long startTime = System.currentTimeMillis();
        System.err.println(list.getClass().getCanonicalName() + "took" + String.valueOf(endTime - startTime)+ "ms.");




    };
    public static void main (String[] args){
        TreelineExperiment(new ArrayList<Integer>());
        TreelineExperiment(new LinkedList<Integer>());
        TreelineExperiment(new TreeList<Integer>());
        //no clue why Intellij won´t accept the damned library, but let´s just pretend it works
        

    }
}