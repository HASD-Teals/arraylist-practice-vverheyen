import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) throws Exception {
        
        List <String> Trial = new ArrayList <String>();
        List <Integer> Num = new ArrayList <Integer>();
        Num.add(1);
        Num.add(3);
        Trial.add(0,"dog");
        Trial.add("cats");
        Trial.add("cat");
        System.out.println(Trial);
        doubleList(Trial);
        System.out.println(Trial);

    }
    public static void removeEvenLength(List<String> a) {
        for (int i=0; i<a.size(); i++) {
            if (a.get(i).length()%2==0) {
                a.remove(i);
            }
        }
    }

    public static void averageVowels(List<String> a) {
        double counter=0;
        for (int i=0; i<a.size(); i++) {
            for (int j=0; j<a.get(i).length();j++) {
                if (a.get(i).charAt(j) =='a') {
                    counter++;
                }
                if (a.get(i).charAt(j) =='e') {
                    counter++;
                }
                if (a.get(i).charAt(j) =='i') {
                    counter++;
                }
                if (a.get(i).charAt(j) =='o') {
                    counter++;
                }
                if (a.get(i).charAt(j) =='u') {
                    counter++;
                }
            }
        }
        if (counter==0) { System.out.println("Average of 0.0 vowels"); }
        else { System.out.println("Average of "+(counter/a.size())+" vowels"); }
    }

        public static void removeDuplicates(List<String> a) {
            for (int i=0;i<a.size();i++) {
                for (int j=0; j<a.size(); j++) {
                    if (a.get(i)==a.get(j)) { 
                        a.remove(j);
                    }
                }
            }
        }
    
        //under construction
        public static void doubleList(List<String> a) {
            for (int i=0; i<a.size()*2-1; i=i+2) {
                if (i<a.size()*2-3) {
                a.add(i+1,a.get(i)); 
                }
                else {
                    a.add(a.get(a.size()*2-2));
                }
            }
            
        }
        
        public static void minToFront(List<Integer> a) {

        }
}

