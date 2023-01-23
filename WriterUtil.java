import java.io.*;
/**
 * 写文件
 */
public class WriterUtil {
    public static void writer(String txt,String filename) throws Exception{
        writer(txt, filename,true);
    }
    public static void writer(String txt) throws Exception{
        writer(txt,"b.txt",true);
    }
    public static void writer(String txt,boolean append) throws Exception{
        writer(txt,"b.txt",append);
    }
    public static void writer(String txt,String filename,boolean append) throws Exception{
        File f = new File(filename);
        FileOutputStream fileOutputStream = new FileOutputStream(f,append);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.append(txt);
        bufferedWriter.newLine();
        bufferedWriter.close();
        outputStreamWriter.close();
        fileOutputStream.close();
    }
}
