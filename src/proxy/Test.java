
package proxy;

public class Test {
	public static void main(String[] args) {
		Permission searchPermission = new Permission(Permission.PERMISSION.SEARCH);
        FileTblDao searchDao = new FileTblDaoProxy(searchPermission);
        FileTbl fileTbl = searchDao.getFile("file01");
        //只读权限的用户修改文件
        searchDao.updateFile(fileTbl);
        
        //全权限的用户
        Permission allPermission = new Permission(Permission.PERMISSION.ALL);
        FileTblDao allDao = new FileTblDaoProxy(allPermission);
        //全权限的用户修改文件
        allDao.updateFile(fileTbl);

	}
}
