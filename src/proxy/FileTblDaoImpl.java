package proxy;

public class FileTblDaoImpl implements FileTblDao {

	@Override
	public void deleteFile(FileTbl fileTbl) {
		 System.out.println("delete file:" + fileTbl.getId());          
	}

	@Override
	public void updateFile(FileTbl fileTbl) {
		// TODO Auto-generated method stub
		   System.out.println("update file:" + fileTbl.getId());  

	}

	@Override
	public void saveFile(FileTbl fileTbl) {
		// TODO Auto-generated method stub
		   System.out.println("save file:" + fileTbl.getId());  

	}

	@Override
	public FileTbl getFile(String fileId) {
		// TODO Auto-generated method stub
		return new FileTbl(fileId);  
	}

}
