Using Runnable interface->

class MyTask implements Runnable {

    String curr;

    MyTask(String temp) {
        this.curr = temp;
    }

    public void run() {
        for(int i = 0; i <= 5; i++) {
            System.out.println(curr + " " + i);
        }
    }
}

class Main {
    public static void main(String[] args) {

        // First create Runnable objects
        MyTask task1 = new MyTask("Thread 1");
        MyTask task2 = new MyTask("Thread 2");

        // Then create Thread objects
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Start threads
        t1.start();
        t2.start();
    }
}


By inheriting ->

class myTask extends Thread{

    String curr;

    myTask(String temp){

        this.curr=temp;
    }

    public void run(){

        for(int i=0;i<=5;i++){
            System.out.println(curr+' '+i);
        }
    }
}
class Main{

    public static void main(String args[]){

        myTask t1= new myTask("Thread a");
        myTask t2= new myTask("Thread b");

        t1.start();
        t2.start();
        
    }
}





