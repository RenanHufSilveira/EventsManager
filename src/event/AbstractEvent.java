package event;

import java.util.ArrayList;

import actions.IAction;
import object.IObject;

public class AbstractEvent implements IEvent{
	
	private ArrayList<IObject> associatedObjects = new ArrayList<IObject>();
	private ArrayList<IAction> actions = new ArrayList<IAction>();
	
	public AbstractEvent(ArrayList<IObject> associatedObjects,  ArrayList<IAction> actions) {
		this.associatedObjects = associatedObjects;
		this.actions = actions;
	}
	
	public ArrayList<IObject> getAssociatedObjects() {
		return associatedObjects;
	}
	public void setAssociatedObjects(ArrayList<IObject> associatedObjects) {
		this.associatedObjects = associatedObjects;
	}
	public ArrayList<IAction> getActions() {
		return actions;
	}
	public void setActions(ArrayList<IAction> actions) {
		this.actions = actions;
	}
	
	@Override
	public void execute() {
		this.getAssociatedObjects().forEach((object) -> {
			this.getActions().forEach((action) -> {
				action.execute(object);
			});
		});
	}
	
	@Override
	public boolean conditionToExecute(int value) {
		return false;
	}
}
