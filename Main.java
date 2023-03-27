public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MyThread1 t1 = new MyThread1("T1", 0);
        MyThread2 t2 = new MyThread2("T2", 1);

        System.out.println("THREAD MAIN HA FINITO. ORA LANCIO I DUE THREAD");
        t1.start();
        t2.start();
    }
}