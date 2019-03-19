package com.memorko.app.events;

import com.memorko.app.events.engine.FlipDownCardsEvent;
import com.memorko.app.events.engine.GameWonEvent;
import com.memorko.app.events.engine.HidePairCardsEvent;
import com.memorko.app.events.ui.BackGameEvent;
import com.memorko.app.events.ui.FlipCardEvent;
import com.memorko.app.events.ui.NextGameEvent;
import com.memorko.app.events.ui.ResetBackgroundEvent;
import com.memorko.app.events.ui.ThemeSelectedEvent;
import com.memorko.app.events.ui.DifficultySelectedEvent;
import com.memorko.app.events.ui.StartEvent;


public class EventObserverAdapter implements EventObserver {

	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();		
	}

}
