class AmazonPrime{

static String movies[] =  {"Shershah","Cindrella","RakthaCharitra","Jaathi Rathnalu","Robert","KGF2","Yuvaratna","Master","Lights Out","Quite Place"};
static String series[] = {"Mirzapur","The Family Man","Four More shots","Vampire Diaries","Mumbai Diaries","Originals","The last ship","Inside Edge","Panchayat"};

static String movie = "Dia";

public static void main(String a[]){
System.out.println("main method started");
getMovies(movies);
String mov = getMovies( movie );
System.out.println(mov);

}


public static void getMovies(String[] movies){
System.out.println("inside getMovies method with string array parameters");
for(int i=0 ; i < movies.length ; i++){
System.out.println(movies[i]);
}

}

public static String getMovies(String movie){
System.out.println("inside getMovies method");
return movie;

}


public static void getSeries(String[] series){
for (int i=0 ; i < series.length; i++){
System.out.println(series[i]);

}
}



}