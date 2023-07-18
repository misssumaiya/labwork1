package problem_E1_3;

public class ProductMult {
    private int result;
    public ProductMult()
    {
        result=1;
    }
    public int productMul(int n)
    {
        for(int i=1;i<=n;i++)
            result=result*i;
        return result;
    }

}
