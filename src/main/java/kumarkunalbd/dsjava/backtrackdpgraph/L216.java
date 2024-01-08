package kumarkunalbd.dsjava.backtrackdpgraph;


import java.util.ArrayList;
import java.util.List;

public class L216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> curL = new ArrayList<>();
        ansList = dfsCombinationSum3(k,n,1,curL,ansList);

        return ansList;
    }

    public List<List<Integer>> dfsCombinationSum3(int k, int curT,int curNum, List<Integer> curList, List<List<Integer>> ans){
        //System.out.printf("for curNum=%d ans=%s curList=%s\n",curNum,ans,curList);
        if (curList.size() == k) {
            return ans;
        }

        // main logic
        int i = curNum;
        for (;i<=9;i++) {
            int newT = curT-i;
            if (newT<0) {
                break;
            }
            if (newT == 0) {
                if (curList.size() == k-1) {
                    ArrayList<Integer> newL = new ArrayList<>();
                    for(int num:curList){
                        newL.add(num);
                    }
                    newL.add(i);
                    //System.out.printf("adding newL-%s curList-%s\n",newL,curList);
                    ans.add(newL);
                }
                break;
            }else {
                curList.add(i);
                ans = dfsCombinationSum3(k,newT,i+1,curList,ans);
                curList.removeLast();
            }
        }
        ///System.out.printf("call returned for curNum=%d ans=%s curList=%s\n",curNum,ans,curList);
        return ans;
    }
}
