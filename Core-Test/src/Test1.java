import java.time.temporal.ValueRange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.test.logical.MergeNames;

public class Test1
{
    public static String[] uniqueNames(String[] names1, String[] names2)
    {

        List<String> name1 = Arrays.asList(names1);
        List<String> name2 = Arrays.asList(names1);

        Set<String> nameSet = new HashSet<>();
        nameSet.addAll(name1);
        nameSet.addAll(name2);
        return (String[]) nameSet.toArray();

    }

    public static void main(String[] args)
    {
        String[] names1 = new String[] { "Ava", "Emma", "Olivia" };
        String[] names2 = new String[] { "Olivia", "Sophia", "Emma" };
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma,
        ValueRange range= ValueRange.of(508,526);   
        // Olivia, Sophia
        System.out.println(range.isValidIntValue(500) && range.isValidIntValue(525));
        System.out.println();
        
        Map<String,String> map=new HashMap<>();
        
        // Using entrySet() to get the entry's of the map
        Set<Map.Entry<String,String>> s = map.entrySet();
        for (Map.Entry<String, String> it: s)
        {
            // Using the getKey to get key of the it element
            // Using the getValue to get value of the it element
            System.out.println("Before change of value = " + 
                       it.getKey() + "   " +  it.getValue());
        }
        String regx="[a-zA-Z0-9]{1,5}";
        System.out.println(getLogRegxPattern(regx));
    }
    
    private static String getLogRegxPattern(String regx)
    {
        return regx.substring(regx.indexOf('['), regx.indexOf(']')+1);
    }
}
