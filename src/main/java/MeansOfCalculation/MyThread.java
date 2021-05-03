package MeansOfCalculation;

class MyThread extends Thread {
    private final int numberOfIterations;
    private final int increment;
    private final long startNumber;
    private final ThreadCalculator Calc;

    public MyThread(int numberOfIterations, int increment, long startNumber, ThreadCalculator Calc) {
        this.increment = increment;
        this.numberOfIterations = numberOfIterations;
        this.startNumber = startNumber;
        this.Calc = Calc;
    }

    @Override
    public void run() {

        long answer = 0;
        long factor = startNumber / increment;
        for (long i = 1 + factor; i <= numberOfIterations; i++) {
            answer += increment * (i);
        }

        Calc.addToArray(answer);

    }
}
