package event;

import java.util.ArrayList;

import actions.IAction;
import object.IObject;

public class DeleteFileEvent extends AbstractEvent {
	
	public DeleteFileEvent(ArrayList<IObject> associatedObjects, ArrayList<IAction> actions) {
		super(associatedObjects, actions);
	}

	@Override
	public boolean conditionToExecute(int value) {
		return (value % 8 == 0);
	}

}
