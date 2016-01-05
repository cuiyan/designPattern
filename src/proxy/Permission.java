package proxy;

public class Permission {
	 public static enum PERMISSION {  
		 ALL,   
		 SEARCH
	 }
	 private PERMISSION level;  
	 public Permission(PERMISSION level) {  
		  this.level = level;  
	 }
	 public PERMISSION getLevel() {  
		    return level;  
	 }
}
