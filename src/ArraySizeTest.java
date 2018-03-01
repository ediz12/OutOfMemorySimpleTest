public class ArraySizeTest {
    // 1 kilobyte = 1024 bytes
    // Test to cause OutOfMemory due to array size exceeding the heap size
    private int size;
    private int[] sampleArray;

    public ArraySizeTest(){
        size = Integer.MAX_VALUE;
    }

    public ArraySizeTest(int size){
        this.size = size;
    }

    public void build(){
        sampleArray = new int[size];
    }
}
