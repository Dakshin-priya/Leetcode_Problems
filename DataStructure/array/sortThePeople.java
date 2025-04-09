class Solution {
    public String[] sortPeople(String[] names, int[] height) {
        int n = height.length;
        for (int i = 1; i < n; i++) {
            int key1 = height[i]; 
            String key2=names[i];
            int j = i - 1;
            while (j >= 0 && height[j] < key1) {
                height[j + 1] = height[j];
                names[j+1]=names[j];
                j--;
            }
            
            height[j + 1] = key1;
            names[j+1]=key2;
        }
        return names;
    }
}
