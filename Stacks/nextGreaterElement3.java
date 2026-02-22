public int size(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public int nextGreaterElement(int n) {
        int[] ans = new int[size(n)];
        int idx = ans.length - 1;
        int a = n;

        // fill array
        while (a != 0) {
            ans[idx--] = a % 10;
            a /= 10;
        }

        int i;
        // Step 1: find break point
        for (i = ans.length - 1; i >= 1; i--) {
            if (ans[i] > ans[i - 1]) {
                break;
            }
        }

        if (i == 0) return -1;

        // Step 2: find just greater element from right
        int j = ans.length - 1;
        while (ans[j] <= ans[i - 1]) {
            j--;
        }

        // swap
        int temp = ans[j];
        ans[j] = ans[i - 1];
        ans[i - 1] = temp;

        // Step 3: sort right part (VERY IMPORTANT)
        int left = i, right = ans.length - 1;
        while (left < right) {
            int t = ans[left];
            ans[left] = ans[right];
            ans[right] = t;
            left++;
            right--;
        }

        // Step 4: build number safely
        long num = 0;
        for (int k = 0; k < ans.length; k++) {
            num = num * 10 + ans[k];
            if (num > Integer.MAX_VALUE) return -1;
        }

        return (int) num;


public int size(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public int nextGreaterElement(int n) {
        int[] ans = new int[size(n)];
        int idx = ans.length - 1;
        int a = n;

        // fill array
        while (a != 0) {
            ans[idx--] = a % 10;
            a /= 10;
        }

        int i;
        // Step 1: find break point
        for (i = ans.length - 1; i >= 1; i--) {
            if (ans[i] > ans[i - 1]) {
                break;
            }
        }

        if (i == 0) return -1;

        // Step 2: find just greater element from right
        int j = ans.length - 1;
        while (ans[j] <= ans[i - 1]) {
            j--;
        }

        // swap
        int temp = ans[j];
        ans[j] = ans[i - 1];
        ans[i - 1] = temp;

        // Step 3: sort right part (VERY IMPORTANT)
        int left = i, right = ans.length - 1;
        while (left < right) {
            int t = ans[left];
            ans[left] = ans[right];
            ans[right] = t;
            left++;
            right--;
        }

        // Step 4: build number safely
        long num = 0;
        for (int k = 0; k < ans.length; k++) {
            num = num * 10 + ans[k];
            if (num > Integer.MAX_VALUE) return -1;
        }

        return (int) num;
    }
