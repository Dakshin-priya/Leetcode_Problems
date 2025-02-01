class Solution {
    public int minimizeXor(int num1, int num2) {
        int a = Integer.bitCount(num1);
        int b = Integer.bitCount(num2);
        int res = num1;
        for (int i = 0; i < 32; i++) {
            if (a > b && ((1 << i) & num1) > 0) {
                res ^= 1 << i;
                a--;
            }
            if (a < b && ((1 << i) & num1) == 0) {
                res ^= 1 << i;
                a++;
            }
        }
        return res;
    }
}

/*
1 << i is a *left shift* operation that shifts the binary representation of 1 by i positions to the left. 

- It results in a number where only the i-th bit is 1, and all other bits are 0.

*Example:*
- 1 << 2 → 4 (binary 0100)
- 1 << 3 → 8 (binary 1000)

------------------------------------------------------------------

You can't use == 1 to check if a bit is set because:

- *Bitwise AND (num1 & (1 << i))* gives a value that has only the i-th bit set, which is a power of 2 (e.g., 1, 2, 4, 8, etc.).
- *== 1* only checks if the result is exactly 1, but when checking higher bits (e.g., i = 2), the result will be 4, 8, etc., not 1.
  
So, the correct condition to check if a bit is set is *(num1 & (1 << i)) != 0*, which works for any bit position.

*/
