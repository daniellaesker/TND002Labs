package lab2;

public class Word {
   public final int ORIGINAL = 0, BYNAME = 1, BYCOUNTS = 2;
   private String theWord;
   private int count;
   public static int sortCriterion = 2;

   public Word(String arg1, int arg2) {
       theWord = arg1;
       count = arg2;
   }

   public int getCount() {

       return count;
   }

   public String getWord() {

       return theWord;
   }

   public static void setCriterion(int arg) {
       switch (arg) {
           case 0, 1, 2 -> sortCriterion = arg;
       }
   }

   public static int getCriterion() {
       return sortCriterion;
   }

   public int compareTo(Word arg) {
       return switch (sortCriterion) {
           case ORIGINAL -> 0;
           case BYNAME -> arg.theWord.compareTo(this.theWord);
           default -> Integer.compare(arg.count, this.count);
       };

   }

   public String toString() {
       return String.format("Word:%10s   Count:%3d", this.theWord, this.count);
   }

}

