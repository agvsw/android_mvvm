package com.agus.mvvmproject.di;

import com.agus.mvvmproject.model.CountriesAPI;
import com.agus.mvvmproject.model.CountriesService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApiModule {
    private static final String BASE_URL = "http://192.168.43.174:8081/api/v1/";

    @Provides
    public CountriesAPI provideCountriesApi(){
        return new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build().create(CountriesAPI.class);
    }

    @Provides
    public CountriesService provideountriesServices(){
        return CountriesService.getInstance();
    }
}
