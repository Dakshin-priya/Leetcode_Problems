class Solution {
    public boolean isBalanced(String num) {
        char[] ns=num.toCharArray();
        int evensum=0;
        int oddsum=0;
        int[] n = new int[ns.length];
        for (int i = 0; i < ns.length; i++) {
            n[i] = ns[i] - '0'; 
        }
        for(int i=0;i<n.length;i++)
        {
            if(i%2==0)
            {
                evensum=evensum+n[i];
            }
            else
            {
                oddsum=oddsum+n[i];
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
        
        if(evensum==oddsum)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
