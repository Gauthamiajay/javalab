import java.io.File;
public class FileClassDemo {
public static void main(String[] args) {
File file = new File("sample.txt");
System.out.println("File name: " + file.getName());
System.out.println("File exists: " + file.exists());
System.out.println("Absolute path: "+ file.getAbsolutePath());
}
}
