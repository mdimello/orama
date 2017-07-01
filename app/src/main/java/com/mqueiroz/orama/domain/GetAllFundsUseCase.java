package com.mqueiroz.orama.domain;


import java.util.List;

public class GetAllFundsUseCase
{
    public interface Callback
    {
        void onSuccess( List<Fund> fundList );


        void onError( String message );
    }
}
