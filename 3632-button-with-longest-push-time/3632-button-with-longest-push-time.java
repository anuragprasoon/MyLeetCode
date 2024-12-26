class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int maxTime = events[0][1]; 
        int maxIndex = events[0][0]; 
        
        for (int i = 1; i < events.length; i++) {
            int currentTime = events[i][1] - events[i - 1][1];
            if (currentTime > maxTime || (currentTime == maxTime && events[i][0] < maxIndex)) {
                maxTime = currentTime;
                maxIndex = events[i][0];
            }
        }
        return maxIndex;
    }
}