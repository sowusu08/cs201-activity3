import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class StringCuts {
    public /*static void*/ String[] filter(String[] list, int minLength) {
        // create set with contents of inputted String Array
        HashSet<String> set = new HashSet<>();
        set.addAll(Arrays.asList(list));

        // initialize empty arrayList to store results
        ArrayList<String> ret = new ArrayList<>();

        // loop through set using for each loop
        for(String s : set){
            // if .length() == inputted length add element to initialized arrayList
            if(s.length() >= minLength){
                ret.add(s);
            }
        }

        // convert arrayList to array and return String[] array
        return ret.toArray(new String[ret.size()]);
        //System.out.println(Arrays.asList(ret.toArray()));
        //System.out.println(Arrays.asList(ret.toArray(new String[0])));
    }

    /*public static void main(String[] args) {
        String[] string_ = {"huge", "enormous", "big", "gigantic"};
        int l = 5;
        filter(string_, l);

    }*/
}