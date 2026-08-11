class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalg=0,totalcost=0;
        int start=0, currgas=0;
        for(int i=0; i<gas.length; i++){
            totalg +=gas[i];
            totalcost += cost[i];
            currgas += (gas[i]-cost[i]);
            if(currgas <0){
                start =i+1;
                currgas =0;
            }
        }
    
    return totalg<totalcost ? -1 :start;
    }
}