package chen.lion.wofgame.base;

/**
 * Created by chenxiu on 2017/12/15.
 */

public  interface IMVPView<T> {
      void onSucceed(T data);
     void onNetStart();
    void onFail(String msg);
}
