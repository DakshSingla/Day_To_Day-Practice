class Solution {
    public String findLargest(int[] arr) {
        // code hereval
        String[] str = new String[arr.length];
        for(int i = 0;i<arr.length;i++){
            str[i] = String.valueOf(arr[i]);
        }
        
        Arrays.sort(str,(a,b)-> (b+a).compareTo(a+b));
        if(str[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length;i++){
            sb.append(str[i]);
        }
        return sb.toString();
    }
}