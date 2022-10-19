package job;

import java.util.ArrayList;

import actions.IAction;
import actions.SendMailAction;
import actions.TaskAction;
import event.CreateUserEvent;
import event.DeleteFileEvent;
import event.EventTrigger;
import event.IEvent;
import object.DocumentObject;
import object.IObject;
import object.UserObject;

public class ExecuteActions {

	public static void main(String[] args) {
		
		
		EventTrigger eTrigger = new EventTrigger();
		ArrayList<IEvent> events = new ArrayList<IEvent>();
		
		
		ArrayList<IObject> associatedObjects = new ArrayList<IObject>();
		associatedObjects.add(new DocumentObject());
		associatedObjects.add(new UserObject());
		ArrayList<IAction> actions = new ArrayList<IAction>();
		actions.add(new SendMailAction());
		actions.add(new TaskAction());
		CreateUserEvent eventUser = new CreateUserEvent(associatedObjects, actions);
		DeleteFileEvent eventFile = new DeleteFileEvent(associatedObjects, actions);

		events.add(eventUser);
		events.add(eventFile);
		eTrigger.setEvent(events);
							
		for (int i = 0; i < 50; i++) {
			eTrigger.executeTrigger(i);
		}
		
	}

}
