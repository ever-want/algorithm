public class Anagram{
    public boolean isAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        int [] anagram = new int[26];
        for(int i=0; i< s.length(); i++){
            anagram[s.charAt(i) - 'a' ] ++;
            anagram[t.charAt(i) - 'a' ] --;
        }
        for(int i=0;i<26;i++){
            if(anagram[i] != 0){
                return false;
            }
        }
        return true;
    }
}