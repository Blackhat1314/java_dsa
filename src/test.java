public class test {

  public static void asdf(String a){
      int len=a.length();
      int[] arr=new int[26];
      for (int i=0;i<len;i++){
          arr[a.charAt(i)-'a']++;
      }
      for (int j=0;j<26;j++){
          if (arr[j]>0) {
              System.out.println((char) ('a' + j) + " " + arr[j]);
          }
      }
  }

    public static void main(String[] args) {
        asdf("oodkalwojscjsoslaloa");
    }
}
