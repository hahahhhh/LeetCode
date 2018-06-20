class Solution {
    public int romanToInt(String s) {
        if(s == null || s.length() < 1)
            return -1;
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int res = 0;
        int temp = 0; // ��ʱ������������ǵ�ǰ��������һ����ֵ��ֵ
        int value = 0; // ��ǰ����ֵ�Ĵ�С
        for(int i = ch.length - 1; i >= 0; i--)
        {
            value = hm.get(ch[i]);
            if(temp <= value)  // ���
            {
                res += value;
                temp = value;
            }
            else    // �Ҽ�
            {
                res -= value;
                temp = value;
            }
        }
        return res;
    }
}