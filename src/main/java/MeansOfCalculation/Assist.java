package MeansOfCalculation;

import java.util.ArrayList;

public class Assist {
     static long findValue (int increment, int number) {
        return (long) increment *(number);
    }
     static long getAnswer(ArrayList<Long> toSumUp) {
        long answer=0;
        for(long l : toSumUp) {
            answer+= l;
        }
        return answer;
    }
}
