package event;

import java.util.ArrayList;

import actions.IAction;
import object.IObject;

public class CreateUserEvent extends AbstractEvent{

	public CreateUserEvent(ArrayList<IObject> associatedObjects, ArrayList<IAction> actions) {
		super(associatedObjects, actions);
	}

	@Override
	public boolean conditionToExecute(int value) {
		return (value % 2 == 1);
	}
	
}
