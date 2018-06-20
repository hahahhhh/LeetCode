        class Solution {
            public boolean isPalindrome(int x) {
                if (x < 0) return false;
                long k = 0;
                long a = x;
                while (a > 0) {
                    k = k * 10 + a % 10;
                    a /= 10;
                }
                return (x == k);
            }
        }