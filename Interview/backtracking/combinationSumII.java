class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
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
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            temp.add(candidates[i]);  
            combination(i+1, res, candidates, target - candidates[i], temp); 
            temp.remove(temp.size() - 1); 
        }
    }
}

/*
 Fixes & Improvements from combinationSumI
 
✅ Sort candidates[] → Ensures that duplicate numbers appear consecutively.
✅ Skip duplicates with if (i > start && candidates[i] == candidates[i - 1]) continue;
✅ Calls combination(i + 1, ...) → Ensures that each element is only used once per combination.
*/
