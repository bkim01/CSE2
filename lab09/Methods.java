//Benedict Kim
//lab09

public class Methods{
    public static void main(String args[]){
        int a = (int)(Math.random()*10);
        int b = (int)(Math.random()*10);
        int c = (int)(Math.random()*10);
        int d = (int)(Math.random()*10);
        int e = (int)(Math.random()*10);
        int f = (int)(Math.random()*10);
        System.out.println("the " +adj(a)+" "+adj(b)+" "+noun(c)+" "+verb(d)+" the "+adj(e)+" "+noun(f));
    }
    public static String adj(int a){
        String[] b = {"lazy","insane","cool","relaxed","energetic","excited","happy","ridiculous","annoying","weird"};
        return b[a];
    }
    public static String noun(int a){
        String[] b = {"dog","cat","man","goat","horse","bird","fox","girl","whale","dolphin"};
        return b[a];
    }
    public static String verb(int a){
        String[] b = {"ran over", "annoyed", "slapped","kicked", "jumped over","swam","slid on","caught","fell over","landed on"};
        return b[a];
    }
}