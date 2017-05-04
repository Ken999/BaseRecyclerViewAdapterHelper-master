package com.chad.library.adapter.base.loadmore;


import com.chad.library.R;

/**
    *Created by 马小布 on 2017/5/3.
    *Project : recycler adapter封装
    *Program Name :  com.chad.library.adapter.base.loadmore.SimpleLoadMoreView.java
    *Author :马庆龙 on 2017/5/3 19:04
    *email:maxiaobu1999@163.com
    *功能：加载更多view
    *伪码：
    *待完成：
*/
public final class SimpleLoadMoreView extends LoadMoreView {

    /**
     *
     * @return 加载更多的layout文件
     */
    @Override public int getLayoutId() {
        return R.layout.quick_view_load_more;
    }

    @Override protected int getLoadingViewId() {
        return R.id.load_more_loading_view;
    }

    @Override protected int getLoadFailViewId() {
        return R.id.load_more_load_fail_view;
    }

    @Override protected int getLoadEndViewId() {
        return R.id.load_more_load_end_view;
    }
}
