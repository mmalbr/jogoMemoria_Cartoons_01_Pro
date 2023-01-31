package com.meafocus.memoriacartoon01pro.events;

import com.meafocus.memoriacartoon01pro.events.engine.FlipDownCardsEvent;
import com.meafocus.memoriacartoon01pro.events.engine.GameWonEvent;
import com.meafocus.memoriacartoon01pro.events.engine.HidePairCardsEvent;
import com.meafocus.memoriacartoon01pro.events.ui.BackGameEvent;
import com.meafocus.memoriacartoon01pro.events.ui.DifficultySelectedEvent;
import com.meafocus.memoriacartoon01pro.events.ui.FlipCardEvent;
import com.meafocus.memoriacartoon01pro.events.ui.NextGameEvent;
import com.meafocus.memoriacartoon01pro.events.ui.ResetBackgroundEvent;
import com.meafocus.memoriacartoon01pro.events.ui.StartEvent;
import com.meafocus.memoriacartoon01pro.events.ui.ThemeSelectedEvent;


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
