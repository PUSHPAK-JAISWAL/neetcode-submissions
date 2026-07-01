class MyHashMap {

    class Node {
        int key;
        int value;

        Node(int key,int value) {
            this.key= key;
            this.value = value;
        }
    }
    List<Node> list;
    public MyHashMap() {
        list = new LinkedList();
    }
    
    public void put(int key, int value) {
        for(Node entry:list) {
            if(entry.key==key) {
                entry.value = value;
                return;
            }
        }
        list.add(new Node(key,value));
    }
    
    public int get(int key) {
        for(Node entry:list) {
            if(entry.key==key) {
                return entry.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).key == key) {
                list.remove(i);
                return; 
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */