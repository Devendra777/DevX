class ShowRoom {

      // instance variables
       int id ; 
	  String location ; 
	  long contactNo ;
	  String manager ;
  
   // static Variables
   static String name = "Adidas";
   static int noOfBranches = 45 ; 
	  // Parameterized Constructor
	  public ShowRoom(int id, String location , long contactNo ) {
		  //  this keyword help compiler to point to instance variables 
	            this.  id =      id ; 
				   this.location   =        location ; 
				      this.contactNo         =  contactNo;
					
	  }
	  
	  
	  
	  
	  
	  // main method -- starting point
	    public static void main(String a[]){
		  
     // Constrcutor are used to init instance variables of a class		  
	 ShowRoom show = new ShowRoom(1,"ViJayanagar" , 8908908907L);
	
     System.out.println(show.id + "  "+ show.location + "  "+ show.contactNo );
	 ShowRoom show1 = new ShowRoom(2,"Jayanagar",3453453459L);
	
     System.out.println(show1.id + "  "+ show1.location + "  "+ show1.contactNo );
	  
     System.out.println(ShowRoom.name + "  "+ ShowRoom.noOfBranches);
	  
	  }
      	 

}