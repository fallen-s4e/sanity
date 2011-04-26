package cri.sanity;

import java.util.HashMap;
import java.util.Map;
import android.media.AudioManager;
import cri.sanity.util.*;


// tool class: all preference keys; the default values; the upgrade phase.
public final class K
{
	// general
	public static final String ENABLED            = "enabled";
	public static final String SILENT_LIMIT       = "silent_limit";
	public static final String AIRPLANE_LIMIT     = "airplane_limit";
	public static final String FORCE_BT_AUDIO     = "force_bt_audio";
	public static final String REVERSE_PROXIMITY  = "reverse_proximity";
	public static final String PWD                = "pwd";
	public static final String PWD_CLEAR          = "pwd_clear";
	// devices
	public static final String AUTO_MOBDATA       = "mobdata";
	public static final String AUTO_WIFI          = "wifi";
	public static final String AUTO_GPS           = "gps";
	public static final String AUTO_BT            = "bt";
	public static final String SKIP_BT            = "bt_skip";
	public static final String SKIP_MOBDATA       = "mobdata_skip";
	public static final String SKIP_HOTSPOT       = "hotspot_skip";
	public static final String SKIP_TETHER        = "tether_skip";
	public static final String REVERSE_BT         = "bt_reverse";
	public static final String REVERSE_BT_TIMEOUT = "bt_reverse_timeout";
	public static final String BT_OFF             = "bt_off";
	// proximity
	public static final String DISABLE_PROXIMITY  = "disable_proximity";
	public static final String DISABLE_DELAY      = "disable_delay";
	public static final String ENABLE_PROXIMITY   = "enable_proximity";
	public static final String ENABLE_DELAY       = "enable_delay";
	public static final String SCREEN_OFF         = "screen_off";
	public static final String SCREEN_ON          = "screen_on";
	// speaker
	public static final String SPEAKER_AUTO       = "auto_speaker";
	public static final String SPEAKER_DELAY      = "delay_speaker";
	public static final String SPEAKER_CALL       = "speaker_call";
	public static final String SPEAKER_CALL_DELAY = "delay_speaker_call";
	public static final String SPEAKER_VOL        = "vol_speaker";
	public static final String SPEAKER_SILENT_END = "silent_end_speaker";
	public static final String SPEAKER_ON_COUNT   = "speaker_on_count";
	public static final String SPEAKER_OFF_COUNT  = "speaker_off_count";
	// volume
	public static final String VOL_PHONE          = "vol_phone";
	public static final String VOL_WIRED          = "vol_wired";
	public static final String VOL_BT             = "vol_bt";
	public static final String VOL_SOLO           = "vol_solo";
	// notification
	public static final String NOTIFY_TIMEOUT     = "notify_timeout";
	public static final String NOTIFY_ENABLE      = "notify_enable";
	public static final String NOTIFY_DISABLE     = "notify_disable";
	public static final String NOTIFY_ACTIVITY    = "notify_activity";
	public static final String NOTIFY_VOLUME      = "notify_volume";
	public static final String NOTIFY_HEADSET     = "notify_headset";
	public static final String NOTIFY_REC_STOP    = "notify_rec_stop";
	public static final String VIBRATE_END        = "vibrate_end";
	// call recorder
	public static final String REC                = "rec";
	public static final String REC_FMT            = "rec_fmt";
	public static final String REC_SRC            = "rec_src";
	public static final String REC_START          = "rec_start";
	public static final String REC_STOP           = "rec_stop";
	public static final String REC_START_DELAY    = "rec_start_delay";
	public static final String REC_STOP_DELAY     = "rec_stop_delay";
	public static final String REC_START_SPEAKER  = "rec_start_speaker";
	public static final String REC_STOP_SPEAKER   = "rec_stop_speaker";
	public static final String REC_START_HEADSET  = "rec_start_headset";
	public static final String REC_STOP_HEADSET   = "rec_stop_headset";
	public static final String REC_START_TIMES    = "rec_start_times";
	public static final String REC_STOP_LIMIT     = "rec_stop_limit";
	public static final String REC_START_DIR      = "rec_start_dir";
	public static final String REC_AUTOREMOVE     = "rec_autoremove";
	public static final String REC_CALLSCREEN     = "rec_callscreen";
	public static final String REC_FILTER         = "filter_enable_rec";
	// call blocker
	public static final String BLOCK_FILTER       = "filter_enable_block";
	public static final String BLOCK_MODE         = "block_mode";
	public static final String BLOCK_RESUME       = "block_resume";
	public static final String BLOCK_PICKUP       = "block_pickup";
	public static final String BLOCK_SKIP         = "block_skip";
	public static final String BLOCK_NOTIFY       = "block_notify";
	public static final String BLOCK_SMS          = "blocksms";
	public static final String BLOCK_SMS_MAX      = "blocksms_max";
	public static final String BLOCK_SMS_NOTIFY   = "blocksms_notify";
	public static final String BLOCK_SMS_FILTER   = "filter_enable_blocksms";
	// announce caller (text to speech)
	public static final String TTS                = "tts";
	public static final String TTS_HEADSET        = "tts_headset";
	public static final String TTS_SKIP           = "tts_skip";
	public static final String TTS_SOLO           = "tts_solo";
	public static final String TTS_VOL            = "tts_vol";
	public static final String TTS_TONE           = "tts_tone";
	public static final String TTS_REPEAT         = "tts_repeat";
	public static final String TTS_PAUSE          = "tts_pause";
	public static final String TTS_ANONYM         = "tts_anonym";
	public static final String TTS_UNKNOWN        = "tts_unknown";
	public static final String TTS_PREFIX         = "tts_prefix";
	public static final String TTS_SUFFIX         = "tts_suffix";
	public static final String TTS_STREAM         = "tts_stream";
	public static final String TTS_FILTER         = "filter_enable_tts";
	public static final String TTS_SMS            = "ttsms";
	public static final String TTS_SMS_PREFIX     = "ttsms_prefix";
	public static final String TTS_SMS_SUFFIX     = "ttsms_suffix";
	public static final String TTS_SMS_FILTER     = "filter_enable_ttsms";
	// urgent calls
	public static final String URGENT_FILTER      = "filter_enable_urgent";
	public static final String URGENT_SKIP        = "urgent_skip";
	public static final String URGENT_MODE        = "urgent_mode";
	// auto answer
	public static final String ANSWER             = "answer";
	public static final String ANSWER_HEADSET     = "answer_headset";
	public static final String ANSWER_SKIP        = "answer_skip";
	public static final String ANSWER_DELAY       = "answer_delay";
	public static final String ANSWER_FILTER      = "filter_enable_answer";
	// anonymous calls
	public static final String ANONYM             = "anonym";
	public static final String ANONYM_CONFIRM     = "anonym_confirm";
	public static final String ANONYM_NOTIFY      = "anonym_notify";
	public static final String ANONYM_PREFIX      = "anonym_prefix";
	public static final String ANONYM_FILTER      = "filter_enable_anonym";

