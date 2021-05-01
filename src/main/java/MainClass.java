import MeansOfCalculation.*;

public class MainClass {
    public static void main(String[] args) {
        int multiplier = 2;
        int quantityOfElements = 16;
        long result =0;

        long startForFormula = System.nanoTime();
        result = UsingFormula.calculate(quantityOfElements, multiplier);
        Printer.print(System.nanoTime()-startForFormula, result, Flags.USING_MATH); //TODO make it non static + implement Calculator

        long startForCycle = System.nanoTime();
        result = UsingSingleThread.calculate(quantityOfElements, multiplier);
        Printer.print(System.nanoTime()-startForCycle, result, Flags.USING_SINGLE_THREAD);

//        long startFor2Threads = System.nanoTime();
//        result = Using2Threads.calculate(quantityOfElements, multiplier);
//        Printer.print(System.nanoTime()-startFor2Threads, result, Flags.USING_2_THREADS);


        long startFor4Threads = System.nanoTime();
        result = Using4Threads.calculate(quantityOfElements, multiplier);
        Printer.print(System.nanoTime()-startFor4Threads, result, Flags.USING_4_THREADS);

//        long startFor8Threads = System.nanoTime();
//        result = Using8Threads.calculate(quantityOfElements, multiplier);
//        Printer.print(System.nanoTime()-startFor8Threads, result, Flags.USING_8_THREADS);
    }
}


