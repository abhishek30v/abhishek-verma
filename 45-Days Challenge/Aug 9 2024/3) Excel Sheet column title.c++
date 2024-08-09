class Solution {
public:
    string convertToTitle(int columnNumber) {
        string ans = "";
        while(columnNumber--){
            int rem = columnNumber % 26;
            char c = 'A' + rem;
            ans = c + ans;
            columnNumber = columnNumber / 26;
        }
        return ans;
    }
};