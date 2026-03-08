//THI00-J Do not invoke Thread.run()
//compliant version
//fix by replacing run() with start() method to tell the jvm to create a new thread and then call run() method within new thread


public class R10_THI00_J {

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread is running");
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // Compliant: starts a new thread
    }
}
