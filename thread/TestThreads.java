
public class TestThreads{

    public static void main(String ... args){
        //--------------------------------------------------------------
      //Não é a melhor forma de executar uma thread
      ThreadFirst thread = new ThreadFirst();
      thread.run();
      //--------------------------------------------------------------
      //Forma correta de passar um trabalho para uma thread executar
      //em uma nova pilha de chamadas.
      //trabalho a ser feito
      MyRunnable job = new MyRunnable();
      //thread executa o trabalho
      Thread t = new Thread(job);
      t.start();
      //--------------------------------------------------------------
    }
}
