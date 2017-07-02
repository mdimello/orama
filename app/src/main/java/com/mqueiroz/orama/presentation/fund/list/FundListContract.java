package com.mqueiroz.orama.presentation.fund.list;


import com.mqueiroz.orama.domain.Fund;

import java.util.List;

interface FundListContract
{
    interface View
    {
        void displayError( );


        void displayEmptyList( );


        void setListItems( List<Fund> funds );
    }



    interface Presenter
    {
        void setSuitabilityFilter( List<Integer> suitability );
    }
}
