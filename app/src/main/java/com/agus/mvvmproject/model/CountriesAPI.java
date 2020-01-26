package com.agus.mvvmproject.model;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface CountriesAPI {
    @GET("countries")
    Single<List<CountryModel>> getCountries();
}
