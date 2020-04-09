import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PriorityQueueTest {

    private int[] expected;
    private int[] random;

    public PriorityQueueTest(int[] expected, int[] random) {
        this.expected = expected;
        this.random = random;
    }

    /**
     * Note: @Parameters annotated method must be public static,
     * otherwise an Exception will thrown.
     */
    @Parameters
    public static List<int[][]> parameters() {
        List<int[][]> paramater = new ArrayList<int[][]>();
        int[][] case1 = new int[][]{
                { 1,2,3,4 },
                { 3,2,1,4 },
        };
        int[][] case2 = new int[][]{
                { 1,2,3,4 },
                { 3,2,4,1 },
        };
        int[][] case3 = new int[][]{
                { 1,2,3,4 },
                { 3,1,2,4 },
        };
        int[][] case4 = new int[][]{
                { 1,2,3,4 },
                { 3,1,4,2 },
        };
        int[][] case5 = new int[][]{
                { 1,2,3,5 },
                { 3,4,2,1 },
        };
        paramater.add(case1);
        paramater.add(case2);
        paramater.add(case3);
        paramater.add(case4);
        paramater.add(case5);
        return paramater;
    }

    @Test
    public void testParameterization() {
        PriorityQueue pq = new PriorityQueue();
        for(int i=0;i<4;i++){
            pq.offer(random[i]);
        }
        for(int i=0;i<4;i++){
            assertEquals(expected[i], pq.poll());
        }
    }

    @Test(expected = NullPointerException.class)
    public void test_offerNullPointerException() {
        PriorityQueue pq = new PriorityQueue();
        pq.offer(null);
    }

    @Test(expected = NullPointerException.class)
    public void test_addAllNullPointerException() {
        PriorityQueue pq = new PriorityQueue();
        pq.addAll(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_addAllIllegalArgumentException() {
        PriorityQueue pq = new PriorityQueue();
        pq.addAll(pq);
    }
}
