package state;

public class Test {
	public static void main(String[] args) {
		ToolkitsPannel pannel = new ToolkitsPannel();
		AbstractTool tool1 = new LinePaneTool();
		pannel.addTool("LinePaneTool", tool1);
		
		AbstractTool tool2 = new EraseTool();
		pannel.addTool("ErasePaneTool", tool2);
		
		pannel.selectTool("LinePaneTool");
		pannel.drawOrExecute();
		
		pannel.selectTool("ErasePaneTool");
		pannel.drawOrExecute();
		
		
	}
}
