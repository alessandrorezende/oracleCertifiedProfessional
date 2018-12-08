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

/*
  Saber o nome da thread que está executando meu Runnable
*/
class NameRunnable implements Runnable {
  public void run(){
    System.out.println("Name Runnable running.. Run by " + Thread.currentThread().getName());
  }
}

class NamesRunnable implements Runnable {
  public void run(){
    for(int i=0; i<3; i++){
      System.out.println("Run by " + Thread.currentThread().getName() +" -  i is " + i);
      try{
          Thread.sleep(1000);
      }catch(InterruptedException ex){}
    }
  }
}

class CountRunnable implements Runnable{

  public void run(){
     for(int i=1;i<=100;i++){
       if(i % 10 == 0){
          System.out.println("Contagem igual a " + i);
       }
       try{
           Thread.sleep(1000);
       }catch(InterruptedException ex){}
     }
  }
}

class RunningThread implements Runnable{

  public void run(){
    System.out.println(Thread.currentThread().getName() + " is running...");
  }

}
