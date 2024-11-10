public class LinearSearchString {
    public static void main(String[] args) {
        String str = "Pawan bisht";
        int res = linearSearch(str, 'i');
        System.out.println(res);
    }
    static int linearSearch(String a, char target) {
        if(a.length() == 0) return -1;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    static boolean linearSearch2(String a, char target) {
        if(a.isEmpty()) return false;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
