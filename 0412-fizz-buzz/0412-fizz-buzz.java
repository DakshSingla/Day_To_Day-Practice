class Solution {
    public List<String> fizzBuzz(int n) {
        int count = 1;
        List<String> ret = new ArrayList<>();
        while (count <= n) {
            if (count %3== 0&&count% 5 == 0) {
                ret.add("FizzBuzz");
            } else if (count % 3 ==0) {
                ret.add("Fizz");
            } else if (count % 5== 0) {
                ret.add("Buzz");
            } else {
                ret.add(String.valueOf(count));
            }
            count++;
        }
        return ret;
    }
}