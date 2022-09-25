import java.util.regex.Pattern;

public class RegxTest
{

    public static void main(String[] args)
    {
       String regx="[a-zA-Z0-9]{1,5}";
      System.out.println(Pattern.compile(regx));
      String type="\\b(ALPHANUMERIC|NUMERIC|EXCHANGE VALUE|PAGE|LINE|COUNTER|DEDUCTED|RATE)\\b";
      String fixedVar="\\b(Fixed|Variant)\\b";
      String yesNo="\\b(YES|NO)\\b";
      System.out.println(regx.substring(regx.indexOf('{')+1, regx.indexOf('}')).split(",")[1]);
      
      
      String spinType="New SPIN TEST10 EBA for COREP EU Specific inputs for OPR Details: losses and recoveries by business line and event type";
      String regx1="^(?!\\s*$).{1,120}$";
      System.out.println(applyRegex(spinType,Pattern.compile(regx1)));
      System.out.println(getMaxLengthFromRegx(regx1));
      System.out.println(getMaxLengthFromRegx(regx));
      
      System.out.println("\""+getListFromRegx(type)+"\"");
      System.out.println("\""+getListFromRegx(fixedVar)+"\"");
      System.out.println("\""+getListFromRegx(yesNo)+"\"");
      
      regx="[0-9]{1,10}";
      System.out.println("Is Match :"+applyRegex(regx,Pattern.compile("2.5")));
    }
    

    private static String getListFromRegx(String regxList)
    {
        return regxList.substring(regxList.indexOf('(')+1, regxList.indexOf(')')).replaceAll("[|]", "\" or \"");
    }
    
    
     static boolean  applyRegex(final String input, Pattern pattern)
    {
        if (input == null)
        {
            return false;
        }
        return pattern.matcher(input).matches();
    }
     static String getMaxLengthFromRegx(String regx)
     {
         return regx.substring(regx.indexOf('{') + 1, regx.indexOf('}')).split(",")[1];
     }

}
