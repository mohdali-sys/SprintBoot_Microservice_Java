import java.time.temporal.ValueRange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Test5
{
    public static void main(String[] args)
    {
        int[] length = { 2, 5, 5, 5, 60, 7, 9, 8, 1, 1, 10, 7, 5, 15, 15, 7, 5, 1, 60, 1, 19, 1, 1, 99, 2, 2, 19, 2, 19,
                19, 19, 19, 19, 19, 19, 19,16,50 };
        int[] position = { 1, 3, 8, 13, 18, 78, 85, 94, 102, 103, 104, 114, 121, 126, 141, 156, 163, 168, 169, 229, 230,
                249, 250, 251, 350, 352, 354, 373, 375, 394, 413, 432, 451, 470, 489, 508,90,100 };
        validateLengthPositionRange(length, position);
    }

    private static void validateLengthPositionRange(int[] length, int[] position)
    {
        Map<Integer, Map<Integer, Integer>> testMap = new HashMap<>();
        for (int i = 0; i < length.length; i++)
        {
            validateRange(length, position, testMap, i);

        }
        System.out.println(testMap);
    }

    private static void validateRange(int[] length, int[] position, Map<Integer, Map<Integer, Integer>> testMap, int i)
    {
        Map<Integer, Integer> minMaxMap = new HashMap<>();
        boolean isValidRange = true;
        if (testMap.get(Integer.valueOf(length[i])) == null)
        {
            // minMaxMap.put(position[i], position[i] + length[i]);
            if (!testMap.isEmpty())
            {
                Set<Integer> keys = testMap.keySet();
                ValueRange range = ValueRange.of(position[i], (position[i] + length[i]) - 1);
                for (Integer i1 : keys)
                {
                    Map<Integer, Integer> existingMinMaxMap = testMap.get(i1);
                    Set<Map.Entry<Integer, Integer>> entry = existingMinMaxMap.entrySet();
                    // entry.
                    for (Map.Entry<Integer, Integer> it : entry)
                    {
                        if (range.isValidIntValue(it.getKey()) || range.isValidIntValue(it.getValue()))
                        {
                            System.out.println(
                                "******************************************************************************************************");
                            System.out.println("Input Length: " + length[i] + "    Min = " + position[i] + " Max= "
                                + ((position[i] + length[i]) - 1) + "  overlps");
                            System.out.println("Map   Length: " + i1.intValue() + "    Min = " + it.getKey() + " Max= "
                                + it.getValue());
                            System.out.println(
                                "******************************************************************************************************");
                            isValidRange = false;
                            break;
                        }
                    }
                }
                if (isValidRange)
                {// for if valid enrty only
                    minMaxMap.put(position[i], (position[i] + length[i]) - 1);
                    testMap.put(Integer.valueOf(length[i]), minMaxMap);
                }
            }
            else
            {
                // for first entry only
                minMaxMap.put(position[i], (position[i] + length[i]) - 1);
                testMap.put(Integer.valueOf(length[i]), minMaxMap);
            }
        }
        else
        {
            minMaxMap.put(position[i], (position[i] + length[i]) - 1);
            testMap.put(Integer.valueOf(length[i]), minMaxMap);
        }
    }

}
