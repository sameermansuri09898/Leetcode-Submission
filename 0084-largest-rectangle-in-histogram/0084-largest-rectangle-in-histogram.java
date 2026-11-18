class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> s = new Stack<>();
        int nsl [] = new int[heights.length];
        int nsr [] = new int[heights.length];
        int max =0;


        // for left to right smaller next
        for(int i =heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[i] <= heights[s.peek()]){
               s.pop(); 
            }
            if(s.isEmpty()){
                nsr[i] = heights.length;
            }
            else{
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        s.clear();
        // for left to right
        for(int i =0;i<heights.length;i++){
            while(!s.isEmpty() && heights[i] <= heights[s.peek()]){
               s.pop(); 
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        // now calculate the area 
        for(int i =0;i<heights.length;i++){
            
            int current_area = heights[i] * (nsr[i] - nsl[i] - 1);
            max = Math.max(max,current_area);

        }

    return max;    
    }
}