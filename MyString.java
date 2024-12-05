public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        StringBuilder new_str= new StringBuilder();
        for (int i=0; i<str.length();i++)
        {
            if (str.charAt(i)>='A' && str.charAt(i)<='Z') { 
                new_str.append((char)(str.charAt(i)+32));
            }
            else
            {
                new_str.append(str.charAt(i));
            }
            
        }

        return new_str.toString();
    }
    public static boolean sub_contain(String str1, String str2) {
        for (int i=0;i<str2.length();i++)
        {
            if (str1.charAt(i)!=str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        String new_str=str1;
        for (int i=0; i<str1.length();i++)
        {
            if (str2.length()>new_str.length()) {
                    return false;
                }
                if (sub_contain(new_str, str2))
                {
                    return true;  
                } 
                new_str=new_str.substring(1);
            }
            return false;
        }
    }

            
        

    

    


