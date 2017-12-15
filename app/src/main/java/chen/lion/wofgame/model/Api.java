package chen.lion.wofgame.model;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static chen.lion.wofgame.constant.Constant.BASE_URL;

/**
 * Created by chenxiu on 2017/12/15.
 */

/**
 * 接口Api
 */
public class Api {

    private static IApiService mApiService = null;
    private static Api mApi = null;

    public static Api getInstence() {
        if (mApi == null) {
            synchronized (Api.class) {
                if (mApi == null) {
                    mApi = new Api();
                }
            }
        }
        return mApi;
    }
    public IApiService getAPI() {
        OkHttpClient client = new OkHttpClient.Builder().build();
        if (mApiService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            mApiService = retrofit.create(IApiService.class);
        }
        return mApiService;
    }
}
