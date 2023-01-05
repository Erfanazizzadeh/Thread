class PrintThread implements Runnable{
    @Override
    public void run(){
    for (int i = 0 ;i<100;i++){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
    Thread CurrentThread = Thread.currentThread();
        System.out.println(CurrentThread.getId());
        System.out.println(CurrentThread.getName());//Every Thread have the name.
    }
}


public class Test {
    public static void main(String[] args) {
        new Thread(new PrintThread()).start();//Thread 2 Method run

        for (char c = 'A'; c<='Z';c++){//Thread 1
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(c);
        }
    }
}
