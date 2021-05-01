package MeansOfCalculation;

import java.util.ArrayList;

class MyThread extends Thread {
    private final int numberOfIterations;
    private final int increment;
    private final long startNumber;
    private final ArrayList<Long> list;

    public MyThread(int numberOfIterations, int increment, long startNumber, ArrayList<Long> list) {
        this.increment = increment;
        this.numberOfIterations = numberOfIterations;
        this.startNumber = startNumber;
        this.list = list;
    }

    @Override
    public void run() {
        long answer =0;
        long factor = startNumber/increment;
        for(long i=1+factor; i<=numberOfIterations; i++) {
            answer+= increment *(i);
        }
        try {
            sleep(3+list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.add(answer);
    }
}
