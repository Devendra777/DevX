class SuperMarket{


public static void main(String a[])
{
   String  []perfume = {"fogg","Secret","Wild Stone","Engage","Yardley"};
      System.out.println(perfume[0] + "   "+ perfume[1] + "  "+ perfume[2] + "  "+ perfume[3] + " "+ perfume[4]);
System.out.println(perfume.length);
 String vegetablesAndFruits[]= {"tomato","Apple","potato","strawberry","Pumpkin" ,"Mango","DragonFruit","Litchie","carrot","kiwi","bitterguard"};

 int amountPerkg[]={12,100,20,120,40,100,60,80,30,120,89};
System.out.println(vegetablesAndFruits.length);
String total[] = fetchVegetablesAndPrice( vegetablesAndFruits , amountPerkg);
   for(String s : total)
{
System.out.println(s);
}


  }

   public static String[] fetchVegetablesAndPrice(String veggie[],  int amount[]){
 String totalVeggie[] =    new String[veggie.length];
for(int i=0 ; i< veggie.length ; i++) {
 veggie[i]  = veggie[i] + "   amount is " + amount[i];
totalVeggie[i] =  veggie[i];
}
return totalVeggie;
}
}