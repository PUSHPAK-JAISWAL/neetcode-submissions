class MyHashSet {
    List<Integer> list = new ArrayList();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        boolean flag = false;
        for(int i:list) {
            if(i==key) flag = true;
        }
        if(flag==false) list.add(key);
    }
    
    public void remove(int key) {
        for(int i=0;i<list.size();i++) {
            if(list.get(i)==key) {
                list.remove(i);
                return;
            }
        }
    }
    
    public boolean contains(int key) {
        for(int i:list) {
            if(i==key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */