import java.io.*;
public class FileProcessingTestAppl {

	public static void main(String[] args) throws IOException {
		if(args.length>0){
			File file = new File("c:\\Mars2\\16_08_22_FileProcessing");
			//file.mkdirs();
//			if (!file.exists())
//				file.createNewFile();
//			System.out.println(file.exists());
			
			//displayFileContent(file);
			displayFileContent1(file,0);
		}
	}
private static void displayFileContent1(File file, int level) {
	for (File f : file.listFiles()){
		printTab(level);
		if (f.isDirectory()){
			System.err.println(f.getName()+": ");
			displayFileContent1(f,level+1);
		}
		else 
			System.out.println(f.getName());
	}		
}
private static void printTab(int level) {
	for (int i=0; i<level ; i++)
		System.out.print("    ");	
}
/**
 * Displays content of directory related with the parameter file
 * in the form <name> dir || file
 * @param file
 */
	private static void displayFileContent(File file) {
		for (File f : file.listFiles()){
			String nnn = (f.isDirectory()) ? ": dir" : " file";
			System.out.println(f.getName()+nnn);
		}	
	}

}
