package event;

import java.util.ArrayList;

public class EventTrigger {
	
	private ArrayList<IEvent> events = new ArrayList<IEvent>();

	public ArrayList<IEvent> getEvent() {
		return events;
	}

	public void setEvent(ArrayList<IEvent> event) {
		this.events = event;
	}
	
	public void executeTrigger(int value) {
		this.events.forEach((event) -> {
			if(event.conditionToExecute(value)) {
				System.out.println("Valor "+ value +" Executando evento: " + event.toString());
				event.execute();
				System.out.println("----------------");
			}
		});
	}

}
