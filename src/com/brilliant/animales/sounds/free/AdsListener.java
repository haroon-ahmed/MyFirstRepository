package com.brilliant.animales.sounds.free;

import android.content.Context;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AdsListener extends AdListener {
    private Context mContext;
    private AdView _mAdView;
    public AdsListener(Context context,AdView mAdView) {
        this.mContext = context;
        this._mAdView=mAdView;
    }

    @Override
    public void onAdLoaded() {
        this._mAdView.setVisibility(View.VISIBLE);
    }

    @Override
    public void onAdFailedToLoad(int errorCode) {
        switch(errorCode) {
            case AdRequest.ERROR_CODE_INTERNAL_ERROR:
			break;
            case AdRequest.ERROR_CODE_INVALID_REQUEST:
			break;
            case AdRequest.ERROR_CODE_NETWORK_ERROR:
			break;
            case AdRequest.ERROR_CODE_NO_FILL:
			break;
        }
       
    }

    @Override
    public void onAdOpened() {
     //   Toast.makeText(mContext, "onAdOpened()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdClosed() {
       // Toast.makeText(mContext, "onAdClosed()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdLeftApplication() {
       // Toast.makeText(mContext, "onAdLeftApplication()", Toast.LENGTH_SHORT).show();
    }
}
