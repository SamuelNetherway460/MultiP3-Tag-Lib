package Factories;

import Exceptions.HeaderNotFoundException;
import FileTypes.MP3;
import TagStructures.ID3v2Frame;
import TagStructures.ID3v2Header;
import TagTypes.ID3v2;
import TagTypes.ID3v22;
import TagTypes.ID3v23;

import java.util.ArrayList;
import java.util.Arrays;

import static Factories.ID3v2FrameFactory.extractFrames;
import static Factories.ID3v2HeaderFactory.HEADER_LENGTH;

//TODO - JavaDoc
//TODO - Make exclusive frames and methods private
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v23Factory extends ID3v2Factory {

    protected static final String META_AUDIO_ENCRYPTION = "AENC";
    protected static final String META_ATTACHED_PICTURE = "APIC";
    protected static final String META_COMMENTS = "COMM";
    protected static final String META_COMMERCIAL = "COMR";
    protected static final String META_ENCRYPTION_METHOD_REGISTRATION = "ENCR";
    protected static final String META_EQUALIZATION = "EQUA";
    protected static final String META_EVENT_TIMING_CODES = "ETCO";
    protected static final String META_GENERAL_ENCAPSULATED_OBJECT = "GEOB";
    protected static final String META_GROUP_IDENTIFICATION_REGISTRATION = "GRID";
    protected static final String META_INVOLVED_PEOPLE_LIST = "IPLS";
    protected static final String META_LINKED_INFORMATION = "LINK";
    protected static final String META_MUSIC_CD_IDENTIFIER = "MCDI";
    protected static final String META_MPEG_LOCATION_LOOKUP_TABLE = "MLLT";
    protected static final String META_OWNERSHIP = "OWNE";
    protected static final String META_PLAY_COUNTER = "PCNT";
    protected static final String META_POPULARIMETER = "POPM";
    protected static final String META_POSITION_SYNCHRONISATION = "POSS";
    protected static final String META_PRIVATE = "PRIV";
    protected static final String META_RECOMMENDED_BUFFER_SIZE = "RBUF";
    protected static final String META_RELATIVE_VOLUME_ADJUSTMENT = "RVAD";
    protected static final String META_REVERB = "RVRB";
    protected static final String META_SYNCHRONIZED_LYRIC_TEXT = "SYLT";
    protected static final String META_SYNCHRONIZED_TEMPO_CODES = "SYTC";
    protected static final String META_ALBUM_MOVIE_SHOW_TITLE = "TALB";
    protected static final String META_BEATS_PER_MINUTE = "TBPM";
    protected static final String META_COMPOSER = "TCOM";
    protected static final String META_CONTENT_TYPE = "TCON";
    protected static final String META_COPYRIGHT_MESSAGE = "TCOP";
    protected static final String META_DATE = "TDAT";
    protected static final String META_PLAYLIST_DELAY = "TDLY";
    protected static final String META_ENCODED_BY = "TENC";
    protected static final String META_LYRICIST_TEXT_WRITER = "TEXT";
    protected static final String META_FILE_TYPE = "TFLT";
    protected static final String META_TIME = "TIME";
    protected static final String META_CONTENT_GROUP_DESCRIPTION = "TIT1";
    protected static final String META_TITLE_SONG_NAME_CONTENT_DESCRIPTION = "TIT2";
    protected static final String META_SUBTITLE_DESCRIPTION_REFINEMENT = "TIT3";
    protected static final String META_INITIAL_KEY = "TKEY";
    protected static final String META_LANGUAGE = "TLAN";
    protected static final String META_LENGTH = "TLEN";
    protected static final String META_MEDIA_TYPE = "TMED";
    protected static final String META_ORIGINAL_ALBUM_MOVIE_SHOW_TITLE = "TOAL";
    protected static final String META_ORIGINAL_FILENAME = "TOFN";
    protected static final String META_ORIGINAL_LYRICISTS_TEXT_WRITERS = "TOLY";
    protected static final String META_ORIGINAL_ARTISTS_PERFORMERS = "TOPE";
    protected static final String META_ORIGINAL_RELEASE_YEAR = "TORY";
    protected static final String META_FILE_OWNER_LICENCE = "TOWN";
    protected static final String META_LEAD_PERFORMERS_SOLOISTS = "TPE1";
    protected static final String META_BAND_ORCHESTRA_ACCOMPANIMENT = "TPE2";
    protected static final String META_CONDUCTOR_PERFORMER_REFINEMENT = "TPE3";
    protected static final String META_INTERPRETED_REMIXED_OR_OTHERWISE_MODIFIED_BY = "TPE4";
    protected static final String META_PART_OF_A_SET = "TPOS";
    protected static final String META_PUBLISHER = "TPUB";
    protected static final String META_TRACK_NUMBER_POSITION_IN_SET = "TRCK";
    protected static final String META_RECORDING_DATES = "TRDA";
    protected static final String META_INTERNET_RADIO_STATION_NAME = "TRSN";
    protected static final String META_INTERNET_RADIO_STATION_OWNER = "TRSO";
    protected static final String META_SIZE = "TSIZ";
    protected static final String META_INTERNATIONAL_STANDARD_RECORDING_CODE = "TSRC";
    protected static final String META_SOFTWARE_HARDWARE_AND_SETTINGS_USED_FOR_ENCODING = "TSSE";
    protected static final String META_USER_DEFINED_TEXT_INFORMATION = "TXXX";
    protected static final String META_YEAR = "TYER";
    protected static final String META_UNIQUE_FILE_IDENTIFIER = "UFID";
    protected static final String META_TERMS_OF_USE = "USER";
    protected static final String META_UNSYNCHRONIZED_LYRIC_TEXT_TRANSCRIPTION = "USLT";
    protected static final String META_COMMERCIAL_INFORMATION = "WCOM";
    protected static final String META_COPYRIGHT_LEGAL_INFORMATION = "WCOP";
    protected static final String META_OFFICIAL_AUDIO_WEBPAGE = "WOAF";
    protected static final String META_OFFICIAL_ARTIST_PERFORMER_WEBPAGE = "WOAR";
    protected static final String META_OFFICIAL_AUDIO_SOURCE_WEBPAGE = "WOAS";
    protected static final String META_OFFICIAL_INTERNET_RADIO_STATION_HOMEPAGE = "WORS";
    protected static final String META_PAYMENT = "WPAY";
    protected static final String META_PUBLISHERS_OFFICIAL_WEBPAGE = "WPUB";
    protected static final String META_USER_DEFINED_URL_LINK = "WXXX";

    public static ID3v23 extractTag(MP3 mp3) {
        ID3v2Header header = null;
        try {
            header = ID3v2HeaderFactory.extractHeader(mp3);
        } catch (HeaderNotFoundException hnfe) {
            hnfe.printStackTrace(); // TODO Handle correctly
        }

        ID3v23 tag = new ID3v23();
        tag.setBytes(Arrays.copyOfRange(mp3.getBytes(), header.getPositionInFile(),
            header.getPositionInFile() + header.getTagSize()));

        if (header.hasExtendedHeader()) {

        } else {
            tag.setFrameBytes(Arrays.copyOfRange(tag.getBytes(), HEADER_LENGTH, header.getTagSize()));
        }
        tag.setHeader(header);

        ArrayList<ID3v2Frame> frames = extractFrames(header, tag.getFrameBytes());

        return tag;
    }
}
