package lambdas.thread;

public class Trabalho implements Runnable {
    @Override
    public void run() {
        //..
        for(int i = 0; i < 10; i++) {
            System.out.println("TRABALHO 1");
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){  }
        }
    }
}
