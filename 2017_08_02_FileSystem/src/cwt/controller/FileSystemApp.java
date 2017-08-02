package cwt.controller;

import cwt.dao.FileSystem;
import cwt.models.DirColor;
import cwt.models.FileColor;

public class FileSystemApp {

	public static void main(String[] args) {
		FileSystem fileSystem = new FileSystem();
		
		fileSystem.AddDir(0, "dir1", 1, DirColor.B);
		fileSystem.AddDir(0, "dir2", 2, DirColor.B);
		fileSystem.AddDir(0, "dir3", 3, DirColor.B);

		fileSystem.AddDir(1, "dir4", 4, DirColor.B);
		fileSystem.AddDir(1, "dir5", 5, DirColor.B);
		fileSystem.AddDir(3, "dir6", 6, DirColor.B);
		
		fileSystem.AddDir(4, "dir44", 16, DirColor.B);
		
		
		fileSystem.AddFile(0, "file1", 7, FileColor.G);
		fileSystem.AddFile(1, "file2", 8, FileColor.G);
		fileSystem.AddFile(3, "file3", 9, FileColor.G);
		fileSystem.AddFile(4, "file4", 10, FileColor.G);
		fileSystem.AddFile(4, "file5", 11, FileColor.G);
		fileSystem.AddFile(5, "file6", 12, FileColor.G);
		
		fileSystem.deleteFile(11);
		fileSystem.deleteDir(4);
		fileSystem.deleteDir(0);
		
		fileSystem.showAll();
	}

}
