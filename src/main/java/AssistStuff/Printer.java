package AssistStuff;

import AssistStuff.Flags;

public class Printer {
    private Printer(){}

    public static void print(long time, long result, Flags flag) {
        switch (flag) {
            case USING_MATH -> System.out.println("With formula it took " + time + "\nThe result is " + result);
            case USING_SINGLE_THREAD -> System.out.println("With single thread it took " + time + "\nThe result is " + result);
            case USING_2_THREADS -> System.out.println("With 2 threads it took " + time + "\nThe result is " + result);
            case USING_4_THREADS -> System.out.println("With 4 threads it took " + time + "\nThe result is " + result);
            case USING_8_THREADS -> System.out.println("With 8 threads it took " + time + "\nThe result is " + result);
            case USING_16_THREADS -> System.out.println("With 16 threads it took " + time + "\nThe result is " + result);
            case USING_32_THREADS -> System.out.println("With 32 threads it took " + time + "\nThe result is " + result);
            default -> System.out.println("LOL that shouldn't have happened");
        }
    }
}
