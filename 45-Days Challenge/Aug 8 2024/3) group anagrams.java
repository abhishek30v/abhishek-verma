class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> map= new HashMap<>();

        for(String word : strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sortedString = new String(arr);

           if(!map.containsKey(sortedString)){
               map.put(sortedString,new ArrayList<>());
           }
           map.get(sortedString).add(word);
        }

       List<List<String>> result = new ArrayList<>();

        for(List<String> value : map.values()){
            result.add(value);
        }
    return result;
    }
}