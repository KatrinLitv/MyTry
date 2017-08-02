package cwt.models;

import java.util.*;

public class Dir extends FileDir {
	DirColor color;
	public Map<Integer, FileDir> files;
	
	public Dir(int parentId, String name, int id, DirColor color) {
		super(parentId, name, id);
		this.files = new HashMap<>();
		this.color = color;
	}

	public Map<Integer, FileDir> getFiles() {
		return files;
	}

	public void setFiles(Map<Integer, FileDir> files) {
		this.files = files;
	}
	
	
}
