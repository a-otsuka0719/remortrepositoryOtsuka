package code6_3;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("rpgsave.dat", true);
    fos.write(65);        // 65は2進数で01000001
    fos.flush();
    fos.close();
  }
}