package chen.lion.wofgame.model;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by chenxiu on 2017/12/15.
 */

public interface IApiService {

    @GET("room/list")
    Observable<RoomList> getRoomList();
}
