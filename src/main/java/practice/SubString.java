package practice;

import java.util.HashSet;
import java.util.Set;

/**
 * String 1：ABCD
 * String 2：BAD
 * return true
 * <p>
 * String 1：ABCD
 * String 2：BCE
 * return false
 */
public class SubString {
    public static boolean isSubArray(String[] longArray, String[] shortArray) {
        Set<Object> mappingSet = new HashSet<>();
        for (String s : longArray) {
            mappingSet.add(s);
        }

        for (String s : shortArray) {
            if (!mappingSet.contains(s)) {
                return false;
            }
        }

        return true;
    }
}
