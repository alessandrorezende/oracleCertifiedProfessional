class TestThreads1{

public static void main(String [] args) throws Exception{
    System.out.println(Thread.currentThread().getName() + " is running...");

    RunningThread rThread = new RunningThread();
    Thread b = new Thread(rThread);
    b.setName("B");
    Thread c = new Thread(rThread);
    c.setName("C");
    Thread d = new Thread(rThread);
    d.setName("D");

    b.start();
    c.start();
    c.join(); //Thread main aguarda C terminar para depois voltar a executar
    d.start();

    System.out.println(Thread.currentThread().getName() + " is running...");
}

}
