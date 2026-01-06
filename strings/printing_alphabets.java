package strings;

public class printing_alphabets {
    public static void main(String[] args) {
        String name="";
        for(int i=0;i<26;i++){
            char c=(char)('a'+i);
            name+=c;
        }
        System.out.println(name);
    }
}
