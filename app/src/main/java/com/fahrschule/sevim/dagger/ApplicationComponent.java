package com.fahrschule.sevim.dagger;

import com.fahrschule.sevim.AppModule;
import com.fahrschule.sevim.activities.CalendarActivity;
import com.fahrschule.sevim.activities.MainActivity;
import com.fahrschule.sevim.fragments.MessagesListFragment;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class, RetroApiModule.class})
public interface ApplicationComponent {
    void inject(MessagesListFragment fragment);

    void inject(MainActivity activity);

    void inject(CalendarActivity calendarActivity);
}
