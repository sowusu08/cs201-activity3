public class TrueSpace {
    public long /*static void*/ calculateSpace(int[] sizes, int clusterSize) {
        // initialize int variable count
        long space = 0;

        // store each array in new array of doubles
        double[] sizes_d = new double[sizes.length];
        for(int i = 0; i < sizes.length; i++){
            sizes_d[i] = sizes[i];
        }

        // init cluster int var
        long clusters = 0;

        // loop through each element in array
        for(double d : sizes_d){
            if(d != 0) {
                // divide the element by cluster size, always round it up, and add to clusters
                clusters += Math.ceil(d / clusterSize); // looked up Math.ciel in documentation, was already aware of Math.round
            }
        }

        // multiply the clusterSize by clusters and return
        return (long) (clusters * clusterSize);       // must return long not double (clusters * clusterSize leads to double) so cast to double

        //System.out.println((long) (clusters * clusterSize));
        //System.out.println(clusters);
        //System.out.println((clusters * clusterSize));

    }

    /*public static void main(String[] args) {
        int[] sizes_ = {1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000};
        int clusterSize_ = 1048576;

        calculateSpace(sizes_, clusterSize_);
        // NOTE: using int for very large number sin java leads to weird mistakes in arithmetic
    }*/
}
