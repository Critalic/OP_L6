import AssistStuff.*;
import MeansOfCalculation.*;

public class MainClass {
    public static void main(String[] args) {
        int multiplier = 2;
        int quantityOfElements = 1000000000;
        long result;

        long startForFormula = System.nanoTime();
        result = UsingFormula.calculate(quantityOfElements, multiplier);
        Printer.print(System.nanoTime()-startForFormula, result, Flags.USING_MATH);

        long startForCycle = System.nanoTime();
        result = UsingSingleThread.calculate(quantityOfElements, multiplier);
        Printer.print(System.nanoTime()-startForCycle, result, Flags.USING_SINGLE_THREAD);

        Using2Threads using2Threads = new Using2Threads();
        long startFor2Threads = System.nanoTime();
        result = using2Threads.calculate(quantityOfElements, multiplier);
        Printer.print(System.nanoTime()-startFor2Threads, result, Flags.USING_2_THREADS);

        Using4Threads using4Threads = new Using4Threads();
        long startFor4Threads = System.nanoTime();
        result = using4Threads.calculate(quantityOfElements, multiplier);
        Printer.print(System.nanoTime()-startFor4Threads, result, Flags.USING_4_THREADS);

        Using8Threads using8Threads = new Using8Threads();
        long startFor8Threads = System.nanoTime();
        result = using8Threads.calculate(quantityOfElements, multiplier);
        Printer.print(System.nanoTime()-startFor8Threads, result, Flags.USING_8_THREADS);

        Using16Threads using16Threads = new Using16Threads();
        long startFor16Threads = System.nanoTime();
        result = using16Threads.calculate(quantityOfElements, multiplier);
        Printer.print(System.nanoTime()-startFor16Threads, result, Flags.USING_16_THREADS);

        Using32Threads using32Threads = new Using32Threads();
        long startFor32Threads = System.nanoTime();
        result = using32Threads.calculate(quantityOfElements, multiplier);
        Printer.print(System.nanoTime()-startFor32Threads, result, Flags.USING_32_THREADS);
    }
}


