class ATM{

     // amount  = 9000.00
     static double amount  ;
	
	 // method to get totalAmount() ; 
	
	 public static void main(String a[]){
	 System.out.println("main method started");
	 
	 // invoking deposit method
	 deposit(9000.00);
	   getTotalAmount();
	  // invoking withDraw  method
	  withDraw(1000) ;
	    getTotalAmount();
	  // invoking deposit method
	  deposit(12000.00);
	  
	  // invoking getTotalAmount method
	  getTotalAmount();
	 System.out.println("main method ended");
	 }

// double amt = 9000.00
    static  void    deposit(double amt){
	System.out.println("invoked deposit()");
	System.out.println("Amount to be deposit"+ amt);
	System.out.println("Amount before deposit"+ amount);
	 // 9000.00 = 0.0 + 9000.00 ;
	   amount = amount+   amt ; 
	  System.out.println("Amount after deposit"+ amount);
	System.out.println("end of deposit()");
	}


  static  void    withDraw(double amt){
	System.out.println("invoked withDraw()");
	System.out.println("Amount to be withDrawn"+ amt);
	System.out.println("Amount before withDraw"+ amount);
	 // 9000.00 = 0.0 + 9000.00 ;
	   amount = amount-   amt ; 
	  System.out.println("Amount after withDraw"+ amount);
	System.out.println("end of withDraw()");
	}

public static void getTotalAmount(){
	System.out.println(amount);
}

   



}