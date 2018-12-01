
public class Exercise1{

    public static void main(String ... args){
      ThreadFirst thread = new ThreadFirst();
      thread.run();

      //trabalho a ser feito
      MyRunnable job = new MyRunnable();
      //thread executa o trabalho
      Thread t = new Thread(job);
      t.run();

    }
}
