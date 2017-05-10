package com.netease.nim.demo.session.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.netease.nim.demo.R;
import com.netease.nimlib.sdk.msg.model.IMMessage;

/**
 * Created by WZTENG on 2017/05/10 0010.
 */

public class RedPackedDialog extends Dialog {

    public RedPackedDialog(Context context) {
        super(context);
    }

    public RedPackedDialog(Context context, int theme) {
        super(context, theme);
    }

    public static class Builder {
        private Context context;
        private IMMessage message;
        private ImageView ivClose;
        private ImageView ivAvatar;
        private TextView tvName;
        private TextView tvTip;
        private TextView tvSay;
        private ImageView ivOpen;


        public Builder(Context context, IMMessage message) {
            this.context = context;
            this.message = message;
        }


        public RedPackedDialog create() {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // instantiate the dialog with the custom Theme
            final RedPackedDialog dialog = new RedPackedDialog(context);
            View layout = inflater.inflate(R.layout.wzt_redpacked_dialog, null);
            dialog.addContentView(layout, new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));




            dialog.setContentView(layout);
            dialog.setCanceledOnTouchOutside(false);
            return dialog;
        }
    }
}
