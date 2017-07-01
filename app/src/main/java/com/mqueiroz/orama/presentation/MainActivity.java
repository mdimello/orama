package com.mqueiroz.orama.presentation;

import android.app.Activity;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.mqueiroz.orama.R;
import com.mqueiroz.orama.presentation.fund.list.FundListFragment;


public class MainActivity extends AppCompatActivity implements MainContract.View
{
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        displayFragment( new FundListFragment( ) );
    }



    private void displayFragment( Fragment fragment )
    {
        FragmentManager manager = getSupportFragmentManager( );
        FragmentTransaction transaction = manager.beginTransaction( );
        transaction.replace( R.id.content_frame, fragment );
        transaction.commit( );
    }

}
