package com.mqueiroz.orama.presentation.fund.list;


import android.support.annotation.NonNull;

import com.mqueiroz.orama.data.ApiService;
import com.mqueiroz.orama.data.ApiUtils;
import com.mqueiroz.orama.domain.Fund;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class FundListPresenter implements FundListContract.Presenter
{
    private FundListContract.View mView;

    private List<Fund> mFunds;



    FundListPresenter( FundListContract.View view )
    {
        mView = view;

        ApiService apiService = ApiUtils.getInstance( );
        apiService.getFunds( ).enqueue( new Callback<List<Fund>>( )
        {
            @Override
            public void onResponse( @NonNull Call<List<Fund>> call, @NonNull Response<List<Fund>> response )
            {
                mFunds = response.body( );
                mView.setData( mFunds );
            }



            @Override
            public void onFailure( @NonNull Call<List<Fund>> call, @NonNull Throwable t )
            {
                mView.displayError( );
            }
        } );
    }
}
