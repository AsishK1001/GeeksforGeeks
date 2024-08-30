class Solution {
    String removeDups(String str) {
        // code here
        StringBuilder st=new StringBuilder (str);
        for(int i=0;i<st.length();i++) {
        for(int j=i+1;j<st.length();j++) {
            if(st.charAt(i)==st.charAt(j))
            st.deleteCharAt(j--);
        }
        }
        String S=new String(st);
    return S;
    }
}
