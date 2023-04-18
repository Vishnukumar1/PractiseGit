public class ReplaceStringChar {
    public static void main(String[] args) {
        String str="Vishnu Kumar";
       // System.out.println(str.replace("u","I"));

       char ch='u';
       replaceCharacter(str,ch);


    }
    public static void replaceCharacter(String str,char c){
        int n=str.length();
        String finalValue="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=c){
              //  replaceCharacter("u",'I');
                finalValue=finalValue+str.charAt(i);
            }

        }
        System.out.println(finalValue);


    }
}
