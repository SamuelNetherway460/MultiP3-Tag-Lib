package Factories;

import FileTypes.MP3;
import TagTypes.ID3v1;
import TagTypes.ID3v23;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v23Factory {

    private static final String META_AUDIO_ENCRYPTION = "AENC";
    private static final String META_ATTACHED_PICTURE = "APIC";
    private static final String META_COMMENTS = "COMM";
    private static final String META_COMMERCIAL = "COMR";
    private static final String META_ENCRYPTION_METHOD_REGISTRATION = "ENCR";
    private static final String META_EQUALIZATION = "EQUA";
    private static final String META_EVENT_TIMING_CODES = "ETCO";
    private static final String META_GENERAL_ENCAPSULATED_OBJECT = "GEOB";
    private static final String META_GROUP_IDENTIFICATION_REGISTRATION = "GRID";
    private static final String META_INVOLVED_PEOPLE_LIST = "IPLS";
    private static final String META_LINKED_INFORMATION = "LINK";
    private static final String META_MUSIC_CD_IDENTIFIER = "MCDI";
    private static final String META_MPEG_LOCATION_LOOKUP_TABLE = "MLLT";
    private static final String META_OWERNERSHIPE = "OWNE";
    private static final String META_PLAY_COUNTER = "PCNT";
    private static final String META_POPULARIMETER = "POPM";
    private static final String META_POSITION_SYNCHRONISATION = "POSS";
    private static final String META_PRIVATE = "PRIV";
    private static final String META_RECOMENDED_BUFFER_SIZE = "RBUF";
    private static final String META_RELATIVE_VOLUME_ADJUSTMENT = "RVAD";
    private static final String META_REVERB = "RVRB";
    private static final String META_SYNCHRONIZED_LYRIC_TEXT = "SYLT";
    private static final String META_SYNCHRONIZED_TEMPO_CODES = "SYTC";
    private static final String META_ALBUM_MOVIE_SHOW_TITLE = "TALB";
    private static final String META_BEATS_PER_MINUTE = "TBPM";
    private static final String META_COMPOSER = "TCOM";
    private static final String META_CONTENT_TYPE = "TCON";
    private static final String META_COPYRIGHT_MESSAGE = "TCOP";
    private static final String META_DATE = "TDAT";
    private static final String META_PLAYLIST_DELAY = "TDLY";
    private static final String META_ENCODED_BY = "TENC";
    private static final String META_LYRICIST_TEXT_WRITER = "TEXT";
    private static final String META_FILE_TYPE = "TFLT";
    private static final String META_TIME = "TIME";
    private static final String META_CONTENT_GROUP_DESCRIPTION = "TIT1";
    private static final String META_TITLE_SONG_NAME_CONTENT_DESCRIPTION = "TIT2";
    private static final String META_SUBTITLE_DESCRIPTION_REFINEMENT = "TIT3";
    private static final String META_INITIAL_KEY = "TKEY";
    private static final String META_LANGUAGE = "TLAN";
    private static final String META_LENGTH = "TLEN";
    private static final String META_MEDIA_TYPE = "TMED";
    private static final String META_ORIGINAL_ALBUM_MOVIE_SHOW_TITLE = "TOAL";
    private static final String META_ORIGINAL_FILENAME = "TOFN";
    private static final String META_ORIGINAL_LYRICISTS_TEXT_WRITERS = "TOLY";
    private static final String META_ORIGINAL_ARTISTS_PERFORMERS = "TOPE";
    private static final String META_ORIGINAL_RELEASE_YEAR = "TORY";
    private static final String META_FILE_OWNER_LICENCE = "TOWN";
    private static final String META_LEAD_PERFORMERS_SOLOISTS = "TPE1";
    private static final String META_BAND_ORCHESTRA_ACCOMPANIMENT = "TPE2";
    private static final String META_CONDUCTOR_PERFORMER_REFINEMENT = "TPE3";
    private static final String META_INTERPRETED_REMIXED_OR_OTHERWISE_MODIFIED_BY = "TPE4";
    private static final String META_PART_OF_A_SET = "TPOS";
    private static final String META_PUBLISHER = "TPUB";
    private static final String META_TRACK_NUMBER_POSITION_IN_SET = "TRCK";
    private static final String META_RECORDING_DATES = "TRDA";
    private static final String META_INTERNET_RADIO_STATION_NAME = "TRSN";
    private static final String META_INTERNET_RADIO_STATION_OWNER = "TRSO";
    private static final String META_SIZE = "TSIZ";
    private static final String META_INTERNATIONAL_STANDARD_RECORDING_CODE = "TSRC";
    private static final String META_SOFTWARE_HARDWARE_AND_SETTINGS_USED_FOR_ENCODING = "TSSE";
    private static final String META_USER_DEFINED_TEXT_INFORMATION = "TXXX";
    private static final String META_YEAR = "TYER";
    private static final String META_UNIQUE_FILE_IDENTIFIER = "UFID";
    private static final String META_TERMS_OF_USE = "USER";
    private static final String META_UNSYNCHRONIZED_LYRIC_TEXT_TRANSCRIPTION = "USLT";
    private static final String META_COMMERCIAL_INFORMATION = "WCOM";
    private static final String META_COPYRIGHT_LEGAL_INFORMATION = "WCOP";
    private static final String META_OFFICIAL_AUDIO_WEBPAGE = "WOAF";
    private static final String META_OFFICIAL_ARTIST_PERFORMER_WEBPAGE = "WOAR";
    private static final String META_OFFICIAL_AUDIO_SOURCE_WEBPAGE = "WOAS";
    private static final String META_OFFICIAL_INTERNET_RADIO_STATION_HOMEPAGE = "WORS";
    private static final String META_PAYMENT = "WPAY";
    private static final String META_PUBLISHERS_OFFICIAL_WEBPAGE = "WPUB";
    private static final String META_USER_DEFINED_URL_LINK = "WXXX";

    public static ID3v23 createTag(MP3 mp3) {
        return new ID3v23(mp3);
    }
}
