package factory;

import actions.IAction;
import actions.SendMailAction;
import actions.TaskAction;

public class ActionFactory {
	public IAction getinstance (String nrobject) {
		switch(nrobject) {
			case "Mail":
				return new SendMailAction();
			default:
				return new TaskAction();
		}
		
	} 
}
