public class random {
    static int bits_counter (int n){
        int bin = 0, temp = n;
        while(temp>0){
            bin = bin*10 + (temp%2);
        }
        return bin;
    }
    public static void main(String[] args) {
        int n = 19;
        System.out.println(bits_counter(n));
    }
}
