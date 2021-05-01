package MeansOfCalculation;

import java.util.ArrayList;

public class Using2Threads {

    private Using2Threads(){}

    public static long calculate(int numberOfElements, int increment) {
        long answer = 0;
        int numberOfIterations = (int) Math.floor(numberOfElements/2);
        ArrayList<Long> toSumUp = new ArrayList<>();
        MyThread t1 = new MyThread(numberOfIterations, increment, 0, toSumUp); // multiply numberOfIterations by i
        MyThread t2 = new MyThread((2*numberOfIterations + numberOfElements%2), increment, findValue(increment, numberOfIterations), toSumUp);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(long l : toSumUp) {
            answer+= l;
        }
        return getAnswer(toSumUp);
    }

    private static long findValue (int increment, int number) {
        return increment*(number);
    }
    private static long getAnswer(ArrayList<Long> toSumUp) {
        long answer=0;
        for(long l : toSumUp) {
            answer+= l;
        }
        return answer;
    }
}


