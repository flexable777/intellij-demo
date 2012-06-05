package demo.intellij.regex;

import java.util.regex.Pattern;

public class Regex {

    private static Pattern PATTERN = Pattern.compile("\\d{0,1}ff+");


    public static void main() {
        System.out.println(PATTERN.matcher("Hello verden").matches());
    }
}
