import java.util.HashMap;

public class HashMapTest {

    HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
    private int size;

    public  HashMapTest(){
        size = Integer.MAX_VALUE;
    }

    public  HashMapTest(int size){
        this.size = size;
    }
    public void build(){
        for (int i = 0; i <  size; i++) {
            hm.put(i, (char)(i % 256));
        }
    }

}
