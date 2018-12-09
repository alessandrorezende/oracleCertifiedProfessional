public class Bank{

  public static void main(String ... args){
      Account acct = new Account();
      Thread one = new Thread(acct);
      Thread two = new Thread(acct);
      one.setName("Jose");
      two.setName("Maria");
      one.start();
      two.start();
  }
}

class Account implements Runnable {
  private int balance = 50;

  public void run(){
      for(int x=0; x <3; x++){
          this.makeWithdrawal(10);
          if(this.getBalance() < 0){
              System.out.println("A conta esta no vermelho!");
          }
      }
  }

  private synchronized void makeWithdrawal(int amt){
      if(getBalance() >= amt){
          System.out.println(Thread.currentThread().getName() + " esta fazendo uma retirada!");

          try{
              Thread.sleep(500);
          }catch(InterruptedException ex){}

          withdraw(amt);

          System.out.println(Thread.currentThread().getName() + " fez a retirada com sucesso!");
      }else{
          System.out.println("Nao ha dinheiro suficiente para " + Thread.currentThread().getName() + " retirar. Saldo: " + getBalance());
      }
  }

  public int getBalance(){
    return balance;
  }

  public void withdraw(int amount){
    balance = balance - amount;
  }
}
