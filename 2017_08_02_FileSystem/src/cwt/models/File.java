package cwt.models;

public class File extends FileDir {
	FileColor color;

	public File(int parentId, String name, int id, FileColor color) {
		super(parentId, name, id);
		this.color = color;
	}
	
	
}
