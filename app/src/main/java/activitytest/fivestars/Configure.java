package activitytest.fivestars;

public class Configure
{
	public static final boolean isDebug = false;
	public static final String Flurry_API_Key = "8MG5FP6VYY8BTRS3T5MB";
	public static final String AllAppKilledPackageName = "com.smart.cleaner.booster.clean.allkilled";
	public static final String OneAppKilledPackageName = "com.smart.cleaner.booster.clean.onekilled";
	public static final String AppKillBroadcastActionName = "com.smart.cleaner.booster.clean.appkilled";
	public static final String OpenAccessibilityBroadcastActionName = "com.smart.cleaner.booster.clean.openaccessibility";
	public static final String ServiceStartedByReceiverActionName = "com.smart.cleaner.booster.clean.receiver.startservice";
	public static final String BoostGameListChangeBroadcast = "com.smart.cleaner.booster.clean.bglist.change";

	public static final long SP_no_thanks_time = 86400 * 2 * 1000;
	public static final long SP_may_belater = 86400*1000  ;
	public static final long SP_five_star_later= 180 * 1000;
	public static final String SP_five_star_maybe_later_time = "five_star_maybe_later_time";
	public static final int MaybeLateAlphaAnimation = 1024;

	
	public static final int MinMemory = 1024;
	
	public static final int AnimationDuration = 500;
	
	public static final int ShotcutDuration = 4 * 1000;
	public static final int ShotcutCleanDuration = 4 * 1000; 
	
	public static final int ShotcutLightDuration = 2 * 1000 + 500;
	public static final int ShotcutLightShinePostpone = 200;
	
	public static final int NonSystemAppLine = 5; 
	
	public static final int CleanResultAdIntervalTime = 5 * 60 * 1000; // 5 minutes
    public static final int FastBoostIntervalTime = 60 * 1000; // 5 minutes

	public static final long MinCleanTimeInterval = 50 * 1000; // 单位毫秒
	public static final long MinLoadTimeInterval = 8 * 60 * 1000; // 单位毫秒
	
	public static final long CpuCoolIntervalTime = 3 * 60 * 1000; // 单位毫秒
	
	public static final long AS_Popup_Tips_Show_Time = 10 * 1000; // open Accessibility tips show time
	public static final long AS_Popup_Tips_Show_Delay_Time = 600; // time for open Accessibility tips delay to show
	public static final long Save_LaunchApp_Interval = 24 * 60 * 60 * 1000;

	public static final String SP_Name_WhiteList = "sp_w_l";
	public static final String SP_Field_PackageNames = "sp_f_pk";
	public static final String SP_Field_GPNames = "sp_f_gpk";
	public static final String SP_Field_Select_GPNames = "sp_f_s_gpks";
	public static final String SP_Field_UnSelect_GPNames = "f_us_gp";
	
	public static final String SP_Name_Switches = "sp_switches";
	public static final String SP_Field_Switch_Notify_Clean = "sp_f_s_n_c";
	public static final String SP_Field_Switch_Notify_Recommend = "sp_f_s_n_r";
	
	public static final String SP_Name_Event_Time = "sp_et_te";
	public static final String ShotCut = "ShortCut";
	public static final String HasShotCut = "HasShortCut";
	public static final String SP_Field_Clean_Time = "sp_f_c_t";
	public static final String SP_Field_CpuCool_Time = "sp_f_cc_t";
	public static final String SP_Field_load_Time = "sp_f_l_t";
    public static final String SP_Field_Launch_Apps = "canlaunchapps";
    public static final String SP_Field_Save_Launch_Apps_Time = "sp_save_lat";
    public static final String SP_Field_Save_System_Apps = "sp_save_sa";

	public static final String SystemMem="SystemMem";
	public static final String Extra_Call_From_External = "extra_c_f_ex";
	public static final String Extra_Title_Res_String_Id = "extra_t_r_s_i";
	
	public static final String Privacy_Url = "http://privacy.smartcleaner.mobi";
	
	public static final int MinScreenHeightToShowCharger = 780; // mini screen height to show battery charger
}
