class RandomizedCollection {
    HashMap<Integer,HashSet<Integer>> map;
    List<Integer> list;
    Random random;
        public RandomizedCollection() {
            map = new HashMap<>();
            list = new ArrayList<>();
            random = new Random();
        }
        
        public boolean insert(int val) {
            boolean flag;
            HashSet<Integer> set;
            if(map.containsKey(val)){
                set = map.get(val);
                flag = false;
            }
           else{
               set = new HashSet<>();
               flag = true;
           }
           list.add(val);
           set.add(list.size()-1);
           map.put(val,set);
           return flag;
        }
        
        public boolean remove(int val) {
           if(!map.containsKey(val)){
            return false;
           }
           HashSet<Integer>set;
           set = map.get(val);
           int idx=-1;
           for(int itr : set){
               idx = itr;
               break;
           }
    
           set.remove(idx);
           if(set.isEmpty()){
            map.remove(val);
           }else
           map.put(val,set);
           
           if(idx == list.size()-1){
               list.remove(list.size()-1);
           }else{
                Collections.swap(list,idx,list.size()-1);
                list.remove(list.size()-1);
                int newval = list.get(idx);
                HashSet<Integer> temp;
                temp = map.get(newval);
                temp.add(idx);
                temp.remove(list.size());
                map.put(newval,temp);
           }
           return true;
        }
        
        public int getRandom() {
            int idx = random.nextInt(list.size());
            return list.get(idx);
        }
    }
    
    /**
     * Your RandomizedCollection object will be instantiated and called as such:
     * RandomizedCollection obj = new RandomizedCollection();
     * boolean param_1 = obj.insert(val);
     * boolean param_2 = obj.remove(val);
     * int param_3 = obj.getRandom();
     */