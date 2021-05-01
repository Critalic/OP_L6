package MeansOfCalculation;

import java.util.ArrayList;

public class Using2Threads {

    private Using2Threads(){}

    public static long calculate(int numberOfElements, int increment) {
        long answer = 0;
        int numberOfIterations = (int) Math.floor(numberOfElements/2);
        ArrayList<Long> toSumUp = new ArrayList<>();
        MyThread t1 = new MyThread(numberOfIterations, increment, findValue(increment, numberOfIterations), toSumUp); // multiply numberOfIterations by i
        MyThread t2 = new MyThread((numberOfIterations + numberOfElements%2), increment, 0, toSumUp);

        t1.run();
        t2.run();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(long l : toSumUp) {
            answer+= l;
        }
        return answer;
    }

    private static long findValue (int increment, int number) {
        return increment*(number);
    }
}


