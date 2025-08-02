import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Deque<Integer> q = new ArrayDeque<>();
        int query = s.nextInt();

        for(int i = 0; i < query; i++) {
            String str = s.nextLine();
            String[] strAr = str.split(" ");

            if(strAr[0].equals("insertback")) {
                q.offerLast(Integer.parseInt(strAr[1]));
            }

            if(strAr[0].equals("eraseback")) {
                if(!q.isEmpty()) {
                    q.pollLast();
                }
            }

            if(strAr[0].equals("printback")) {
                if(q.isEmpty()) {
                    System.out.println("0");
                }
                else{
                    System.out.println(q.peekLast());
                }
            }

            if(strAr[0].equals("insertfront")) {
                q.offerFirst(Integer.parseInt(strAr[1]));
            }

            if(strAr[0].equals("erasefront")) {
                if(!q.isEmpty()) {
                    q.pollFirst();
                }
            }

            if(strAr[0].equals("printfront")) {
                if(q.isEmpty()) {
                    System.out.println("0");
                }
                else {
                    System.out.println(q.peekFirst());
                }
            }

            if(strAr[0].equals("print")) {
                int index = Integer.parseInt(strAr[1]);
                if(index == 0) {
                    System.out.println(q.peekFirst());
                }
                else {
                    int[] ar = new int[index];

                    for(int j = 0; j < index; j++) {
                        if(!q.isEmpty()) {
                            ar[j] = q.pollFirst();
                        }
                    }
                    System.out.println(q.peekFirst());

                    for(int k = index - 1; k >= 0; k--) {
                        q.offerFirst(ar[k]);
                    }
                }
            }
        }
    }
}
