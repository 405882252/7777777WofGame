package chen.lion.wofgame.view.room;

import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import butterknife.BindView;
import chen.lion.wofgame.R;
import chen.lion.wofgame.base.BaseActivity;
import chen.lion.wofgame.constant.Constant;
import chen.lion.wofgame.model.RoomList;
import chen.lion.wofgame.presenter.RoomPresenter;
import chen.lion.wofgame.view.IRoomVP;

/**
 * Created by chenxiu on 2017/12/15.
 */

public class RoomMainActivity extends BaseActivity<RoomPresenter> implements IRoomVP{

    @BindView(R.id.iv_room_main_bg)
    public ImageView mIvBg;

    @Override
    protected int initLayout() {
        return R.layout.activity_room_main;
    }

    @Override
    protected void initData() {
        mPresenter = new RoomPresenter();
        mPresenter.attchView(this);
        mPresenter.getRoomList();

        Glide.with(this)
                .load(Constant.BASE_URL+"logo12.jpg")
                .centerCrop()

                .into(mIvBg);
    }

    @Override
    public void onSucceed(RoomList data) {
    }

    @Override
    public void onNetStart() {

    }

    @Override
    public void onFail(String msg) {

    }
}
