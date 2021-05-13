import java.io.File;

/**
 * @Author:hanxuejie
 * @Date:2021/5/13 16:57
 */

public class Demo01 {
    public static void main(String[] args) {
        //展示文件树
          File f = new File("d:/demo01");
        printTree(f,0);

    }
    public static void printTree(File f,int level){
        for (int i=0; i < level;i++){
            System.out.println("\t");
        }
        System.out.println(f.getAbsolutePath());
        if (f.isDirectory()){
            level ++;
            File[] strs = f.listFiles();
            for (int i=0; i<strs.length;i++){
                File f0=strs[i];
                printTree(f0,level+1);
            }
        }
    }
}
