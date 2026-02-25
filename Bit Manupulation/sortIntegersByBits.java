class Solution {
    class Pair implements Comparable<Pair> {
        int bits;
        int val;

        Pair(int bits, int val) {
            this.bits = bits;
            this.val = val;
        }

        public int compareTo(Pair obj) {
            if (obj.bits != this.bits) {
                return (this.bits - obj.bits);
            }
            return (this.val - obj.val);
        }
    }

    public int[] sortByBits(int[] arr) {
        int[] ans = new int[arr.length];
        ArrayList<Pair> help = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            int n = arr[i];
            while (n > 0) {
                count += (n & 1);
                n = n >> 1;
            }
            help.add(new Pair(count, arr[i]));
        }
        Collections.sort(help);
        for (int i = 0; i < arr.length; i++) {
            ans[i] = help.get(i).val;
        }

        return ans;
    }
}
