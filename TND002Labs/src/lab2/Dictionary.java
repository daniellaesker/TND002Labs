package lab2;

import java.util.ArrayList;
import java.util.Collections;

public class Dictionary {
   private ArrayList<Word> theList;
   private ArrayList<Word> backup = null;

   public Dictionary() {
       theList = new ArrayList<>();
   }

   public String addString(String arg) {
       boolean isNewWord = true;
       String returnValue = "";

       for (int i = 0; i < theList.size(); i++) {
           if (arg.equals(theList.get(i).getWord())) {
               isNewWord = false;
               int newCount = theList.get(i).getCount() + 1;
               Word newWord = new Word(arg, newCount);
               theList.set(i, newWord);
               returnValue = newWord.toString();
               break;
           }
       }

       if (isNewWord) {
           Word newWord = new Word(arg, 1);
           theList.add(newWord);
           returnValue = newWord.toString();
       }

       return returnValue;

   }

   public String sortList(int arg) {
      
       if (backup == null) {
           backup = new ArrayList<>();
           for (int i = 0; i < theList.size(); i++) {
               backup.add(i, theList.get(i));
           }
       }
       switch (arg) {
           case 0 -> {
               theList = backup;
               Word.sortCriterion = arg;
           }
           case 1,2 -> {
               Word.sortCriterion = arg;
               for (int i = 0; i < theList.size(); i++) {
                   for (int j = 0; j < theList.size() - i; j++) {
                       if (theList.get(j).compareTo(theList.get(j + 1)) < 0) {
                           Collections.swap(theList, j, j + 1);
                       }
                   }
               }
           }
       }
       String returnValue = "Sorting criterion undefined";
       if (arg ==1) {
    		   returnValue = "Sorted by count"; 
       }
       else if (arg == 2)
    		   returnValue = "Sorted alphabeticly";
       return returnValue;
   }
   	public String returnWord(int arg) {
   		
   		if (arg >= theList.size()) {
   			return "end";
   		}
   		else {
   			return theList.get(arg).toString();
   		}
   	}
   public String toString () {
	   String returnValue = "Content: \n";
	   for (Word w : theList) {
		   returnValue = w.toString(); 
	   }
	   returnValue = "Content: \n";
	   return returnValue;
   }
}

