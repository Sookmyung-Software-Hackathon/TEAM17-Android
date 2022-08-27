package com.example.team17.presentation.di

import android.app.Application
import com.example.team17.BuildConfig
import com.example.team17.data.sharedpref.BoggleSharedPreference
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class BoggleApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@BoggleApplication)
            modules(netWorkModule, dataSourceModule, repositoryModule, viewModelModule)
        }

        BoggleSharedPreference.init(applicationContext)

        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }

    }
}