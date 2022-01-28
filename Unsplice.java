public class Unsplice {

    public static String answer(String str) {
        String string = str;
        if(string.contains("\\\n")) {
            string = string.replace("\\\n", "");
        }
        return string;
    }
}
