import java.util.*;


public class FindDups {
    public static void main(String[] args) {
        Set<String> distinctWords = Arrays.asList(args).stream()
                .collect(Collectors.toSet());
        System.out.println(distinctWords.size()+
        " distinct words: " +
        distinctWords);
    }
}
