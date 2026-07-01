class MyHashSet {
    private final boolean[] buffer = new boolean[100001];
    public MyHashSet() {
        
    }
    
    public void add(int key) {  
        buffer[key]= true;
    }
    
    public void remove(int key) {
        buffer[key]=false;
    }
    
    public boolean contains(int key) {
        return buffer[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */