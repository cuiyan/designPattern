package proxy;

public class FileTblDaoProxy implements FileTblDao{
	FileTblDao fileTblDao;  
	Permission permission;  

	public FileTblDaoProxy(Permission permission) {  
		if (fileTblDao == null) {
			fileTblDao = new FileTblDaoImpl();  
		}
		this.permission = permission;
	}
	@Override
	public void deleteFile(FileTbl fileTbl) {
		// TODO Auto-generated method stub
		if(Permission.PERMISSION.ALL.equals(permission.getLevel())){
			fileTblDao.deleteFile(fileTbl);
		}else{
			System.out.println("no permission to delete file:" + fileTbl.getId());  
		}
	}

	@Override
	public void updateFile(FileTbl fileTbl) {
		// TODO Auto-generated method stub
		if(Permission.PERMISSION.ALL.equals(permission.getLevel())){
			fileTblDao.updateFile(fileTbl);
		}else{
			System.out.println("no permission to update file:" + fileTbl.getId());  
		}
	}

	@Override
	public void saveFile(FileTbl fileTbl) {
		// TODO Auto-generated method stub
		if(Permission.PERMISSION.ALL.equals(permission.getLevel())){
			fileTblDao.saveFile(fileTbl);
		}else{
			System.out.println("no permission to save file:" + fileTbl.getId());  
		}
	}

	@Override
	public FileTbl getFile(String fileId) {
		return fileTblDao.getFile(fileId);  
	}

}
