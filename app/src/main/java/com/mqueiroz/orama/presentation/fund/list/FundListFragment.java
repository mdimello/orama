package com.mqueiroz.orama.presentation.fund.list;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mqueiroz.orama.R;

public class FundListFragment extends Fragment implements FundListContract.View
{
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
    {
        View view = inflater.inflate( R.layout.fragment_fund_list, container, false );

        return view;
    }

}
