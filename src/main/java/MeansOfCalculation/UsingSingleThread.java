package MeansOfCalculation;

public class UsingSingleThread {
    private UsingSingleThread() {}

    public static long calculate(int numberOfElements, int increment) {
        long answer =0;
        for(int i=1; i<=numberOfElements; i++) {
            answer+= increment*i;
        }
        return answer;
    }
}
