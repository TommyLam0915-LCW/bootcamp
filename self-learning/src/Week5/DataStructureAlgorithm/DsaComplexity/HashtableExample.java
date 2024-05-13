package Week5.DataStructureAlgorithm.DsaComplexity;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableExample {
  public static void main(String[] args) {
    // 1. Create Hashtable 
    Hashtable<Integer, String> hashtable = new Hashtable<>();

    //2. Add mappings to hashtable, self-define the key 
    hashtable.put(1,"A");
    hashtable.put(2,"B");
    hashtable.put(3,"C");
    hashtable.put(3,"D"); // overwrite the key 3 with value "C"
    
    System.out.println(hashtable); // {3=D, 2=B, 1=A}

    //3. Access a mapping by key 
    String value = hashtable.get(1); // A
    System.out.println(value);

    //4. Remove a mapping 
    hashtable.remove(3); // 3 is deleted
    System.out.println(hashtable);

    //5. Iterate over mappings 
    Iterator<Integer> itr = hashtable.keySet().iterator();

    while(itr.hasNext()){
      Integer key = itr.next();
      String mappedValue = hashtable.get(key);

      System.out.println("Key: " + key + ", Value: " + mappedValue);

      // Key: 2, Value: B
      // Key: 1, Value: A
    }

    // HaskMap is non-sychronized 
    // HashTable is synchronized  -> That's why HashMap performs much faster 

    // HashMap allows null for both key and value 
    // HashTable doesn't allow null for both key and value 

    // HashMap 
    Map<Integer, String> hm = new HashMap<>();
    hm.put(100, "Amit");
    hm.put(104, "Amit");
    hm.put(101, "Vijay");
    hm.put(102, "Rahul");
    System.out.println("------Hash map -------");
    for (Map.Entry<Integer, String> m : hm.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());

    }

    // HashTable 
    Map<Integer, String> ht = new Hashtable<>();
    ht.put(100, "Amit");
    ht.put(104, "Amit");
    ht.put(101, "Vijay");
    ht.put(102, "Rahul");
    System.out.println("------Hash table -------");
    for (Map.Entry<Integer, String> m: ht.entrySet()){
      System.out.println(m.getKey()+" "+m.getValue());
    }
    // ------Hash map -------
    // 100 Amit
    // 101 Vijay
    // 102 Rahul
    // 104 Amit
    // ------Hash table -------
    // 104 Amit
    // 102 Rahul
    // 101 Vijay
    // 100 Amit
  }
}
