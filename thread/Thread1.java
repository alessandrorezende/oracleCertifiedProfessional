import java.lang.Thread;

class ThreadFirst extends Thread {
  public void run(){
      System.out. println("Important job running in my tread");
  }
}

class Thread1 extends Thread {
  public static void main(String ... args){
    ThreadFirst thread = new ThreadFirst();
    thread.run();
  }
}
