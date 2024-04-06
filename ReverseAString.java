public class StringInReverseRecursion {
    public static void main(String[] args) {
       String string = "hello";
        PrintRev(string,string.length()-1);
    }

    public static void PrintRev(String str, int idx){

        if (idx == 0){
            System.out.println(str.charAt(idx));
        }
        System.out.println(str.charAt(idx));
        PrintRev(str,idx-1);
    }
}
