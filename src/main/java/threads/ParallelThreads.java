package threads;

public class ParallelThreads {
    public static void main(String[] args) {
        Thread myThred=new Thread(new printerThread());
        myThred.start();
        for (int i=0; i<5 ; i++){
            try {

                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }

        }

    }

   static class printerThread implements  Runnable{

        @Override
       public void run(){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

}
