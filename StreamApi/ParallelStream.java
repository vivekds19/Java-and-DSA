import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
      public static void main(String[] args) {

        int size=10000;
        List<Integer> nums=new ArrayList<>(size);

        Random ran=new Random();

        for(int i=1;i<=size;i++)
        {
          nums.add(ran.nextInt(100));
        }

        long startTimeSeq=System.currentTimeMillis();
        int sum1=nums.stream()
                      .map(n->{
                        try {
                            Thread.sleep(1);
                        } catch (Exception e) {
                        }
                        return n*2;})
                      .mapToInt(n->n)
                      .sum();
        long endTimeSeq=System.currentTimeMillis();

        long startTimePara=System.currentTimeMillis();
        int sum2=nums.parallelStream()
                     .map(n->{
                        try {
                            Thread.sleep(1);
                        } catch (Exception e) {
                        }
                        return n*2;})
                      .mapToInt(n->n)
                      .sum();
        long endTimePara=System.currentTimeMillis();

        System.out.println(sum1 + " "+ (startTimeSeq-endTimeSeq));
        System.out.println(sum2 + " "+ (startTimePara-endTimePara));


      }
}   
