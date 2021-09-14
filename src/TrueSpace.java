public class TrueSpace {
    public long /*static void*/ calculateSpace(int[] sizes, int clusterSize) {
        // initialize int variable count
        long count = 0;

        // store each array in new array of doubles
        double[] sizes_d = new double[sizes.length];
        for(int i = 0; i < sizes.length; i++){
            sizes_d[i] = sizes[i];
        }

        // loop through each element in array
        for(double d : sizes_d){
            // divide the element by clusterSize int and store result
            double clusters = d / clusterSize;

            // if the element % clusterSize != 0 add one to the stored result
            if(d % clusterSize != 0){
                clusters += 1;
            }

            // Round the stored result using Math.round()
            clusters = Math.round(clusters);

            // multiply the clusterSize by the stored result and add it to the initialized variable count
            count = (long) (count + (clusters * clusterSize));       // must return long not double (clusters * clusterSize leads to double) so cast to double
        }

        return count;
        //System.out.println(count);

    }

    /*public static void main(String[] args) {
        int[] sizes_ = {16,32,128,128,0};
        int clusterSize_ = 32768;

        calculateSpace(sizes_, clusterSize_);
    }*/
}
