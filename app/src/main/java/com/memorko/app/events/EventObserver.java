package com.memorko.app.events;

import com.memorko.app.events.engine.FlipDownCardsEvent;
import com.memorko.app.events.engine.GameWonEvent;
import com.memorko.app.events.engine.HidePairCardsEvent;
import com.memorko.app.events.ui.BackGameEvent;
import com.memorko.app.events.ui.DifficultySelectedEvent;
import com.memorko.app.events.ui.FlipCardEvent;
import com.memorko.app.events.ui.NextGameEvent;
import com.memorko.app.events.ui.ResetBackgroundEvent;
import com.memorko.app.events.ui.StartEvent;
import com.memorko.app.events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
