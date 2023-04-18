import java.util.*;

public class FindDuplicates{
    public static void main(String[] args){
        System.out.println(FindDuplicatesString("Hello World"));

    }


    private static Set<String> FindDuplicatesString(String name){

        Set<String> duplicates=new LinkedHashSet<String>();
        for(int i=0;i<name.length();i++){
            for(int j=i+1;j<name.length();j++){
                if(name.charAt(i)==name.charAt(j)){

                    duplicates.add(String.valueOf(name.charAt(j)));

                }


            }
        }
        return duplicates;
    }

}