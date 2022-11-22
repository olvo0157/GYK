package lt.gyk.java.basics;
public class Art {
    // Task2.1
    public static void drawTree (int height){
        String prefix="";
        String treeBranch = "#";
        String root = "";
        for (int i=1; i<=height; ++i){
            prefix = "";
            for (int j=i; j<=height-1; ++j){
                prefix = prefix + " ";
            }
            System.out.println(prefix + treeBranch);
            if (i==1){
                root = prefix + treeBranch;
            }
            treeBranch = '#' + treeBranch + '#';
        }
        System.out.println(root);
    }
}
