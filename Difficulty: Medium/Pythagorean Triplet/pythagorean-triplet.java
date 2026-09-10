class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code herelo
        HashSet<Long> set = new HashSet<>();
        for(int a:arr){
            set.add((long)a*a);
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                long sum = (long)arr[i]*arr[i]+ (long)arr[j]*arr[j];
                if(set.contains(sum)) return true;
            }
        }
        return false;
    }
}