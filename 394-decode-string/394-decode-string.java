class Solution {
    public String decodeString(String s) {
       Stack<Integer> c=new Stack<>();
       Stack<String> res=new Stack<>();
        int i=0;
        res.push("");
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9'){
                int st=i;
                while(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'){
                    i++;
                }
                c.push(Integer.parseInt(s.substring(st,i+1)));
            }
            else if(ch=='[')
                res.push("");
            else if(ch==']'){
                String str=res.pop();
                int times=c.pop();
                StringBuilder sb=new StringBuilder();
                for(int k=0;k<times;k++){
                    sb.append(str);
                }
                res.push(res.pop()+sb.toString());
            }
            else{
                res.push(res.pop()+ch);
            }
            i++;
        }
        return res.pop();
    }
}