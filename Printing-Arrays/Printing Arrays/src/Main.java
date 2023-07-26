import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

	Integer [] intArray = {1, 2, 3, 4, 5 };
	Double [] doubArray = {1.1, 2.2, 3.3, 4.4};
	Character [] charArray = {'H','E','L', 'L', 'O' };
	String [] strArray = {"once", "upon", "a", "time" };
	
	//Calls each method to print specific array
	
    System.out.println("Print array using Objects as parameter method:");
	printArrayNonGen(intArray);
	printArrayNonGen(doubArray);
	printArrayNonGen(charArray);
	printArrayNonGen(strArray);
	System.out.println();

    System.out.println("Print array using Overloading method:");
	printArray(intArray);
	printArray(doubArray);
	printArray(charArray);
	printArray(strArray);
	System.out.println();

    System.out.println("Print array using Generic method:");
	printGenArray(intArray);
	printGenArray(doubArray);
	printGenArray(charArray);
	printGenArray(strArray);
	System.out.println();
	
    System.out.println("Print Max value for array using NonGeneric method:");
	System.out.println(getMax(intArray));
	System.out.println(getMax(doubArray));
	System.out.println(getMax(charArray));
	System.out.println(getMax(strArray));
	System.out.println();

    System.out.println("Print Max value for array using Generic method:");
	System.out.println(getMaxGen(intArray));
	System.out.println(getMaxGen(doubArray));
	System.out.println(getMaxGen(charArray));
	System.out.println(getMaxGen(strArray));
	System.out.println();

	
	
	
	
	
	}
	
	//1 Object method, taking in any object array
	static void printArrayNonGen(Object []a) { //for each statement, only content
	      for (Object element : a){  //This is the condition. List of each element? if the leement is in object arrar a print stuff
		         System.out.printf("%s ", element); //Makes SPACE between elements of array
		      }
		         System.out.println();

	}
		
	
	//2 Overloading Method, meaning just direct arrays
	   public static void printArray(Integer[] intArray) {
		      for (Integer element : intArray){
		         System.out.printf("%s ", element);
		      }
		         System.out.println();

		   }
		   public static void printArray(Double[] doubArray) {
		      for (Double element : doubArray){
		         System.out.printf("%s ", element);
		      }
		         System.out.println();

		   }
		   public static void printArray(Character[] charArray) {
		      for (Character element : charArray){
		         System.out.printf("%s ", element);
		      }
		         System.out.println();

		   }
		   
		   public static void printArray(String[] strArray) {
			      for (String element : strArray){
			         System.out.printf("%s ", element);
			      }
			         System.out.println();

			   }
		
	
	//3 Generic Method, 
	 public static <T> void printGenArray(T[] t) {
	      for (T element : t){
		         System.out.printf("%s ", element);
		      }
		         System.out.println();
	 }
	 
	 

	
	//4 Comparable using Objects to get MAX
	 
	 public static Comparable getMax(Comparable [] anArray) {//bubble sort


			 boolean sorted = false;
			 Comparable temp;

			 while(!sorted) { // if false
				 sorted = true;
			      for(int i = 0; i <anArray.length-1; i++)  {    
			          if(anArray[i].compareTo(anArray[i+1]) > 0) { //Compare Selected element to the one next, if return 1 proceed
			        	  										   // if Selected is great than Compared, will produce 1
			        	  temp =anArray[i];						   // x=a, a=b, b=x
			        	  anArray[i] = anArray[i+1];
			        	  anArray[i+1] =temp;					   // This will swap elements
			        	  sorted =false;						   // Sets back to false so that it can loop again
			              
			          }    
			      }
			 }// once compareTo doesnt return 1, sorted will equal true then break while
			 return anArray[anArray.length-1]; // this return max value, element at the end of list
		 
	 }

	
	//5 Comparable using Generic to get MAX
	 
	 public static <T extends Comparable> T getMaxGen(T[] anArray) { 
		 boolean sorted = false;
		 T temp;

		 while(!sorted) {
			 sorted = true;
		      for(int i = 0; i <anArray.length-1; i++)  {    
		          if(anArray[i].compareTo(anArray[i+1]) > 0) { 
		        	  
		        	  temp =anArray[i];
		        	  anArray[i] = anArray[i+1];
		        	  anArray[i+1] =temp;
		        	  sorted =false;
		              
		          }    
		      }
		 }
		 return anArray[anArray.length-1]; // why -1? bc out of bound if not, first element is 0
	 }
	
}
