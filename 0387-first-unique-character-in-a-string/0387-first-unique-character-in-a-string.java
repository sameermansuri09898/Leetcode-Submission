class Solution {
    public int firstUniqChar(String s) {
        for(int i =0;i<s.length();i++){
            
            char a = s.charAt(i);
            boolean flag = true;
           
            for(int j=0;j<s.length();j++){
                
                char b = s.charAt(j);
                
                if(i!=j && a==b){
                    flag = false;
                    break;
                }
            }
            
            if(flag){
                return i;
            }
            
        }
    return -1;    
       
    }
}