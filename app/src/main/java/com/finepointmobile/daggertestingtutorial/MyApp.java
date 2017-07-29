package com.finepointmobile.daggertestingtutorial;

import android.app.Application;

/**
 * Created by danielmalone on 7/29/17.
 */

public class MyApp extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("asdfasdfasdf"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
