class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> l1 = new ArrayList<>();
        ArrayList<Character> l2 = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) { 
            l1.add(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            l2.add(t.charAt(i));
        }

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for (int i = 0; i < l1.size(); i++) {
            char ch = l1.get(i);
        
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        
        
        for (int j = 0; j< l2.size(); j++){
            char ch1 = l2.get(j);
            
            if (map2.containsKey(ch1)){
                map2.put(ch1, map2.get(ch1)+1);
            } else {
                map2.put(ch1,1);
            }
        }
        
        if (map.equals(map2)){
            return true;
        } else {
            return false;
        }
        
    }

}
