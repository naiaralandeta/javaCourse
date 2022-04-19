import java.util.*;

public class LongestIncreasingSubsequence {

    public static class Subsequence {
        static List<Integer> findSubsequence(List nums){
            List<Integer> seq = new ArrayList();
            int max = (int) nums.get(0);
            seq.add((Integer) nums.get(0));

            for (int i = 1; i < nums.size(); i++) {
                if(max < (int) nums.get(i) ){
                    max = (int) nums.get(i);
                    seq.add(max);
                }
            }
            return seq;
        }
    }

    public static void main(String[] args){

        System.out.println("How long do you want the sequence? It has to be less than 100");
        Scanner sc = new Scanner(System.in);
        int len = Integer.valueOf(sc.nextLine());

        do{
            if(len >= 100){
                System.out.println("Insert another number is too long:");
                len = Integer.valueOf(sc.nextLine());
            }
        } while (len >= 100);

        List<Integer> nums = new ArrayList<Integer>();
        Random random = new Random();

        for(int i = 0; i < len; i++){
            nums.add(random.nextInt(100));
        }

        System.out.println("List of numbers: " + nums);

        List seq = Subsequence.findSubsequence(nums);

        System.out.println("List of seq: " + seq);

    }
}
