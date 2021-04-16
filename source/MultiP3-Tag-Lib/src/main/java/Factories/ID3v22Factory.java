package Factories;

import FileTypes.MP3;
import TagTypes.ID3v22;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v22Factory {

    private static final String META_RECOMMENDED_BUFFER_SIZE = "BUF";
    private static final String META_PLAY_COUNTER = "CNT";
    private static final String META_COMMENTS = "COM";
    private static final String META_AUDIO_ENCRYPTION = "CRA";
    private static final String META_ENCRYPTED_META = "CRM";
    private static final String META_EVENT_TIMING_CODES = "ETC";
    private static final String META_EQUALIZATION = "EQU";
    private static final String META_GENERAL_ENCAPSULATED_OBJECT = "GEO";
    private static final String META_INVOLVED_PEOPLE_LIST = "IPL";
    private static final String META_LINKED_INFORMATION = "LNK";
    private static final String META_MUSIC_CD_IDENTIFIER = "MCI";
    private static final String META_MPEG_LOCATION_LOOKUP_TABLE = "MLL";
    private static final String META_ATTACHED_PICTURE = "PIC";
    private static final String META_POPULARIMETER = "POP";
    private static final String META_REVERB = "REV";
    private static final String META_RELATIVE_VOLUME_ADJUSTMENT = "RVA";
    private static final String META_SYNCHRONIZED_LYRIC_TEXT = "SLT";
    private static final String META_SYNCHED_TEMPO_CODES = "STC";
    private static final String META_ALBUM_MOVIE_SHOW_TITLE = "TAL";
    private static final String META_BEATS_PER_MINUTE = "TBP";
    private static final String META_COMPOSER = "TCM";
    private static final String META_CONTENT_TYPE = "TCO";
    private static final String META_COPYRIGHT_MESSAGE = "TCR";
    private static final String META_DATE = "TDA";
    private static final String META_PLAYLIST_DELAY = "TDY";
    private static final String META_ENCODED_BY = "TEN";
    private static final String META_FILE_TYPE = "TFT";
    private static final String META_TIME = "TIM";
    private static final String META_INITIAL_KEY = "TKE";
    private static final String META_LANGUAGES = "TLA";
    private static final String META_LENGTH = "TLE";
    private static final String META_MEDIA_TYPE = "TMT";
    private static final String META_ORIGINAL_ARTISTS_PERFORMERS = "TOA";
    private static final String META_ORIGINAL_FILENAME = "TOF";
    private static final String META_ORIGINAL_LYRICISTS_TEXT_WRITERS = "TOL";
    private static final String META_ORIGINAL_RELEASE_YEAR = "TOR";
    private static final String META_ORIGINAL_ALBUM_MOVIE_SHOW_TITLE = "TOT";
    private static final String META_LEAD_ARTISTS_LEAD_PERFORMERS_SOLOISTS_PERFORMING_GROUP = "TP1";
    private static final String META_BAND_ORCHESTRA_ACCOMPANIMENT = "TP2";
    private static final String META_CONDUCTOR_PERFORMER_REFINEMENT = "TP3";
    private static final String META_INTERPRETED_REMIXED_OR_OTHERWISE_MODIFIED_BY = "TP4";
    private static final String META_PART_OF_A_SET = "TPA";
    private static final String META_PUBLISHER = "TPB";
    private static final String META_INTERNATIONAL_STANDARD_RECORDING_CODE = "TRC";
    private static final String META_RECORDING_DATES = "TRD";
    private static final String META_TRACK_NUMBER_POSITION_IN_SET = "TRK";
    private static final String META_SIZE = "TSI";
    private static final String META_SOFTWARE_HARDWARE_AND_SETTINGS_USED_FOR_ENCODING = "TSS";
    private static final String META_CONTENT_GROUP_DESCRIPTION = "TT1";
    private static final String META_TITLE_SONGNAME_CONTENT_DESCRIPTION = "TT2";
    private static final String META_SUBTITLE_DESCRIPTION_REFINEMENT = "TT3";
    private static final String META_LYRICIST_TEXT_WRITER = "TXT";
    private static final String META_USER_DEFINED_TEXT_INFORMATION_FRAME = "TXX";
    private static final String META_YEAR = "TYE";
    private static final String META_UNIQUE_FILE_IDENTIFIER = "UFI";
    private static final String META_UNSYNCHRONIZED_LYRIC_TEXT_TRANSCRIPTION = "ULT";
    private static final String META_OFFICIAL_AUDIO_FILE_WEBPAGE = "WAF";
    private static final String META_OFFICIAL_ARTIST_PERFORMER_WEBPAGE = "WAR";
    private static final String META_OFFICIAL_AUDIO_SOURCE_WEBPAGE = "WAS";
    private static final String META_COMMERCIAL_INFORMATION = "WCM";
    private static final String META_COPYRIGHT_LEGAL_INFORMATION = "WCP";
    private static final String META_PUBLISHERS_OFFICIAL_WEBPAGE = "WPB";
    private static final String META_USER_DEFINED_URL_LINK_FRAME = "WXX";

    public static ID3v22 createTag(MP3 mp3) {
        return populateFrames(new ID3v22(mp3));
    }

    //TODO Implement
    public static ID3v22 populateFrames(ID3v22 tag) {
        byte[] data = tag.getBytes();


        return tag;
    }
}
