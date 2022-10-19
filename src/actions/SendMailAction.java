package actions;

import object.IObject;

public class SendMailAction implements IAction{

	@Override
	public void execute(IObject object) {
		System.out.println("E-mail: "+object.toString());		
	}

}
