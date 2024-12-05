import java.util.ArrayList;

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> score = new ArrayList<>();
        
        for (String op : operations) {
            if (op.equals("C")) {
                if (!score.isEmpty()) {
                    score.remove(score.size() - 1);
                }
            } else if (op.equals("D")) {
                if (!score.isEmpty()) {
                    score.add(score.get(score.size() - 1) * 2);
                }
            } else if (op.equals("+")) {

                int size = score.size();
                if (size >= 2) {
                    score.add(score.get(size - 1) + score.get(size - 2));
                } else if (size == 1) {
                    score.add(score.get(size - 1)); 
                }
            } else {
 
                score.add(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int i : score) {
            sum += i;
        }

        return sum;
    }
}
