class gfg {
    // Function that convert Decimal to binary
    public int[] decToBinary(int n) {
        int res = 0;
        int temp = n;
        // Size of an integer is assumed to be 32 bits
        while(temp>0) {
            // int k = n >> i;
            // if ((k & 1) > 0)
            // System.out.print("1");
            // else
            // System.out.print("0");
            res = res * 10 + (temp%2);
            temp/=2;
            // System.out.print(k);

        }
        temp=res;
        int count_0 = 0;
        int count_1 = 0;
        while(temp>0){
            if(temp%10 == 1)
                count_1++;
            else
                count_0++;
        }
        System.out.println(count_0);
        int arr[] = {res, count_0, count_1};
        return arr;
    }
}


public class count_bits {
    static int bits_counter (int n){
        int bin = 0, temp = n;
        while(temp>0){
            bin = bin*10 + (temp%2);
        }
        return bin;
    }
    // static int countBits(int n)
    // {
    // int count = 0;
    // while (n != 0)
    // {
    // count++;
    // n >>= 1;
    // }

    // return count;
    // }

    // /* Driver program*/
    // public static void main(String[] arg)
    // {
    // int i = 65;
    // System.out.print(countBits(i));
    // }

    // driver code
    public static void main(String[] args) {
        // gfg g = new gfg();
        // int n = 15;
        // int arr[] = g.decToBinary(n);
        // System.out.println("Decimal - " + n);
        // System.out.println("Binary - " + arr[0]);
        // System.out.println("No of zeros "+ arr[1]);
        // System.out.println("No of ones "+ arr[2]);
        System.out.println(1&1);
        int n = 19;
        System.out.println(bits_counter(n));

    }

}
