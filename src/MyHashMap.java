public class MyHashMap <K, V> {

   private static class Entry <K, V>{
       final K key;
       V value;
       Entry<K, V> next;

       Entry(K key, V value){
           this.key = key;
           this.value = value;
       }}

   private static final int DEFAULT_CAPACITY = 16;
   private static final float LOAD_FACTOR = 0.75f;
   private Entry<K, V>[] table;
   private int size;
    @SuppressWarnings("unchecked")
   public MyHashMap(){
       table =(Entry<K, V>[]) new Entry[DEFAULT_CAPACITY];
   }
   private int getBucketIndex(K key){
        if (key ==null){
            return 0;
        }
        int hash = key.hashCode();
        hash = hash ^ (hash >>> 16);
        return hash & (table.length -1);
   }
}
