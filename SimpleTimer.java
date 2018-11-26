public class SimpleTimer {
 public static void main(String[] args) //main class
 {
  Thread t1 = new Thread(new Runnable() 
  {
@Override
  public void run() {
  for(int i = 0; i < 5; i++)
  {
  try {
  Thread.sleep(30000);
    } 
	catch (InterruptedException e)
	{
    e.printStackTrace();
   }
 System.out.println("Simple Timer that can periodically print a timeout message T1 : "+i);
  }
    }
  });// using runnable method which will use thread function
Thread t2 = new Thread(new Runnable() {
@Override
   public void run() {
    for(int i = 0; i < 5; i++) {
     try {
     Thread.sleep(30000);
     }
	 catch (InterruptedException e) {
                        
      e.printStackTrace();
                    }
    System.out.println("Simple Timer that can periodically print a timeout message T2 : "+i);
                }
            }
        });

        t1.start();
        t2.start();
		System.out.println("The statement will print in after every 30 seconds cycle");
    }
	
}