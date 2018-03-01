import java.util.ArrayList;

public class OutOfMemoryTest {


    public static void main(String[] args) {
        /*  Heap size = 128mb
            Result =  OutOfMemoryException
            run "java -Xms128m -Xmx128m -jar app.jar"
            More heap size --> fix the issue or crash later (error handling?)
        */

        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println(String.format("Max memory set to %s mb.", (maxMemory/(1024*1024))));

        int size = 70*1024*1024;

        ArraySizeTest test1 = new ArraySizeTest(size);
        test1.build(); // Array size exceeds heap size, causing OutOfMemoryError

        ArrayListForLoopTest test2 = new ArrayListForLoopTest(size);
        test2.build();

        HashMapTest test3 = new HashMapTest();
        test3.build();


    }
}
