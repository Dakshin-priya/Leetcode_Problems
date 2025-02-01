import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combination(0, res, candidates, target, new ArrayList<>());
        return res;
    }

    public void combination(int start, List<List<Integer>> res, int[] candidates, int target, List<Integer> temp) {
        if (target == 0) { 
            res.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0) return; 

        for (int i = start; i < candidates.length; i++) {
            temp.add(candidates[i]);  
            combination(i, res, candidates, target - candidates[i], temp); 
            temp.remove(temp.size() - 1); 
        }
    }
}
//insted of calculating sum we can suptract from target
