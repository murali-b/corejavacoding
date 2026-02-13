public class PrintNumbersWithTwoThreads {
    private int counter = 1;
    private final int limit =10;
    public void printNumbers(){
        synchronized (this){
            while(counter <= limit){
                if(counter % 2 == 0 && Thread.currentThread().getName().equals("OddThread")){
                    try{
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else if(counter % 2 != 0 && Thread.currentThread().getName().equals("EvenThread")){
                    try{
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                } else {
                    System.out.println(Thread.currentThread().getName() + ":"+counter);
                    counter++;
                    notify();
                }
            }
        }
    }
    public static void main(String[] args){
        PrintNumbersWithTwoThreads print = new PrintNumbersWithTwoThreads();
        Thread t1 = new Thread(print::printNumbers,"OddThread");
        Thread t2 = new Thread(print::printNumbers,"EvenThread");
        t1.start();
        t2.start();
    }

}
