// 1st type

public class revString{
    public static void main(String srgs[]){
        String str = "hello";

        String rev=" ";
        
        int length = str.length();
        
        for (int i = 0; i < length; i++) {
        
             rev = str.charAt(i) + rev;
        
        }
        
        System.out.println(rev);
    }

}
