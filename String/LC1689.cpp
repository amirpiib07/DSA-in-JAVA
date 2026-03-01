//1ST method

class Solution {
public:
    int minPartitions(string n) {
        int ans=INT_MIN;
        for(int i=0;i<n.size();i++){
            if((n[i]-'0')>ans) ans=(int)(n[i]-'0');
        }
        return ans;
    }
};

//2ND method

class Solution {
public:
    int minPartitions(string n) {
        return *max_element(n.begin(),n.end())-'0';
    }
};