	// internals (hidden to user)
	public static final String FULL      = "full";
	public static final String BETA      = "beta";
	public static final String AGREE     = "agree";
	public static final String VER       = "ver";
	public static final String LICVER    = "licver";
	public static final String NAG       = "nag";
	public static final String BT_COUNT  = "bt_count";
	public static final String PRF_NAME  = "prf_name";
	public static final String CRON      = "cron";
	public static final String SMS_COUNT = "sms_count";

	public static final String WS = "_s";		// wrap suffix for string values of integer keys

	//--- methods: only class P should call these methods!

	static final Map<String,Object> getDefaults() {
		final Map<String,Object> m = new HashMap<String,Object>();
		// all preferences default values
		m.put(ENABLED            , true);				// main
		m.put(SILENT_LIMIT       , false);
		m.put(AIRPLANE_LIMIT     , false);
		m.put(FORCE_BT_AUDIO     , false);
		m.put(REVERSE_PROXIMITY  , false);
		m.put(PWD                , "");
		m.put(PWD_CLEAR          , false);
		m.put(AUTO_MOBDATA       , false);			// devices
		m.put(AUTO_WIFI          , false);
		m.put(AUTO_BT            , false);
		m.put(AUTO_GPS           , false);
		m.put(SKIP_BT            , true);
		m.put(SKIP_MOBDATA       , false);
		m.put(SKIP_HOTSPOT       , true);
		m.put(SKIP_TETHER        , true);
		m.put(REVERSE_BT         , false);
		m.put(REVERSE_BT_TIMEOUT , 30*1000);
		m.put(BT_OFF             , false);
		m.put(DISABLE_PROXIMITY  , false);			// proximity
		m.put(DISABLE_DELAY      , 2000);
		m.put(ENABLE_DELAY       , 4000);
		m.put(ENABLE_PROXIMITY   , false);
		m.put(SCREEN_OFF         , true);
		m.put(SCREEN_ON          , true);
		m.put(SPEAKER_AUTO       , false);			// speaker
		m.put(SPEAKER_DELAY      , 1000);
		m.put(SPEAKER_CALL       ,  0);
		m.put(SPEAKER_CALL_DELAY ,  0);
		m.put(SPEAKER_VOL        , -1);
		m.put(SPEAKER_SILENT_END , true);
		m.put(SPEAKER_ON_COUNT   ,  0);
		m.put(SPEAKER_OFF_COUNT  ,  0);
		m.put(VOL_PHONE          , -1);					// volume
		m.put(VOL_WIRED          , -1);
		m.put(VOL_BT             , -1);
		m.put(VOL_SOLO           , false);
		m.put(NOTIFY_TIMEOUT     , true);				// notify
		m.put(NOTIFY_ENABLE      , true);
		m.put(NOTIFY_DISABLE     , true);
		m.put(NOTIFY_ACTIVITY    , true);
		m.put(NOTIFY_VOLUME      , false);
		m.put(NOTIFY_HEADSET     , false);
		m.put(NOTIFY_REC_STOP    , true);
		m.put(VIBRATE_END        , false);
		m.put(REC                , false);			// call recorder
		m.put(REC_SRC            , Rec.DEF_SRC);
		m.put(REC_FMT            , Rec.DEF_FMT);
		m.put(REC_START          , false);
		m.put(REC_STOP           , false);
		m.put(REC_START_DELAY    , 3000);
		m.put(REC_STOP_DELAY     , 3000);
		m.put(REC_START_SPEAKER  , true);
		m.put(REC_STOP_SPEAKER   , true);
		m.put(REC_START_HEADSET  , 0);
		m.put(REC_STOP_HEADSET   , 0);
		m.put(REC_STOP_LIMIT     , 0);
		m.put(REC_START_TIMES    , 0);
		m.put(REC_START_DIR      , 0);
		m.put(REC_AUTOREMOVE     , 0);
		m.put(REC_CALLSCREEN     , true);
		m.put(REC_FILTER         , false);
		m.put(BLOCK_FILTER       , false);			// call blocker
		m.put(BLOCK_MODE         , Blocker.MODE_RADIO);
		m.put(BLOCK_RESUME       , 0);
		m.put(BLOCK_PICKUP       , false);
		m.put(BLOCK_SKIP         , false);
		m.put(BLOCK_NOTIFY       , false);
		m.put(BLOCK_SMS          , false);
		m.put(BLOCK_SMS_MAX      , 10);
		m.put(BLOCK_SMS_NOTIFY   , false);
		m.put(BLOCK_SMS_FILTER   , false);
		m.put(TTS                , false);			// announce caller and SMS
		m.put(TTS_HEADSET        , false);
		m.put(TTS_SKIP           , true);
		m.put(TTS_SOLO           , false);
		m.put(TTS_VOL            , -1);
		m.put(TTS_TONE           ,  0);
		m.put(TTS_REPEAT         , 1000);
		m.put(TTS_PAUSE          , 1000);
		m.put(TTS_ANONYM         , A.s(R.string.anonymous));
		m.put(TTS_UNKNOWN        , A.s(R.string.unknown));
		m.put(TTS_PREFIX         , "");
		m.put(TTS_SUFFIX         , "");
		m.put(TTS_FILTER         , false);
		m.put(TTS_STREAM         , false);
		m.put(TTS_SMS            , false);
		m.put(TTS_SMS_PREFIX     , "");
		m.put(TTS_SMS_SUFFIX     , "");
		m.put(TTS_SMS_FILTER     , false);
		m.put(URGENT_FILTER      , false);			// urgent calls
		m.put(URGENT_SKIP        , true);
		m.put(URGENT_MODE        , AudioManager.RINGER_MODE_NORMAL);
		m.put(ANSWER             , false);			// auto answer
		m.put(ANSWER_HEADSET     , false);
		m.put(ANSWER_SKIP        , false);
		m.put(ANSWER_DELAY       , 7000);
		m.put(ANSWER_FILTER      , false);
		m.put(ANONYM             , false);			// anonymous calls
		m.put(ANONYM_CONFIRM     , false);
		m.put(ANONYM_NOTIFY      , false);
		m.put(ANONYM_PREFIX      , "#31#");
		m.put(ANONYM_FILTER      , false);
		return m;
	}

