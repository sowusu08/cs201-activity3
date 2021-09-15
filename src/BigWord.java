import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class BigWord {
    public String /*static void*/ most(String[] sentences) {
        // init arrayList to contain all words
        ArrayList<String> total = new ArrayList<>();

        // split each element into words
        for(String s : sentences){
            // add elements of every split array to total array
           String[] split_ = s.toLowerCase().split(" ");
           total.addAll(Arrays.asList(split_));
        }

        //System.out.println(total);

        // create set of total array
        HashSet<String> set = new HashSet<>();

        for(String s : total){
            set.add(s);
        }

        // initialize empty int max var
        int max = 0;
        // initialize empty array with one element
        String[] result = new String[1];

        // for each element in set run Collections.getFrequency()
        for(String s : set){
            //System.out.println(Collections.frequency(total, s));

            // compare result to max var
            // if greater than max variable set bigWord equal to only element in result
            // and update max
            if(Collections.frequency(total, s) > max){
                // replace string stored in array
                result[0] = s;

                // update max
                max = Collections.frequency(total, s);
            }
        }

        return result[0];
        //System.out.println(result[0]);

    }

    /*public static void main(String[] args) {
        String[] sentences_ = {"This is the way", "This is the way", "this is this"};
        most(sentences_);
    }*/
}
