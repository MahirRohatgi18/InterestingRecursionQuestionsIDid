public class SubsequencesOfAString {

    public static void main(String[] args) {
            String string = "mah";
            Subsequesces(string,0,"");
    }


    public static void Subsequesces(String str , int idx, String NewString){
        if (idx == str.length()){
            System.out.println(NewString);
            return;
        }
        char currChar = str.charAt(idx);

        // choice to be added
        Subsequesces(str,idx+1,NewString+currChar);


        // choice to not be added
        Subsequesces(str,idx+1,NewString);
    }


}
