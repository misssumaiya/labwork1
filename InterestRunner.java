package problem_E1_4;

public class InterestRunner {
    public static void main(String[]args) {

    InterestCal myinterest=new InterestCal();
        {
            System.out.println("balance after 1 year:" + myinterest.calculate(1, 10000, 5) + "$");
            System.out.println("balance after 2 year:" + myinterest.calculate(2, 10000, 5) + "$");
            System.out.println("balance after 3 year:" + myinterest.calculate(3, 10000, 5) + "$");

        }
    }

}
