class RandomizedCollection {
    HashMap<Integer,Integer> hm;
    List<Integer> list;
        public RandomizedCollection() {
            hm = new HashMap<>();
            list = new ArrayList<>();
        }
        
        public boolean insert(int val) {
            if(hm.containsKey(val)){
                return false;
            }
            list.add(val);
            int idx = list.size()-1;
            hm.put(val,idx);
            return true;
        }
        
        public boolean remove(int val) {
            if(!hm.containsKey(val)){
                return false;
            }
            int idx = hm.get(val);
            Collections.swap(list,idx,list.size()-1);
            int swappedval = list.get(idx);
    
            if(idx < list.size()){
                hm.put(swappedval,idx);
            }
            list.remove(list.size()-1);
            hm.remove(val);
            return true;
        }
        
        public int getRandom() {
            Random random = new Random();
            int n = random.nextInt(list.size());
            return list.get(n);
        }
    }