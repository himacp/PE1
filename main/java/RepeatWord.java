public class RepeatWord
{
    String repeatNtimes(String str, int n) {
        String string1="";


        for (int i = 0; i <= str.length() - 1; i++) {
            string1 = string1 + str.charAt(i);
        }
        for (int j = 0; j < n; j++) {
            for (int i = str.length() - n; i <= str.length() - 1; i++) {
                string1 = string1 + str.charAt(i);
            }
        }
        return string1;
    }
}

