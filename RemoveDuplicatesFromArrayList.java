


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesFromArrayList {

    public static void main(String args[]) {
   
        //ArrayList with duplicates String
        List<String> duplicateList = (List<String>) Arrays.asList("Anish" , "Anita", "Anokhi", "shreya","Monty","Anish","Aman", "Sweety", "Shreya");
       
        System.out.println("size of Arraylist with duplicates: " + duplicateList.size());      
        System.out.println("ArrayList with duplicates: " + duplicateList);
     
        //Converting ArrayList to HashSet to remove duplicates as hashset dont keep duplicates
        LinkedHashSet<String> listToSet = new LinkedHashSet<String>(duplicateList);
     
        
        List<String> listWithoutDuplicates = new ArrayList<String>(listToSet);

        
        System.out.println("size of ArrayList without duplicates: " + listToSet.size());
        System.out.println("ArrayList after removing duplicates in same order: " + listWithoutDuplicates);
     
     
    }
 
}
