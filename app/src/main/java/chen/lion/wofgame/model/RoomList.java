package chen.lion.wofgame.model;

import java.util.List;

/**
 * Created by chenxiu on 2017/12/15.
 */

public class RoomList {


    /**
     * ReturnCode : 200
     * data : [{"room_name":"快来狼人杀","room_id":100000,"room_users":"[]","room_start_time":null,"room_lvl":null},{"room_name":"你看你看来狼人杀","room_id":100001,"room_users":null,"room_start_time":null,"room_lvl":null},{"room_name":"疯狂狼人杀","room_id":100002,"room_users":"[]","room_start_time":"2017-12-12 10:12:39","room_lvl":null},{"room_name":null,"room_id":100003,"room_users":null,"room_start_time":"2017-12-12 11:12:08","room_lvl":null}]
     * ReturnMsg : 成功
     * Date : 2017/12/15 07:12:07
     */

    private String ReturnCode;
    private String ReturnMsg;
    private String Date;
    private List<DataBean> data;

    public String getReturnCode() {
        return ReturnCode;
    }

    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    public String getReturnMsg() {
        return ReturnMsg;
    }

    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * room_name : 快来狼人杀
         * room_id : 100000
         * room_users : []
         * room_start_time : null
         * room_lvl : null
         */

        private String room_name;
        private int room_id;
        private String room_users;
        private Object room_start_time;
        private Object room_lvl;

        public String getRoom_name() {
            return room_name;
        }

        public void setRoom_name(String room_name) {
            this.room_name = room_name;
        }

        public int getRoom_id() {
            return room_id;
        }

        public void setRoom_id(int room_id) {
            this.room_id = room_id;
        }

        public String getRoom_users() {
            return room_users;
        }

        public void setRoom_users(String room_users) {
            this.room_users = room_users;
        }

        public Object getRoom_start_time() {
            return room_start_time;
        }

        public void setRoom_start_time(Object room_start_time) {
            this.room_start_time = room_start_time;
        }

        public Object getRoom_lvl() {
            return room_lvl;
        }

        public void setRoom_lvl(Object room_lvl) {
            this.room_lvl = room_lvl;
        }
    }
}
