//THI00-J Do not invoke Thread.run()
//non compliant version

public class R10_THI00_J {

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread is running");
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run(); // Noncompliant: runs like a normal method call
    }
}
