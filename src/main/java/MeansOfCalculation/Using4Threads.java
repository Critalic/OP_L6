package MeansOfCalculation;

import java.util.ArrayList;

public class Using4Threads implements ThreadCalculator {
    private final ArrayList<Long> toSumUp = new ArrayList<>();
    private final ArrayList<Thread> threads = new ArrayList<>();

    @Override
    public long calculate(int numberOfElements, int increment) {
        long startNumber;
        int numberOfIterations = (int) Math.floor(numberOfElements / 4);

        for(int i=0; i<3; i++) {
            startNumber = Assist.findValue(increment, numberOfIterations*i);
            MyThread t1 = new MyThread((i+1)*numberOfIterations, increment, startNumber, this);
            threads.add(t1);
            t1.start();
        }
        startNumber = Assist.findValue(increment, numberOfIterations*3);
        MyThread t2 = new MyThread((4*numberOfIterations + numberOfElements % 4), increment, startNumber, this);
        threads.add(t2);
        t2.start();

        for(Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return Assist.getAnswer(toSumUp);
    }

    public void addToArray(long number) {
            toSumUp.add(number);
    }
}

