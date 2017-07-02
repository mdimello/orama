package com.mqueiroz.orama.presentation.fund.list;


import com.mqueiroz.orama.domain.Fund;

import java.util.List;

interface FundListContract
{
    interface View
    {
        void setListItems( List<Fund> funds );


        void displayError( );
    }



    interface Presenter
    {

    }
}
