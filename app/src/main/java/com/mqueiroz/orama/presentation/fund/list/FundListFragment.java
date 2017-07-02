package com.mqueiroz.orama.presentation.fund.list;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.mqueiroz.orama.R;
import com.mqueiroz.orama.domain.Fund;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FundListFragment extends Fragment implements FundListContract.View
{
    private FundListContract.Presenter mPresenter;

    @BindView( R.id.fund_list_filter_button )
    Button mFilterButton;

    @BindView( R.id.fund_list_loading )
    ProgressBar mLoadingView;

    @BindView( R.id.fund_list_error )
    TextView mErrorView;

    @BindView( R.id.fund_list_recycler_view )
    RecyclerView mRecyclerView;
    FundListAdapter mAdapter;



    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );

        mPresenter = new FundListPresenter( this );
    }



    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
    {
        View view = inflater.inflate( R.layout.fragment_fund_list, container, false );

        ButterKnife.bind( this, view );

        mAdapter = new FundListAdapter( new FundListItemViewHolder.OnListItemClick( )
        {
            @Override
            public void displayInfo( Fund fund )
            {
                Toast.makeText( getContext( ), "Info " + fund.getSimpleName( ), Toast.LENGTH_SHORT ).show( );
            }



            @Override
            public void displayInvest( Fund fund )
            {
                Toast.makeText( getContext( ), "Invest " + fund.getSimpleName( ), Toast.LENGTH_SHORT ).show( );
            }
        } );
        mAdapter.setHasStableIds( true );

        mRecyclerView.setAdapter( mAdapter );
        mRecyclerView.setLayoutManager( new LinearLayoutManager( getContext( ) ) );
        mRecyclerView.setHasFixedSize( true );

        return view;
    }



    @Override
    public void setListItems( List<Fund> funds )
    {
        mLoadingView.setVisibility( View.GONE );
        mErrorView.setVisibility( View.GONE );
        mRecyclerView.setVisibility( View.VISIBLE );

        mAdapter.setListItems( funds );
    }



    @Override
    public void displayError( )
    {
        mLoadingView.setVisibility( View.GONE );
        mErrorView.setVisibility( View.VISIBLE );
        mRecyclerView.setVisibility( View.GONE );
    }
}
