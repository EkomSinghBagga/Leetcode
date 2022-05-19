class Solution {
    public boolean lemonadeChange(int[] bills) {
      int five=0,ten=0;
      if(bills[0]==10||bills[0]==20){
          return false;
      }
      for(int i:bills){
          if(i==5)
              five++;
          else if(i==10){
              if(five<1)
                  return false;
              five--;
              ten++;
          }
          else{
              if(ten<1&&five<1){
                  return false;
              }
              else if(ten>=1&&five>=1){
                  ten--;
                  five--;
              }
              else if(ten<1&&five>=3){
                  five-=3;
              }
              else
                  return false;
          }
      }
        return true;
    }
}