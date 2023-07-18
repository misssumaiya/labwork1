package problem_E1_2;

public class SeriesSummation {
    private int result;
    public SeriesSummation(){
        result=0;
    }
    public int SeriesSummation(int highestNumber)
    {
        for(int loopCount =1;loopCount<=highestNumber;loopCount++)
        {
            result=result+loopCount;
        }
        return result;
    }
}
