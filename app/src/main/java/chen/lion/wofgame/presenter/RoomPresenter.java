package chen.lion.wofgame.presenter;

import chen.lion.wofgame.base.BasePresenter;
import chen.lion.wofgame.model.Api;
import chen.lion.wofgame.model.RoomList;
import chen.lion.wofgame.view.IRoomVP;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by chenxiu on 2017/12/15.
 */

public class RoomPresenter extends BasePresenter<IRoomVP> {

    public void getRoomList(){
        Api.getInstence().getAPI()
                .getRoomList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RoomList>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull RoomList roomList) {
                        if(roomList!=null){
                            mView.onSucceed(roomList);
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        mView.onFail(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                }
                );
    }
}
