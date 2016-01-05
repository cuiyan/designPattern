package proxy;

public interface FileTblDao {
	 public void deleteFile(FileTbl fileTbl);  
	 public void updateFile(FileTbl fileTbl);  
	 public void saveFile(FileTbl fileTbl);  
	  public FileTbl getFile(String fileId);  
}
