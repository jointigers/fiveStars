package activitytest.fivestars;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by Administrator on 2017/5/6.
 */

public class FiveStarTime {
    public static void setFiveStarTime(Context context,long time){
        SharedPreferences sharedPreferences=context.getSharedPreferences(Configure.SP_five_star_maybe_later_time, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit=sharedPreferences.edit();
        edit.putLong(Configure.SP_five_star_maybe_later_time,time);
        edit.apply();
    }
    public  static long getFiveStarTime(Context context){
        SharedPreferences sharedPreferences=context.getSharedPreferences(Configure.SP_five_star_maybe_later_time,Context.MODE_PRIVATE);
        Long time = sharedPreferences.getLong(Configure.SP_five_star_maybe_later_time,0);
        return time;
    }

}
