package cwt.models;

public abstract class FileDir {
	int parentId;
	String name;
	int id;
	
	public FileDir(int parentId, String name, int id) {
		this.parentId = parentId;
		this.name = name;
		this.id = id;
	}

	public int getParentId() {
		return parentId;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
