package Factories;

import Exceptions.InvalidFrameException;
import TagStructures.ID3v22Frame;
import TagStructures.ID3v2Frame;
import TagTypes.ID3v22;
import Utilities.BufferUtilities;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

import static Utilities.BufferUtilities.*;
import static Utilities.BufferUtilities.convertBytesToString;

public class ID3v22FrameFactory extends ID3v2FrameFactory {

    public static final String RECOMMENDED_BUFFER_SIZE = "BUF";
    public static final String PLAY_COUNTER = "CNT";
    public static final String COMMENTS = "COM";
    public static final String AUDIO_ENCRYPTION = "CRA";
    public static final String ENCRYPTED_META = "CRM";
    public static final String EVENT_TIMING_CODES = "ETC";
    public static final String EQUALIZATION = "EQU";
    public static final String GENERAL_ENCAPSULATED_OBJECT = "GEO";
    public static final String INVOLVED_PEOPLE_LIST = "IPL";
    public static final String LINKED_INFORMATION = "LNK";
    public static final String MUSIC_CD_IDENTIFIER = "MCI";
    public static final String MPEG_LOCATION_LOOKUP_TABLE = "MLL";
    public static final String ATTACHED_PICTURE = "PIC";
    public static final String POPULARIMETER = "POP";
    public static final String REVERB = "REV";
    public static final String RELATIVE_VOLUME_ADJUSTMENT = "RVA";
    public static final String SYNCHRONIZED_LYRIC_TEXT = "SLT";
    public static final String SYNCHED_TEMPO_CODES = "STC";
    public static final String ALBUM_MOVIE_SHOW_TITLE = "TAL";
    public static final String BEATS_PER_MINUTE = "TBP";
    public static final String COMPOSER = "TCM";
    public static final String CONTENT_TYPE = "TCO";
    public static final String COPYRIGHT_MESSAGE = "TCR";
    public static final String DATE = "TDA";
    public static final String PLAYLIST_DELAY = "TDY";
    public static final String ENCODED_BY = "TEN";
    public static final String FILE_TYPE = "TFT";
    public static final String TIME = "TIM";
    public static final String INITIAL_KEY = "TKE";
    public static final String LANGUAGES = "TLA";
    public static final String LENGTH = "TLE";
    public static final String MEDIA_TYPE = "TMT";
    public static final String ORIGINAL_ARTISTS_PERFORMERS = "TOA";
    public static final String ORIGINAL_FILENAME = "TOF";
    public static final String ORIGINAL_LYRICISTS_TEXT_WRITERS = "TOL";
    public static final String ORIGINAL_RELEASE_YEAR = "TOR";
    public static final String ORIGINAL_ALBUM_MOVIE_SHOW_TITLE = "TOT";
    public static final String LEAD_ARTISTS_LEAD_PERFORMERS_SOLOISTS_PERFORMING_GROUP = "TP1";
    public static final String BAND_ORCHESTRA_ACCOMPANIMENT = "TP2";
    public static final String CONDUCTOR_PERFORMER_REFINEMENT = "TP3";
    public static final String INTERPRETED_REMIXED_OR_OTHERWISE_MODIFIED_BY = "TP4";
    public static final String PART_OF_A_SET = "TPA";
    public static final String PUBLISHER = "TPB";
    public static final String INTERNATIONAL_STANDARD_RECORDING_CODE = "TRC";
    public static final String RECORDING_DATES = "TRD";
    public static final String TRACK_NUMBER_POSITION_IN_SET = "TRK";
    public static final String SIZE = "TSI";
    public static final String SOFTWARE_HARDWARE_AND_SETTINGS_USED_FOR_ENCODING = "TSS";
    public static final String CONTENT_GROUP_DESCRIPTION = "TT1";
    public static final String TITLE_SONG_NAME_CONTENT_DESCRIPTION = "TT2";
    public static final String SUBTITLE_DESCRIPTION_REFINEMENT = "TT3";
    public static final String LYRICIST_TEXT_WRITER = "TXT";
    public static final String USER_DEFINED_TEXT_INFORMATION_FRAME = "TXX";
    public static final String YEAR = "TYE";
    public static final String UNIQUE_FILE_IDENTIFIER = "UFI";
    public static final String UNSYNCHRONIZED_LYRIC_TEXT_TRANSCRIPTION = "ULT";
    public static final String OFFICIAL_AUDIO_FILE_WEBPAGE = "WAF";
    public static final String OFFICIAL_ARTIST_PERFORMER_WEBPAGE = "WAR";
    public static final String OFFICIAL_AUDIO_SOURCE_WEBPAGE = "WAS";
    public static final String COMMERCIAL_INFORMATION = "WCM";
    public static final String COPYRIGHT_LEGAL_INFORMATION = "WCP";
    public static final String PUBLISHERS_OFFICIAL_WEBPAGE = "WPB";
    public static final String USER_DEFINED_URL_LINK_FRAME = "WXX";

