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

/*Representa o trabalho a ser feito logo no metodo run()
é definido o trabalho e depois passado para uma thread
executar no metodo main
*/
class MyRunnable implements Runnable {
  public void run(){
      System.out. println("Important job running in MyRunnable!");
  }
}
