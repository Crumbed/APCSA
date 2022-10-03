package ClassesAndObjectsSummative;

public class StringSandwich {

    public static String isSandwich (String str) {

        if (!(str.length() >= 4)) { return str; }
    
        if (str.substring(0, 2).equalsIgnoreCase(str.substring(str.length()-2))) {
    
            return str.substring(2, str.length() - 2).toLowerCase();
    
        } else {
    
            return str;
    
        }
    }

    public static String makeDouble (String str) {

        if (!(str.length() >= 0)) { return str; }
    
        else if (!isSandwich(str).equals(str)) { return ""; }
    
        String ends = str.substring(0, 2);
    
        return ends + isSandwich(str) + isSandwich(str) + ends;
    
    }
    
}
