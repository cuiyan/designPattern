package visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	public List<Corporation> eumn = new ArrayList<Corporation>();
	public void addVisitor(Corporation c){
		eumn.add(c);
	}
	public void removeVisitor(Corporation e){
		eumn.remove(e);
	}
	public void accapt(Visitor v){
		for(Corporation e:eumn)
			e.accept(v);
	}
}
