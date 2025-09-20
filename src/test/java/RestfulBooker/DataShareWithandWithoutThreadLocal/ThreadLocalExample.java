package RestfulBooker.DataShareWithandWithoutThreadLocal;

//there might be a chnace to same data pass to other instances
// when u run all script in paralal mode so to avoid that we need to use ThreadLocal in our script

public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal counter1=new ThreadLocal();
        counter1.set("Mallesh");
        String savedname=(String)counter1.get();
        System.out.println("saved name is...from thread local..."+savedname);

        counter1.remove();
        System.out.println("After Removed Name..from thread local..."+(String)counter1.get());


        ThreadLocal counter2= ThreadLocal.withInitial(() -> "Ragava");
        System.out.println("saved name is...from thread local..."+(String)counter2.get());


        ThreadLocal counter3=new ThreadLocal();
        counter3.set("Raama");

        System.out.println("without costing Get call..."+counter3.get());

    }





}
