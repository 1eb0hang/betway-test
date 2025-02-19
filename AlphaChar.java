class AlphaChar{
  public static void main(String[] args) {
    System.out.println(altenate("Za^B8g@E2jH*kWl!MoPqXr7YvT1c$Fs3Ud9IwZ&yX0pLkV6sHqN^tB4rA+oZ%gFj"));
  }

  string altenate(string value){
    char[] arr = value.toCharArray();
    for(int i = 0 ;i<arr.length; i+=1){
      if(isAlpha(arr[i])){
        arr[i] = ((int)arr[i] >= 65 && (int)arr[i]<=90)? (int)arr[i] + 32:arr[i];
      }
    }
  }

  bool isAlpha(char n){
    if((int)n >= 65 && (int)n<=90) return true;
    if((int)n >= 97 && (int)n<=122) return true;
    return false;
  }
}
