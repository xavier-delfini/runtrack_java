public class MyThread extends Thread{
    public static void main(String[] args){

        MyThread thread = new MyThread();
        thread.start();
    }
    public void run(){
        System.out.println("Mon thread est en cours");
    }
}
