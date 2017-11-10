import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Sangi implements Runnable{
private String message;
public Sangi(String s){
	this.message=s;
}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"(start)message="+message);
		processmessage();
		System.out.println(Thread.currentThread().getName()+"(End)");
	}
	private void processmessage() {
	try{
		Thread.sleep(1000);
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
	
	
}
public class ThreadPool {

	public static void main(String[] args) {
	ExecutorService es=Executors.newFixedThreadPool(5);
	for(int i=0;i<10;i++){
		Runnable s1=new Sangi(""+i);
		es.execute(s1);
	}
	es.shutdown();
	 while (!es.isTerminated()) {   }  
	  
     System.out.println("Finished all threads");  
	}

}
