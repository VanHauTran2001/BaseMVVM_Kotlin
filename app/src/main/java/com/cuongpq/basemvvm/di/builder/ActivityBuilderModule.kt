package com.cuongpq.basemvvm.di.builder

import com.cuongpq.basemvvm.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
//******************************
//******************************
//***** Create by cuongpq  *****
//******************************
//******************************

@Module
abstract class ActivityBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}