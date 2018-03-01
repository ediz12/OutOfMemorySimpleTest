import java.util.ArrayList;

public class ArrayListForLoopTest {
    // Test to cause OutOfMemory due to memory leak from for loop
    ArrayList<Integer> ints = new ArrayList<Integer>();
    private int loopTime;

    public ArrayListForLoopTest(){
        loopTime = Integer.MAX_VALUE;
    }

    public ArrayListForLoopTest(int loop){
        this.loopTime = loop;
    }

    public void build(){
        for(int i = 0; i < loopTime; i++){
            ints.add(i);
        }
    }
}
