package com.ONLLL.baserecyclerviewadapterhelper.adapter;

import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.ONLLL.basequickadapter.BaseQuickAdapter;
import com.ONLLL.basequickadapter.BaseViewHolder;
import com.ONLLL.baserecyclerviewadapterhelper.R;
import com.ONLLL.baserecyclerviewadapterhelper.data.DataServer;
import com.ONLLL.baserecyclerviewadapterhelper.entity.Status;


/**
 * 文 件 名: PullToRefreshAdapter
 * 创 建 人: Allen
 * 创建日期: 16/12/24 19:55
 * 邮   箱: AllenCoder@126.com
 * 修改时间：
 * 修改备注：
 */
public class PullToRefreshAdapter extends BaseQuickAdapter<Status, BaseViewHolder> {
    public PullToRefreshAdapter() {
        super( R.layout.layout_animation, DataServer.getSampleData(5));
    }

    @Override
    protected void convert(BaseViewHolder helper, Status item) {
        switch (helper.getLayoutPosition()%
                3){
            case 0:
                helper.setImageResource(R.id.img,R.mipmap.animation_img1);
                break;
            case 1:
                helper.setImageResource(R.id.img,R.mipmap.animation_img2);
                break;
            case 2:
                helper.setImageResource(R.id.img,R.mipmap.animation_img3);
                break;
        }
        helper.setText(R.id.tweetName,"Hoteis in Rio de Janeiro");
        String msg="\"He was one of Australia's most of distinguished artistes, renowned for his portraits\"";
        ( (TextView)helper.getView(R.id.tweetText)).setMovementMethod(LinkMovementMethod.getInstance());
    }

}
