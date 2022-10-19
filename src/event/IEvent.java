package event;

public interface IEvent {

	public void execute();
	public boolean conditionToExecute(int value);
}
