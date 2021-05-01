//package MeansOfCalculation;
//
//import java.util.ArrayList;
//
//public class Using8Threads {
//    public static long calculate(int numberOfElements, int increment) {
//        MyThread t1=null;
//        long startNumber =0;
//        int numberOfIterations = (int) Math.floor(numberOfElements / 8);
//        ArrayList<Long> toSumUp = new ArrayList<>();
//
//        for(int i=0; i<7; i++) {
//            startNumber = findValue(increment, numberOfIterations*i);
//            t1 = new MyThread((i+1)*numberOfIterations, increment, startNumber, toSumUp);
//            t1.start();
//        }
//        startNumber = findValue(increment, numberOfIterations*7);
//        MyThread t2 = new MyThread((8*numberOfIterations + numberOfElements % 8), increment, startNumber, toSumUp);
//        t2.start();
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return getAnswer(toSumUp);
//    }
//
//    private static long findValue (int increment, int number) {return increment*(number);}
//    private static long getAnswer(ArrayList<Long> toSumUp) {
//        long answer=0;
//        for(long l : toSumUp) {
//            answer+= l;
//        }
//        return answer;
//    }
//}
