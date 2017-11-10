
public class Sample extends Thread{
public void run(){
	System.out.println("Thread Running using extending Thread class");
	/*for(int i=0;i<5;i++){
	try{
	Thread.sleep(1000);
		
	}
	catch(Exception e){
		System.out.println(e);
	}
	System.out.println(i);
	}
	
	
	
	//System.out.println("Thread Running using Runnable Interface");
*/
}
	public static void main(String[] args) {
		Sample s1=new Sample();
		Sample s2=new Sample();
		System.out.println("Name of Thread:"+s1.getName());
		System.out.println("Name of Thread:"+s2.getName());
		System.out.println("Id of s1:"+s1.getId());
		//Thread t1=new Thread(s1);
		s1.start();
		s2.start();
		
		s1.setName("sangeetha");
		System.out.println("After changing the s1 Name:"+s1.getName());
	}
	
}
