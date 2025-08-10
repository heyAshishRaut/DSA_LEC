public class FILE01 {
    public int factorial(int num) {
        if(num == 1) {
            return 1;
        }
        else {
            return num * factorial(num - 1);
        }
    }
    public static void main(String[] args) {
        FILE01 obj = new FILE01();

        int ans = obj.factorial(5);
        System.out.println(ans);
    }
}
