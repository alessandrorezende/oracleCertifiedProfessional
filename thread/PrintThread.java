class PrintThread {
    public static void main(String ... args){
      StringBuffer sb = new StringBuffer("ABC");
      Print print = new Print(sb);

      Thread t1 = new Thread(print);
      t1.start();
      Thread t2 = new Thread(print);
      t2.start();
      Thread t3 = new Thread(print);
      t3.start();
    }
}

class Print extends Thread {
  StringBuffer sb = new StringBuffer();
  int pos = 0;

  public Print(StringBuffer buffer){
      sb = buffer;
  }

  public void run(){
      synchronized(this){
          for(int x = 0; x <100; x++){
              System.out.print(sb.charAt(pos));
          }
          System.out.println("");
          pos++;

          try{
            Thread.sleep(500);
          }catch(Exception ex){}
      }
  }

}
