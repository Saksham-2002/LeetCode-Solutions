class NumberContainers {
    TreeMap<Integer, Integer>map;
    public NumberContainers() {
        map= new TreeMap<Integer, Integer>();
    }
    
    public void change(int index, int number) {
      map.put(index, number);
    }
    
    public int find(int number) {
        for(int key:map.keySet())
        {
            if(map.get(key)==number)
            {
                return key;
            }
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */