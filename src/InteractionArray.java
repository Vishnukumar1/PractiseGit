import java.util.Arrays;

public class InteractionArray {
    public static void main(String[] args){
        int firstarray[]={1,2,2,3};
        int secondarray[]={2,3};
        Arrays.stream(firstarray).filter(x->Arrays.stream(secondarray).anyMatch(y->y==x)).distinct()
                .forEach(System.out::println);
    }
}