    private static final int SIZE_START = 3;
    private static final int SIZE_START_1 = 3;
    private static final int SIZE_START_2 = 4;
    private static final int SIZE_START_3 = 5;
    private static final int HEADER_LENGTH = 6;
    private static final int ID_LENGTH = 3;
    private static final int TEXT_INFORMATION_CHARSET_START = 0;
    private static final int ISO_8859_1 = 0;
    private static final int UTF_16 = 1;

    /**
     * Reads textual frame data.
     *
     * @param id3v22Frame The textual ID3v22Frame object.
     * @return The text embedded in the frame.
     */
    public static String readTextFrame(ID3v22Frame id3v22Frame) {
        String text = "";
        int encoding = 0;
        try {
            encoding = convertByteToInt(id3v22Frame.getFrameData()[TEXT_INFORMATION_CHARSET_START]);
        } catch (UnsupportedEncodingException uee) {
            uee.printStackTrace();
        }

        try {
            if (encoding == ISO_8859_1) text = convertBytesToString(id3v22Frame.getFrameData(), 1, id3v22Frame.getFrameData().length - 2, StandardCharsets.ISO_8859_1.name());
            if (encoding == UTF_16) text = convertBytesToString(id3v22Frame.getFrameData(), 1, id3v22Frame.getFrameData().length - 2, StandardCharsets.UTF_16.name());
        } catch (UnsupportedEncodingException uee) {
            uee.printStackTrace();
        }

        return text;
    }

    public static void writeTextFrame(ID3v22 tag, String id, String value) {
        int newTagSize = tag.getHeader().getTagSize();
        ID3v22Frame frame = findFrame(tag.getFrames(), id);

        if (frame != null) {
            newTagSize -= frame.getFrameSize();
        }
        tag.getFrames().remove(frame);
        byte charset = ((Integer) ISO_8859_1).byteValue();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(charset);
            outputStream.write(value.getBytes(StandardCharsets.ISO_8859_1));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        ID3v22Frame replacementFrame = new ID3v22Frame(id, outputStream.toByteArray());
        tag.getFrames().add(replacementFrame);

        newTagSize += replacementFrame.getFrameSize();
        tag.getHeader().setTagSize(newTagSize);
    }

    public static void writeTextFrame(ID3v22 tag, String id, int value) {
        int newTagSize = tag.getHeader().getTagSize();
        ID3v22Frame frame = findFrame(tag.getFrames(), id);
        if (frame != null) {
            newTagSize -= frame.getFrameSize();
        }
        tag.getFrames().remove(frame);
        byte charset = ((Integer) ISO_8859_1).byteValue();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(charset);
            outputStream.write(Integer.toString(value).getBytes(StandardCharsets.ISO_8859_1));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        ID3v22Frame replacementFrame = new ID3v22Frame(id, outputStream.toByteArray());
        tag.getFrames().add(0, replacementFrame);

        newTagSize += replacementFrame.getFrameSize();
        tag.getHeader().setTagSize(newTagSize);
    }

    private static ID3v22Frame findFrame(ArrayList<ID3v22Frame> frames, String id) {
        for (ID3v22Frame f : frames) {
            if (f.getId().equals(id)) return f;
        }
        return null;
    }

    /**
     * Extracts a single frame and populates a ID3v2.3 frame object with basic frame data.
     *
     * @param frameBytes The a single frame as an array of bytes.
     * @throws InvalidFrameException If the ID is invalid.
     * @return A ID3v22 frame populated with data.
     */
    public static ID3v22Frame extractFrameMetadata(byte[] frameBytes) throws InvalidFrameException {
        ID3v22Frame id3v22Frame = new ID3v22Frame();
        id3v22Frame.setFrame(frameBytes);

        id3v22Frame.setId(extractFrameID(frameBytes));
        id3v22Frame.setDataSize(extractFrameSize(frameBytes));
        id3v22Frame.setFrameSize(id3v22Frame.getDataSize() + HEADER_LENGTH);
        id3v22Frame.setFrameData(Arrays.copyOfRange(frameBytes, HEADER_LENGTH, id3v22Frame.getFrameSize()));

        return id3v22Frame;
    }

    /**
     * Extracts the frame id for a particular ID3v2 frame.
     *
     * @param frameData The data for a single frame as an array of bytes.
     * @throws InvalidFrameException If the ID is invalid.
     */
    private static String extractFrameID(byte[] frameData) throws InvalidFrameException {
        String id = null;
        try {
            id = BufferUtilities.convertBytesToString(frameData, ID_START, ID_LENGTH, "ISO-8859-1");
        } catch (UnsupportedEncodingException uee) {
            uee.printStackTrace();
        }

        if (!isFrameIDValid(id)) throw new InvalidFrameException("[INVALID FRAME EXCEPTION] The frame ID " + id
            + " does not correspond to an appropriate frame.");

        return id;
    }

    /**
     * Extracts the size of the ID3v22 frame.
     *
     * @param frameBytes The single frame as an array of bytes.
     */
    private static int extractFrameSize(byte[] frameBytes) {
        int size = unpackInteger(
            (byte) 0,
            frameBytes[SIZE_START_1],
            frameBytes[SIZE_START_2],
            frameBytes[SIZE_START_3]);
        return size;
    }
}
