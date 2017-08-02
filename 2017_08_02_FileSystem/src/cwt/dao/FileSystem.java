package cwt.dao;

import cwt.models.*;

public class FileSystem {
	Dir root;

	public FileSystem() {
		root = new Dir(0, "root", 0, DirColor.B);
	}
	
	
	public void AddDir(int parentId, String name, int id, DirColor color){
		Dir parentDir = search(parentId,root);
		if (parentDir!=null)
			parentDir.getFiles().put(id, new Dir(parentId, name, id, color));
	}
	
	public void AddFile(int parentId, String name, int id, FileColor color){
		Dir parentDir = search(parentId,root);
		if (parentDir!=null)
			parentDir.getFiles().put(id, new File(parentId, name, id, color));
	}


	private Dir search(int parentId, Dir parent) {
		Dir res=null;
		if (parent.getId()==parentId)
			return parent;
		if (parent.files.containsKey(parentId)){
			return (Dir) parent.getFiles().get(parentId);
		}
		for (FileDir fd : parent.getFiles().values()){
			if (fd.getClass()==Dir.class)
				return search(parentId, (Dir) fd);
		}		
		return res;
	}
	
	public void deleteDir(int id){
		if (id==0){
			System.err.println("You can't delete root directory");
		}
		else deleteFileDir(id);			
	}
	
	public void deleteFile(int id){
		deleteFileDir(id);		
	}
	
	private void deleteFileDir(int id) {
		Dir parentDir=searchById(id,root);
		if (parentDir==null)
			return;
		FileDir delItem = parentDir.files.get(id);
		
		if (delItem!=null){
			parentDir.files.remove(id);
		}			
	}


	private Dir searchById(int id, Dir curDir) {
		if (curDir.files.containsKey(id)){
			return (Dir) curDir;
			
		}
		for (FileDir fd : curDir.getFiles().values()){
			if (fd.getClass()==Dir.class)
				return searchById(id, (Dir) fd);
		}		
		return null;
	}


	/**
	 * Print the whole file system
	 */
	public void showAll(){
		printFiles(0,root);
	}


	private void printFiles(int level, FileDir root) {
		StringBuilder str = new StringBuilder();
		for (int i=1 ; i<=level; i++){
			str.append(" - ");
		}
		str.append(root.getName());
		System.out.println(str);
		if ((root.getClass()==File.class) || (((Dir) root).getFiles()==null)){
			return;
		}
		for (FileDir fd : ((Dir) root).getFiles().values()){
			printFiles(level+1, fd);
		}
	}
}
