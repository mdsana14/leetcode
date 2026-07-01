class MyHashMap {
    List<Integer> k;
    List<Integer> v;
    public MyHashMap() {
        k = new ArrayList<>();
        v = new ArrayList<>();
    } 
    public void put(int key, int value) {
        if(k.contains(key)){
            v.set(k.indexOf(key),value);
        }
        else{
            k.add(key);
            v.add(value);
        }
    }   
    public int get(int key) {
        if(!k.contains(key)){
            return -1;
        }
        return v.get(k.indexOf(key));
    }
    
    public void remove(int key) {
        if(!k.contains(key))
          return;
        int i = k.indexOf(key);
        k.remove(i);
        v.remove(i);  
    }
}