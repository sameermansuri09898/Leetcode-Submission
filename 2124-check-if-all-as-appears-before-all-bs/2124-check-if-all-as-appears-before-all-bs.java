class Solution {
    public boolean checkString(String s) {
        boolean flagb = false;

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch =='b'){
                flagb = true;
            }
            if(ch =='a' && flagb){
                return false;
            }
            
        }
    return true; 
    }
}