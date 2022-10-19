package actions;

import object.IObject;

public class TaskAction implements IAction{

	@Override
	public void execute(IObject object) {
		System.out.println("Task: "+object.toString());		
	}

}
