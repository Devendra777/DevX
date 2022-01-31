class Reverse{

// main , toCharArray , println -- inbuilt methods
public static void main(String a[]){

      String rev =  "hundred";
      
      
    System.out.println(reverseString(rev));

}

// reverseString - user defined method
public static String reverseString(String rev){
  System.out.println("invoked reverseString()");
  
    System.out.println("The length of rev is " + rev.length());
   
     
    //"hundred"
       String finalReversedString ="";
       // converts String to char array   
      char ch[]=  rev.toCharArray() ; 
     for(int i=ch.length-1 ; i >= 0   ; i--){
     	//System.out.print("inside for");
     	finalReversedString = finalReversedString + ch[i] ; 
     }
  System.out.println("end of reverseString()");
     return finalReversedString ; 
}




}