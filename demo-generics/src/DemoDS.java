package src;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class DemoDS {
    public static void main(String[] args) {
        Map<String, StringPrinter> map = new HashMap<>();
        StringPrinter sp = new StringPrinter("hello");
        StringPrinter sp2 = new StringPrinter("world");
        map.put("a", sp);
        map.put("b", sp2);
        
        Queue<StringPrinter> qs = new LinkedList<>();
        qs.add(sp);
        qs.add(sp2);

        // Corrected method name to set the data
        sp2.setData("xxx");
        StringPrinter sp3 = new StringPrinter("xxx");
        map.put("b", sp3); // Key exists, replace value with sp3
        System.out.println(map.size()); // Print the number of key-value mappings in the map
        System.out.println("qs=" + qs); // Print the queue
        
        // This line is redundant, already printed above
        // System.out.println(qs);
    }
}

