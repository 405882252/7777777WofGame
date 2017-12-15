package chen.lion.wofgame.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by chenxiu on 2017/12/15.
 */

public abstract class BaseActivity<T extends BasePresenter> extends FragmentActivity {

    protected Context mContext;

    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());
        ButterKnife.bind(this);
        mContext=this;
        initData();
    }

    protected abstract int initLayout();

    protected abstract void initData();
}
