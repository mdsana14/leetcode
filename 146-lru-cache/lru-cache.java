class LRUCache {
    HashMap<Integer,CDLLNode> m;
    CDLL list;
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        m = new HashMap<>();
        list = new CDLL();
    }
    
    public int get(int key) {
        if(!m.containsKey(key)){
            return -1;
        }
        CDLLNode node = m.get(key);
        list.movetofront(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)){
            CDLLNode node = m.get(key);
            node.val = value;
            list.movetofront(node);
            return;
        }
        if(m.size() == capacity){
            int rk = list.removeLast();
            m.remove(rk);
        }
        CDLLNode nn = list.insertAtBegin(key,value);
        m.put(key,nn);
    }
}
class CDLLNode{
    int key,val;
    CDLLNode prev,next;
    public CDLLNode(int key,int val){
        this.key = key;
        this.val = val;
        prev = this;
        next = this;
    }
}
class CDLL{
   CDLLNode head = null;
   int removeLast(){
    if(head == null)
      return -1;
    CDLLNode remnode = head.prev;
    if(remnode == head){
        int r = remnode.key;
        head = null;
        return r;
    }
    else{
        int r = remnode.key;
        remnode.prev.next = head;
        head.prev = remnode.prev;
        return r;
    }  
   }
   CDLLNode insertAtBegin(int key,int val){
    CDLLNode nnode = new CDLLNode(key,val);
    if(head == null){
      head = nnode; 
    }
    else{
      CDLLNode last = head.prev;
      nnode.next = head;
      nnode.prev = last;
      last.next = nnode;
      head.prev = nnode;
      head = nnode;
    }
    return nnode;
   }
   void movetofront(CDLLNode node){
     if(node == head)return;
     node.prev.next = node.next;
     node.next.prev = node.prev;
     CDLLNode last = head.prev;
     node.next = head; 
     node.prev = last;
     last.next = node;
     head.prev = node;
     head = node; 
   }
}