	// upgrade current preferences from an older existing version
	static final void upgrade(int oldVer) {
		if(oldVer < 19500) {
			for(String k : new String[]{ VOL_PHONE, VOL_WIRED, VOL_BT }) {
				try {
					switch(A.getsi(k)) {
						case 0: P.setDef(k); break;
						case 1: A.put(k, 0); break;
					}
				} catch(Exception e) { try {
					A.put(k, A.has(k)? A.geti(k) : -1);
				} catch(Exception e2) {
					A.put(k, -1);
				}}
			}
		}
		if(oldVer < 19600)
			A.put(SPEAKER_CALL, A.is(SPEAKER_CALL)? 3 : 0).del(SPEAKER_CALL);
		if(oldVer < 2.03f) {
			A.put(BLOCK_FILTER, A.is("block")).del("block");
			A.put(SPEAKER_VOL, A.is("loud_speaker")? A.audioMan().getStreamMaxVolume(AudioManager.STREAM_VOICE_CALL) : -1).del("loud_speaker");
		}
		if(oldVer>=20600 && oldVer<=20801) {
			final StringBuilder days = new StringBuilder(7);
			for(String sect : P.filterSections()) {
				sect = '_' + sect;
				days.setLength(0);
				for(int i=1; i<=7; i++) {
					final String d = Integer.toString(i);
					final String k = "filter_dt_day" + d + sect;
					if(A.is(k)) days.append(d);
					A.del(k);
				}
				final int n = days.length();
				if(n>0 && n<7) A.put("filter_dt_days"+sect, days.toString());
			}
		}
		if(oldVer < 20901) {
			A.del(K.VER).del("beta");
			for(String key : A.prefs().getAll().keySet())
				if(key.endsWith(K.WS) || (key.startsWith("filter_") && key.endsWith("null"))) A.del(key);
		}
	}

}
