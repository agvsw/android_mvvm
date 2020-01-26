package com.agus.mvvmproject.di;

import com.agus.mvvmproject.model.CountriesService;
import com.agus.mvvmproject.viewmodel.ListViewModel;

import dagger.Component;

@Component(modules = {ApiModule.class})
public interface ApiComponent {
    void inject(CountriesService service);
    void inject(ListViewModel viewModel);
}
