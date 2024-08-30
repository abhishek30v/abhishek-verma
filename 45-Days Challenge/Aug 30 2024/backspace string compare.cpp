class Solution {
public:
    bool backspaceCompare(string s, string t) {
        stack<char> st1;
        stack<char> st2;
        int i=0,j=0;
        while(i< s.length()){
            if(s[i] == '#'){
                 if(!st1.empty())
                st1.pop();
            }else{
                st1.push(s[i]);
            }
            i++;
        }

        while(j< t.length()){    
            if(t[j] == '#'){
                if(!st2.empty())
                st2.pop();
            }
            else{
                st2.push(t[j]);
            }
            j++;
        }

        while(!st1.empty() && !st2.empty()){
            if(st1.top() != st2.top()){
                return false;
            }
            st1.pop();
            st2.pop();
        }
    if(st1.empty() && st2.empty()){
        return true;
    }
    return false;
    }
};