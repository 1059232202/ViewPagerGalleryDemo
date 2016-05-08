package com.viewpagergallerydemo;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by leo on 16/5/8.
 * Loading Dialog
 */
public class LoadingDialog extends Dialog {
    public LoadingDialog(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_loading);
        setCancelable(false);
    }
}
