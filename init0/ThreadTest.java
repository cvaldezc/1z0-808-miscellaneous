class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("In run method; thread name is: " + Thread.currentThread().getName());
  }
}

public class ThreadTest {

  public static void main(String[] args) {
    Thread myThread = new MyThread();
    myThread.start();
    System.out.println("In main method; thread name is: "+ Thread.currentThread().getName());
  }
}