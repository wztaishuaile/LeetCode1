package GoldMedal;

public class T0106 {
    public static void main(String[] args) {
        String a="aa";
        System.out.println(compressString1(a));
    }
//    public String compressString(String S) {
//        if(S==null||S.length()<=2)
//            return S;
//        char[] c=S.toCharArray();
//
//    }
    public static String compressString1(String S) {
        char[] chars = S.toCharArray();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1])
                count++;
            if(chars[i] != chars[i - 1] || i==chars.length-1){
                sb.append(chars[i - 1]);
                sb.append(count);
                count = 1;
            }
        }
        String s = new String(sb);
        if(s.length()==S.length()||S.length()==1)
            return S;
        return s;
    }
}
