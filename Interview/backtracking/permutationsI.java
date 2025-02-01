class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        permutations(0, res, nums, new ArrayList<>());
        return res;
    }

    public void permutations(int start,List<List<Integer>> res,int[]nums,ArrayList<Integer> temp)
    {
        if(temp.size()==nums.length)
        {
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(!temp.contains(nums[i]))
            {
                temp.add(nums[i]);
                permutations(i,res,nums,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}
