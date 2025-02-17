class Solution 
{ 
    String firstRepChar(String s) 
    { 
        HashSet<String> temp = new HashSet<>();
        for(int i=0;i<s.length();i++){
            String str=String.valueOf(s.charAt(i));
            if(temp.contains(str.toString())) return str;
            temp.add(str);
        }
        return "-1";
    }
} 
