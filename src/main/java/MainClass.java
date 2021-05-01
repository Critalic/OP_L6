import MeansOfCalculation.Using2Threads;
import MeansOfCalculation.UsingFormula;
import MeansOfCalculation.UsingSingleThread;

public class MainClass {
    public static void main(String[] args) {
        int multiplier = 2;
        int quantityOfElements = 1000000000;
        long result =0;

        long startForFormula = System.nanoTime();
        result = UsingFormula.calculate(quantityOfElements, multiplier);
        Printer.print(System.nanoTime()-startForFormula, result, Flags.USING_MATH);

        long startForCycle = System.nanoTime();
        result = UsingSingleThread.calculate(quantityOfElements, multiplier);
        Printer.print(System.nanoTime()-startForCycle, result, Flags.USING_SINGLE_THREAD);

        long startFor2Threads = System.nanoTime();
        result = Using2Threads.calculate(quantityOfElements, multiplier);
        Printer.print(System.nanoTime()-startForCycle, result, Flags.USING_2_THREADS);

    }
}


