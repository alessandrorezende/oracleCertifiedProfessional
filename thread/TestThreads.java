
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
      //3ex: Informar um nome para a thread que executará meu jobName
      System.out.println("---------------------------------------------");
      NameRunnable jobName = new NameRunnable();

      Thread t1 = new Thread(jobName);
      t1.setName("Trabalhador 01");
      t1.start();
      //--------------------------------------------------------------
      //4ex: Saber o nome da thread execuntando o main
      System.out.println("Thread execuntado o main is: " + Thread.currentThread().getName());
      //--------------------------------------------------------------
      //5ex:Iniciando e executando multiplas Threads
      System.out.println("---------------------------------------------");
      NamesRunnable jobsName = new NamesRunnable();

      Thread one = new Thread(jobsName);
      Thread two = new Thread(jobsName);
      Thread three = new Thread(jobsName);

      one.setName("Pedreiro 1");
      two.setName("Pedreiro 2");
      three.setName("Pedreiro 3");

      one.setPriority(Thread.MIN_PRIORITY);
      one.start();
      two.setPriority(Thread.NORM_PRIORITY);
      two.start();
      try{
          three.setPriority(Thread.MAX_PRIORITY);
          three.start();
          three.join();
      }catch(InterruptedException ex){
        ex.printStackTrace();
      }

      //--------------------------------------------------------------
      //6ex: contando de 1 até 100 fazend a thread dormir por 1 segundo a cada numero
      //e exibe uma string a cada dez números
      System.out.println("---------------------------------------------");
      CountRunnable jobCount = new CountRunnable();

      Thread countT = new Thread(jobCount);
      countT.start();
        //--------------------------------------------------------------

    }
}
