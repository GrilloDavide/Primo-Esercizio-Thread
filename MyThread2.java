public class MyThread2 extends Thread{

    private String name;
    private int n;

    public MyThread2(String name, int n) {
        this.name = name;
        this.n = n;
    }

    @Override
    public void run() {
        for(int i = 5; i>-1;i--)
            System.out.println(name + " | " + i);
    }
}
