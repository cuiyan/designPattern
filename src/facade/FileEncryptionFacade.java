package facade;

public class FileEncryptionFacade {
	public void operate(){
		FileRead fileRead = new FileRead();
		FileEncryption fileEncryption = new FileEncryption();
		FileSave fileSave = new FileSave();
		fileRead.read();
		fileEncryption.encryption();
		fileSave.save();
	}
}
