package Factories;

import FileTypes.MP3;
import TagStructures.ID3v24Header;
import TagStructures.ID3v2Header;
import TagTypes.ID3v23;
import TagTypes.ID3v24;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v24Factory extends ID3v23Factory {

    private static final String META_AUDIO_SEEK_POINT_INDEX = "ASP1";
    private static final String META_SEEK = "SEEK";
    private static final String META_SIGNATURE = "SIGN";
    private static final String META_ENCODING_TIME = "TDEN";
    private static final String META_RECORDING_TIME = "TDRC";
    private static final String META_RELEASE_TIME = "TDRL";
    private static final String META_TAGGING_TIME = "TDTG";
    private static final String META_MUSICIAN_CREDITS_LIST = "TMCL";
    private static final String META_MOOD = "TMOO";
    private static final String META_PRODUCED_NOTICE = "TPRO";
    private static final String META_ALBUM_SORT_ORDER = "TSOA";
    private static final String META_PERFORMER_SORT_ORDER = "TSOP";
    private static final String META_TITLE_SORT_ORDER = "TSOT";
    private static final String META_SET_SUBTITLE = "TSST";
    private static final String META_EQUALIZATION = "EQU2";
    private static final String META_INVOLVED_PEOPLE_LIST = "TIPL";
    private static final String META_RELATIVE_VOLUME_ADJUSTMENT = "RVA2";
    private static final String META_DATE = "TDRC";
    private static final String META_TIME = "TDRC";
    private static final String META_ORIGINAL_RELEASE_YEAR = "TDOR";
    private static final String META_RECORDING_DATES = "TDRC";
    private static final String META_SIZE = ""; // Dropped from ID3v23
    private static final String META_YEAR = "TDRC";

    public static ID3v24 extractTag(MP3 mp3) {
        ID3v24 id3v24 = new ID3v24(mp3);
        id3v24.setHeader(extractHeader(id3v24));
        return id3v24;
    }

    public static ID3v24Header extractHeader(ID3v24 id3v24) {
        ID3v24Header header = new ID3v24Header(id3v24);
        return header;
    }
}