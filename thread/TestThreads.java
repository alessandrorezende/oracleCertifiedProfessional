
public class TestThreads{

    public static void main(String ... args){
      //--------------------------------------------------------------
      //1ex: Não é a melhor forma de executar uma thread
      //a execução é passada para pilha de chamadas atual NÃO
      //uma nova pilha como no segundo exemplo.
      ThreadFirst thread = new ThreadFirst();
      thread.run(); //Válido, mas não começa uma nova thread
      
      //--------------------------------------------------------------
      //2ex: Forma correta de passar um trabalho para uma thread executar
      //em uma nova pilha de chamadas.

      //trabalho a ser feito
      MyRunnable job = new MyRunnable();
      //thread executa o trabalho
      Thread t = new Thread(job);
      t.start();
      //--------------------------------------------------------------
    }
}
