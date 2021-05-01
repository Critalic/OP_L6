package MeansOfCalculation;

import java.util.ArrayList;

public class Using4Threads {
    public static long calculate(int numberOfElements, int increment) {
        long answer = 0;
        int numberOfIterations = (int) Math.floor(numberOfElements / 2);
        ArrayList<Long> toSumUp = new ArrayList<>();
        for(int i=0; i<3; i++) {
            MyThread t1 = new MyThread(numberOfIterations, increment, findValue(increment, numberOfIterations), toSumUp); // multiply numberOfIterations by i
        }
        MyThread t2 = new MyThread((numberOfIterations + numberOfElements % 4), increment, 0, toSumUp);

    }

    private static long findValue (int increment, int number) {
        return increment*(number);
    }
}

