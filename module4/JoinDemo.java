package module4;
class A1 extends Thread
{ 
	public void run() 
    { 
        for (int i = 1; i <= 10; i++) { 
            try 
				{ System.out.print(i + " "); 
				// Thread.sleep(500); 
            } 
            catch (Exception e) { 
                System.out.println(e); 
            } 
            
        } 
    } 
} 
class B1 extends Thread { 
	  
    public void run() 
    { 
    for (char i = 'a'; i <= 'k'; i++) { 
        try {
        System.out.print(i + " ");
            //Thread.sleep(500);
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
         
    } 
} 
} 
class JoinDemo { 
    public static void main(String args[]) 
    {         
    	A1 num1 = new A1(); 
        B1 alp1 = new B1(); 
          try {  
        	  //If t is a Thread object whose thread is currently executing, 
        	  //then t.join() will make sure that t is terminated before the
        	  //next instruction is executed by the program
        	 
             //alp1.join(); 
              num1.start();
              alp1.start(); 
              num1.join(); 
             
        	              
        }         catch (Exception e) { 
            System.out.println(e); 
        } // after thread num1 execution finished 
        // then apha thread completes
        
    } 
} 