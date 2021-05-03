package MeansOfCalculation;

import java.util.ArrayList;

public class Using2Threads implements ThreadCalculator {
    ArrayList<Long> toSumUp = new ArrayList<>();

    @Override
    public long calculate(int numberOfElements, int increment) {
        long startNumber;
        int numberOfIterations = (int) Math.floor(numberOfElements/2);

        MyThread t1 = new MyThread(numberOfIterations, increment, 0, this);
        startNumber = Assist.findValue(increment, numberOfIterations);
        MyThread t2 = new MyThread((2*numberOfIterations + numberOfElements%2), increment, startNumber, this);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return Assist.getAnswer(toSumUp);
    }

    @Override
    public synchronized void addToArray(long number) {
        toSumUp.add(number);
    }

}


