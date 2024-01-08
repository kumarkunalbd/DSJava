package kumarkunalbd.dsjava.backtrackdpgraph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class L216Tests {
    @Test
    public void combinationSum3(){
        L216 combSum = new L216();
        List<List<Integer>>listAns = combSum.combinationSum3(3,7);
        List<List<Integer>> expectedAns = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(2);
        first.add(4);
        expectedAns.add(first);
        Assertions.assertEquals(expectedAns,listAns);
    }
}
