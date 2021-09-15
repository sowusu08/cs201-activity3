import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CounterAttack {
    public int[] /*static void*/ analyze(String str, String[] words) {
        String[] split_ = str.split(" ");

        // initialize empty arrayList, ret, with a length the size of the words array
        // int[] ret = new int[words.length];
        ArrayList<Integer> tallies = new ArrayList<>();

        // initialize empty hashmap to keep tally of letter occurrences
        HashMap<String, Integer> map = new HashMap<>();

        // loop through each element in split_
        for(String letter : split_){
            // if the map does contain a key for the letter, replace the value with value + 1
            if(map.containsKey(letter)){
                map.put(letter, (map.get(letter) + 1));
            } else { // if the map doesn't contain a key for the letter, add a key for the letter and add a tally
                map.put(letter, 1);
            }
        }

        // loop through each value of words
        for(String letter : words){
            // if the word was tallied add its value to the arrayList
            if(map.containsKey(letter)){
                tallies.add(map.get(letter));
            } else { // otherwise add a 0 to the arrayList
                tallies.add(0);
            }
        }

        // return ret ArrayList as int array
        //return ret.toArray(new int[ret.size()]); // can't use .toArray because int is primitive type
        int[] ret = new int[tallies.size()];
        for(int i = 0; i < tallies.size(); i++){
            ret[i] = tallies.get(i);
        }

        return ret;
        //System.out.println(Arrays.asList(split_));
        //System.out.println(map);
        //System.out.println(tallies);
        //System.out.println(Arrays.asList(ret.toArray())); // <- this is printing in-memory location?
    }

    /*public static void main(String[] args) {
        String str_ = "a a a b b c";
        String[] words_ = {"d", "c", "b", "a"};
        analyze(str_, words_);
    }*/
}