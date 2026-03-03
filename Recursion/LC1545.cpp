//O(2^n)
//S.C=O(n)
class Solution {
public:
    char bit(int n, int k, string s){
        if(s.size() == ((1 << n) - 1)){
            return s[k-1];
        }

        string help = "";
        for(int i = 0; i < s.size(); i++){
            char ch = (s[i] == '0') ? '1' : '0';   // fixed flipping
            help += ch;                           // fixed push
        }

        reverse(help.begin(), help.end());

        return bit(n, k, s + "1" + help);
    }

    char findKthBit(int n, int k) {
        return bit(n, k, "0");
    }
};

//T.C=S.C=O(n)
class Solution {
public:
    char findKthBit(int n, int k) {
        // Base case
        if (n == 1) return '0';

        int len = (1 << n) - 1;
        int mid = (len / 2) + 1;   // 2^(n-1)

        if (k == mid)
            return '1';
        
        else if (k < mid)
            return findKthBit(n - 1, k);
        
        else {
            char ch = findKthBit(n - 1, len - k + 1);
            return (ch == '0') ? '1' : '0';   // invert
        }
    }
};
