package com.example.taskmanager.data;

import com.example.taskmanager.analytics.AnalyticsAdapter;
import com.example.taskmanager.analytics.GoogleAnalytics;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class DataModule {

    @Provides
    @Singleton
    public AnalyticsAdapter provideAnalyticsAdapter() {

        return new GoogleAnalytics();
    }

    @Provides
    @Singleton
    public Executor provideExecutor() {

        return Executors.newFixedThreadPool(1);
    }

}
