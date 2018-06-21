class Solution {
    public int romanToInt(String s) {
        
        int value = 0;
        int temp = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    if (temp <= 1)
                        value += 1;
                    else
                        value -= 1;
                    temp = 1;
                    break;
                case 'V':
                    if(temp<=5)
                        value+=5;
                    else
                        value-=5;
                    temp=5;
                    break;
                case 'X':
                    if (temp<=10)
                        value+=10;
                    else
                        value-=10;
                    temp=10;
                    break;
                case 'L':
                    if (temp<=50)
                        value+=50;
                    else
                        value-=50;
                    temp=50;
                    break;
                case 'C':
                    if (temp<=100)
                        value+=100;
                    else
                        value-=100;
                    temp=100;
                    break;
                case 'D':
                    if (temp<=500)
                        value+=500;
                    else
                        value-=500;
                    temp=500;
                    break;
                case 'M':
                    if (temp<=1000)
                        value+=1000;
                    else
                        value-=1000;
                    temp=1000;
                    break;
            }
        }
        return value;
    }
}