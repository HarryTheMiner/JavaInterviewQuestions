package threadsinjava;

class Printer
{
    private int number = 1;
    private final int MAX = 10;


    public synchronized void printOdd()
    {
        while(number <= MAX)
        {
            if(number % 2 ==1)//odd
            {
                System.out.println("Odd : "+ number);
                number++;
                notify();
            }
            else
            {
                try
                {
                    wait();
                }
                catch (InterruptedException e)
                {
                e.printStackTrace();

                }
            }
        }

    }
    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                System.out.println("Even " + number);
                number++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
public class InterThreadComm
{
    public static void main(String[] args)
    {
        Printer printer = new Printer();

        Thread oddThread = new Thread(() ->printer.printOdd());
        Thread evenThread = new Thread(() ->printer.printEven());

        oddThread.start();
        evenThread.start();

    }
}
