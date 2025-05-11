public class Solution {
    private double sol;
    private boolean isNull;
    public double getSol() {
        return sol;
    }

    public Solution(double sol) {
        this.sol = sol;
    }
    public Solution(){
        isNull = true;
        sol = 0;
    }
    public boolean isNull(){
        return isNull;
    }
}
