package com.mqueiroz.orama.data;


import com.mqueiroz.orama.BuildConfig;
import com.mqueiroz.orama.domain.Fund;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService
{
    @GET( BuildConfig.API_ADDRESS )
    Call<List<Fund>> getFunds( );
}
