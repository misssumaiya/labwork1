package problem_E1_4;

public class InterestCal {
    public double calculate(double year,double capital,double rate)
    {
        double ans = capital*Math.pow(1.0+(rate/100.0),year);
      return ans;
    }
}
