public class MyThread1 extends Thread{

    private String name;
    private int n;

    public MyThread1(String name, int n) {
        this.name = name;
        this.n = n;
    }

    @Override
    public void run() {
        for(int i = 0; i<6;i++)
            System.out.println(name + " | " + i);
    }
}
