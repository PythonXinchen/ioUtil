import java.io.*;

public class ReadUtil {
    public static void reader(String pathname){
        try {
            File f = new File(pathname);
            FileInputStream fileInputStream = new FileInputStream(f);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine())!= null) {
                sb.append(line).append("\n");
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
            System.out.println(sb);
        } catch (Exception error) {
            System.out.println("[E]IO流异常:"+error);
        }
    }
}