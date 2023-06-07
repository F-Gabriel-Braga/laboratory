package lambdas.thread;

public class Threads {
    public static void main(String[] args) {
        // Threads: Processo que pode ser executado paralelamente

        // Intância de uma interface gera:
        // Implementação de uma classe anônima
        Trabalho trabalho1 = new Trabalho();
        Runnable trabalho2 = new Runnable() {
            @Override
            public void run() {
                //..
                for(int i = 0; i < 10; i++) {
                    System.out.println("TRABALHO 2");
                    try{
                        Thread.sleep(1000);
                    }
                    catch (Exception e){  }
                }
            }
        };

        Runnable trabalho3 = () -> {
            for(int i = 0; i < 10; i++) {
                System.out.println("TRABALHO 3");
                try{
                    Thread.sleep(1000);
                }
                catch (Exception e){  }
            }
        };

        Thread t1 = new Thread(trabalho1);
        Thread t2 = new Thread(trabalho2);
        Thread t3 = new Thread(trabalho3);

        t1.start();
        t2.start();
        t3.start();
    }
}
