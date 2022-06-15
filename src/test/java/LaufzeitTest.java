import org.apache.commons.collections4.list.TreeList;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class LaufzeitTest {
    @Test
    public void TreeSchnellerAlsArray()
    {
        TreeList<Integer> treeList = new TreeList<>();
        long treeInit = Laufzeitanalyse.append100k(treeList);
        long treeInsert = Laufzeitanalyse.insert10k(treeList);
        ArrayList<Integer> arrayList = new ArrayList<>();
        long arrayInit = Laufzeitanalyse.append100k(arrayList);
        long arrayInsert = Laufzeitanalyse.insert10k(arrayList);

        Assert.assertTrue(treeInit > arrayInit);
        Assert.assertTrue(treeInsert < arrayInsert);

    }
}
