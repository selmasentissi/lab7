import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListbou
{

	public static void main(String[] args)
	{
		
		LinkedList<String> listA = new LinkedList <String>();
	    listA.add("Tulsa");
	    listA.add("Ada");
	    listA.add("Broken Arrow");
	    listA.add("Owasso");
	    listA.add(1,"okc");
	    
	    System.out.println(listA);
	  
	    ListIterator<String> listAIter = listA.listIterator();
	    
	    LinkedList<String> listB = new LinkedList <String>();
	    listB.add("74104");
	    listB.add("74135");
	    listB.add("foo");
	    listB.add("hello world");
	    listB.add("777");
	    
	    System.out.println(listB);
	    ListIterator<String> listBIter = listB.listIterator();
	 
	    
	   while  (listBIter.hasNext())
	   {
		   while (listAIter.hasNext())
		   {
                listAIter.next();
			   listAIter.add(listBIter.next());
		   }	    
	   }
	 System.out.println(listA);
	 
	  while(listAIter.hasNext()==true)
	  {	 
			listAIter.next();
			while (listAIter.hasNext())
			listAIter.remove();
	  }
	  System.out.println(listA);
	  	
	LinkedList<String> listC = new LinkedList <String>();
	ListIterator<String> listCIter = listC.listIterator();
	
	while (listAIter.hasNext())
	{
		listCIter.add( listAIter.next());
	}
        System.out.println(listC);
	}//end main
}
