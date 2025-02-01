class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        set(0,res,new ArrayList<>(),nums);
        return res;
    }
    void set(int start,List<List<Integer>> res,List<Integer> temp,int[]nums)
    {
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++)
        {
            temp.add(nums[i]);
            set(i+1,res,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}
//youtube link - https://youtu.be/99fNUFJcLgw?si=4OB4XL-iCRXFIXHe
