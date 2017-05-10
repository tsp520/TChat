package com.netease.nim.demo.main.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.netease.nim.demo.R;
import com.netease.nim.demo.main.model.MainTab;
import com.netease.nim.demo.wzteng.GlobalConfig;
import com.netease.nim.demo.wzteng.friends.activity.FriendsActivity;
import com.netease.nim.demo.wzteng.qrcode.QrCodeActivity;
import com.netease.nim.demo.wzteng.webview.WebViewActivity;


/**
 * Created by WZTENG on 2017/03/06 0006.
 */

public class FindListFragment extends MainTabFragment {
    private RelativeLayout reFriends;
    private RelativeLayout reScan;
    private RelativeLayout reGame;
    private RelativeLayout reShopping;

    public FindListFragment() {
        this.setContainerId(MainTab.FIND.fragmentId);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        onCurrent(); // 触发onInit，提前加载
    }

    @Override
    protected void onInit() {
        findView(R.layout.wzt_find_contacts);
        initUI();
    }

    private void initUI() {
        reFriends = findView(R.id.re_friends);
        reFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FriendsActivity.start(getContext(), null);
            }
        });
        reScan = findView(R.id.re_scan);
        reScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QrCodeActivity.start(getContext());
            }
        });
        reGame = findView(R.id.re_game);
        reGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebViewActivity.start(GlobalConfig.GAMEURL, "游戏", getContext());
            }
        });
        reShopping = findView(R.id.re_shopping);
        reShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebViewActivity.start(GlobalConfig.SHOPPINGURL, "购物", getContext());
            }
        });
    }

}
