package com.memorko.app.events;

public abstract class AbstractEvent implements Event {

	protected abstract void fire(EventObserver eventObserver);

}
