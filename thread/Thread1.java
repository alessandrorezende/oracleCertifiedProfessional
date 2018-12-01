import java.lang.Thread;

/*
Não é uma boa pratica de OO extender Thread quando se quer apenas
que uma Thread execute algum trabalho o correto é implementar a interface Runnable.
Deve ser extendido Thread apenas quando quer ter uma versão mais especializada
de thread.
*/
class ThreadFirst extends Thread {
  public void run(){
      System.out. println("Important job running in my first tread!");
  }
}

class ThreadSecond implements Runnable {
  public void run(){
      System.out. println("Important job running in my second tread!");
  }
}

class Thread1 extends Thread {
  public static void main(String ... args){
    ThreadFirst thread = new ThreadFirst();
    thread.run();

    ThreadSecond thread2 = new ThreadSecond();
    thread2.run();
  }
}
