package chen.lion.wofgame.base;

import chen.lion.wofgame.model.Api;

/**
 * Created by chenxiu on 2017/12/15.
 */

public abstract class BasePresenter<T extends IMVPView> {

    protected T mView;

    public void attchView(T view){
        this.mView = view;

    }

    public void separate(){
        mView = null;
    }
}
