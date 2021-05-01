package MeansOfCalculation;

public class UsingFormula {

    private UsingFormula() {}

    public static long calculate(int numberOfElements, int increment) {
        int lastNumber = increment*(numberOfElements);
        long answer = (long) ((increment + lastNumber) / 2) *numberOfElements;
        return answer;
    }
}
