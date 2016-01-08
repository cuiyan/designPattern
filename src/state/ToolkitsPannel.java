package state;

import java.util.HashMap;
import java.util.Map;

public class ToolkitsPannel {
	Map<String,AbstractTool> toolsMap = new HashMap<String,AbstractTool>();
	AbstractTool currentTool;
	public void addTool(String toolName,AbstractTool abstractTool){
		toolsMap.put(toolName, abstractTool);
	}
	
	public void selectTool(String toolName){
		currentTool = toolsMap.get(toolName);
	}
	public void drawOrExecute(){
		if(currentTool !=null){
			currentTool.drawOrExecute();
		}else{
			System.out.println("Please select a tool first");
		}
	}
}
