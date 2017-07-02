package com.mqueiroz.orama.data;


import com.mqueiroz.orama.BuildConfig;
import com.mqueiroz.orama.domain.Fund;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService
{
    @GET( "orama-media/json/fund_detail_full.json?limit=1000&offset=0&serializer=fund_detail_full" )
    Call<List<Fund>> getFunds( );
}
