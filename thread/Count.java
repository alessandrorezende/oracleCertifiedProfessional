class Count{
    private static int ONE = 1;
    private static int TWO = 1;
    private static int THREE = 1;
    //possibilidades de formas de sincronizar um metodo estatico.
    public synchronized static int getCount(){
        return ONE + ONE;
    }

    public static int getCount2(){
        synchronized (Count.class) {
            return ONE + TWO;
        }
    }

    public static int getCount3() throws Exception{
        Class c1 = Class.forName("Count");
        synchronized(c1){
           return ONE + THREE;
        }
    }
}
