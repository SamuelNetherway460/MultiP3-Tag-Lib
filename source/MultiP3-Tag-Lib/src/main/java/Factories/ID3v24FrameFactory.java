package Factories;

import Exceptions.InvalidFrameException;
import TagStructures.ID3v24Frame;
import TagTypes.ID3v24;
import Utilities.BufferUtilities;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

import static Utilities.BufferUtilities.*;

public class ID3v24FrameFactory extends ID3v2FrameFactory {

    public static final String AUDIO_ENCRYPTION = "AENC";
    public static final String ATTACHED_PICTURE = "APIC";
    public static final String COMMENTS = "COMM";
    public static final String COMMERCIAL = "COMR";
    public static final String ENCRYPTION_METHOD_REGISTRATION = "ENCR";
    public static final String EVENT_TIMING_CODES = "ETCO";
    public static final String GENERAL_ENCAPSULATED_OBJECT = "GEOB";
    public static final String GROUP_IDENTIFICATION_REGISTRATION = "GRID";
    public static final String LINKED_INFORMATION = "LINK";
    public static final String MUSIC_CD_IDENTIFIER = "MCDI";
    public static final String MPEG_LOCATION_LOOKUP_TABLE = "MLLT";
    public static final String OWNERSHIP = "OWNE";
    public static final String PRIVATE = "PRIV";
    public static final String PLAY_COUNTER = "PCNT";
    public static final String POPULARIMETER = "POPM";
    public static final String POSITION_SYNCHRONISATION = "POSS";
    public static final String RECOMMENDED_BUFFER_SIZE = "RBUF";
    public static final String REVERB = "RVRB";
    public static final String SYNCHRONIZED_LYRIC_TEXT = "SYLT";
    public static final String SYNCHRONIZED_TEMPO_CODES = "SYTC";
    public static final String BEATS_PER_MINUTE = "TBPM";
    public static final String INITIAL_KEY = "TKEY";
    public static final String CONTENT_TYPE = "TCON";
    public static final String COPYRIGHT_MESSAGE = "TCOP";
    public static final String ENCODED_BY = "TENC";
    public static final String SOFTWARE_HARDWARE_AND_SETTINGS_USED_FOR_ENCODING = "TSSE";
    public static final String PLAYLIST_DELAY = "TDLY";
    public static final String CONTENT_GROUP_DESCRIPTION = "TIT1";
    public static final String TITLE_SONG_NAME_CONTENT_DESCRIPTION = "TIT2";
    public static final String SUBTITLE_DESCRIPTION_REFINEMENT = "TIT3";
    public static final String ALBUM_MOVIE_SHOW_TITLE = "TALB";
    public static final String LANGUAGE = "TLAN";
    public static final String LENGTH = "TLEN";
    public static final String FILE_TYPE = "TFLT";
    public static final String MEDIA_TYPE = "TMED";
    public static final String FILE_OWNER_LICENCE = "TOWN";
    public static final String LEAD_PERFORMERS_SOLOISTS = "TPE1";
    public static final String BAND_ORCHESTRA_ACCOMPANIMENT = "TPE2";
    public static final String CONDUCTOR_PERFORMER_REFINEMENT = "TPE3";
    public static final String INTERPRETED_REMIXED_OR_OTHERWISE_MODIFIED_BY = "TPE4";
    public static final String COMPOSER = "TCOM";
    public static final String LYRICIST_TEXT_WRITER = "TEXT";
    public static final String ORIGINAL_ALBUM_MOVIE_SHOW_TITLE = "TOAL";
    public static final String ORIGINAL_FILENAME = "TOFN";
    public static final String ORIGINAL_LYRICISTS_TEXT_WRITERS = "TOLY";
    public static final String ORIGINAL_ARTISTS_PERFORMERS = "TOPE";
    public static final String TRACK_NUMBER_POSITION_IN_SET = "TRCK";
    public static final String PART_OF_A_SET = "TPOS";
    public static final String PUBLISHER = "TPUB";
    public static final String INTERNET_RADIO_STATION_NAME = "TRSN";
    public static final String INTERNET_RADIO_STATION_OWNER = "TRSO";
    public static final String INTERNATIONAL_STANDARD_RECORDING_CODE = "TSRC";
    public static final String USER_DEFINED_TEXT_INFORMATION = "TXXX";
    public static final String UNIQUE_FILE_IDENTIFIER = "UFID";
    public static final String TERMS_OF_USE = "USER";
    public static final String UNSYNCHRONIZED_LYRIC_TEXT_TRANSCRIPTION = "USLT";
    public static final String COMMERCIAL_INFORMATION = "WCOM";
    public static final String COPYRIGHT_LEGAL_INFORMATION = "WCOP";
    public static final String OFFICIAL_AUDIO_WEBPAGE = "WOAF";
    public static final String OFFICIAL_ARTIST_PERFORMER_WEBPAGE = "WOAR";
    public static final String OFFICIAL_AUDIO_SOURCE_WEBPAGE = "WOAS";
    public static final String OFFICIAL_INTERNET_RADIO_STATION_HOMEPAGE = "WORS";
    public static final String PAYMENT = "WPAY";
    public static final String PUBLISHERS_OFFICIAL_WEBPAGE = "WPUB";
    public static final String USER_DEFINED_URL_LINK = "WXXX";

    public static final String AUDIO_SEEK_POINT_INDEX = "ASP1";
    public static final String EQUALIZATION = "EQU2";
    public static final String RELATIVE_VOLUME_ADJUSTMENT = "RVA2";
    public static final String SEEK = "SEEK";
    public static final String SIGNATURE = "SIGN";
    public static final String MOOD = "TMOO";
    public static final String DATE = "TDRC";
    public static final String RECORDING_DATES = "TDRC";
    public static final String RECORDING_TIME = "TDRC";
    public static final String TIME = "TDRC";
    public static final String YEAR = "TDRC";
    public static final String RELEASE_TIME = "TDRL";
    public static final String TAGGING_TIME = "TDTG";
    public static final String ENCODING_TIME = "TDEN";
    public static final String INVOLVED_PEOPLE_LIST = "TIPL";
    public static final String MUSICIAN_CREDITS_LIST = "TMCL";
    public static final String ORIGINAL_RELEASE_YEAR = "TDOR";
    public static final String SET_SUBTITLE = "TSST";
    public static final String PRODUCED_NOTICE = "TPRO";
    public static final String ALBUM_SORT_ORDER = "TSOA";
    public static final String PERFORMER_SORT_ORDER = "TSOP";
    public static final String TITLE_SORT_ORDER = "TSOT";

    private static final int SIZE_START = 4;
    private static final int SIZE_START_1 = 4;
    private static final int SIZE_START_2 = 5;
    private static final int SIZE_START_3 = 6;
    private static final int SIZE_START_4 = 7;
    private static final int FLAGS_START = 8;
    private static final int STATUS_MESSAGES_FLAGS_START = 8;
    private static final int FORMAT_DESCRIPTION_FLAGS_START = 9;

    public static final int UNASSIGNED_STATUS_MESSAGES_FLAG_1_BIT_POS = 0;
    public static final int TAG_ALTER_PRESERVATION_FLAG_BIT_POS = 1;
    public static final int FILE_ALTER_PRESERVATION_FLAG_BIT_POS = 2;
    public static final int READ_ONLY_FLAG_BIT_POS = 3;
    public static final int UNASSIGNED_STATUS_MESSAGES_FLAG_5_BIT_POS = 4;
    public static final int UNASSIGNED_STATUS_MESSAGES_FLAG_6_BIT_POS = 5;
    public static final int UNASSIGNED_STATUS_MESSAGES_FLAG_7_BIT_POS = 6;
    public static final int UNASSIGNED_STATUS_MESSAGES_FLAG_8_BIT_POS = 7;

    public static final int UNASSIGNED_FORMAT_DESCRIPTION_FLAG_1_BIT_POS = 0;
    public static final int GROUPING_IDENTITY_FLAG_BIT_POS = 1;
    public static final int UNASSIGNED_FORMAT_DESCRIPTION_FLAG_3_BIT_POS = 2;
    public static final int UNASSIGNED_FORMAT_DESCRIPTION_FLAG_4_BIT_POS = 3;
    public static final int COMPRESSION_FLAG_BIT_POS = 4;
    public static final int ENCRYPTION_FLAG_BIT_POS = 5;
    public static final int UNSYNCHRONISATION_FLAG_BIT_POS = 6;
    public static final int DATA_LENGTH_INDICATOR_FLAG_BIT_POS = 7;

    public static final int HEADER_SIZE = 10;
    public static final int ID_LENGTH = 4;
    private static final int TEXT_INFORMATION_CHARSET_START = 0;
    private static final int ISO_8859_1 = 0;
    private static final int UTF_16 = 1;
    private static final int UTF_16BE = 2;
    private static final int UTF_8 = 3;

    /**
     * Reads textual frame data.
     *
     * @param id3v24Frame The textual ID3v24Frame object.
     * @return The text embedded in the frame.
     */
    public static String readTextFrame(ID3v24Frame id3v24Frame) {
        String text = "";
        int encoding = 0;
        try {
            encoding = convertByteToInt(id3v24Frame.getFrameData()[TEXT_INFORMATION_CHARSET_START]);
        } catch (UnsupportedEncodingException uee) {
            uee.printStackTrace();
            return text;
        }
        try {
            if (encoding == ISO_8859_1) text = convertBytesToString(id3v24Frame.getFrameData(), 1, id3v24Frame.getFrameData().length - 1, StandardCharsets.ISO_8859_1.name());
            if (encoding == UTF_16) text = convertBytesToString(id3v24Frame.getFrameData(), 1, id3v24Frame.getFrameData().length - 1, StandardCharsets.UTF_16.name());
            if (encoding == UTF_16BE) text = convertBytesToString(id3v24Frame.getFrameData(), 1, id3v24Frame.getFrameData().length - 1, StandardCharsets.UTF_16BE.name());
            if (encoding == UTF_8) text = convertBytesToString(id3v24Frame.getFrameData(), 1, id3v24Frame.getFrameData().length - 1, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException uee) {
            uee.printStackTrace();
        }
        return text;
    }

    public static void writeTextFrame(ID3v24 tag, String id, String value) {
        int newTagSize = tag.getHeader().getTagSize();
        ID3v24Frame frame = findFrame(tag.getFrames(), id);

        if (frame != null) {
            newTagSize -= frame.getFrameSize();
            tag.getFrames().remove(frame);
        }

        byte charset = ((Integer) ISO_8859_1).byteValue();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(charset);
            outputStream.write(value.getBytes(StandardCharsets.ISO_8859_1));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        ID3v24Frame replacementFrame = new ID3v24Frame(id, outputStream.toByteArray());
        tag.getFrames().add(replacementFrame);

        newTagSize += replacementFrame.getFrameSize();
        tag.getHeader().setTagSize(newTagSize);
    }

    public static void writeTextFrame(ID3v24 tag, String id, int value) {
        int newTagSize = tag.getHeader().getTagSize();
        ID3v24Frame frame = findFrame(tag.getFrames(), id);
        if (frame != null) {
            newTagSize -= frame.getFrameSize();
            tag.getFrames().remove(frame);
        }

        byte charset = ((Integer) ISO_8859_1).byteValue();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(charset);
            outputStream.write(Integer.toString(value).getBytes(StandardCharsets.ISO_8859_1));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        ID3v24Frame replacementFrame = new ID3v24Frame(id, outputStream.toByteArray());
        tag.getFrames().add(0, replacementFrame);

        newTagSize += replacementFrame.getFrameSize();
        tag.getHeader().setTagSize(newTagSize);
    }

    private static ID3v24Frame findFrame(ArrayList<ID3v24Frame> frames, String id) {
        for (ID3v24Frame f : frames) {
            if (f.getId().equals(id)) return f;
        }
        return null;
    }

    /**
     * Extracts a single frame and populates a ID3v2.4 frame object with basic frame data.
     *
     * @param frameBytes The a single frame as an array of bytes.
     * @throws InvalidFrameException If the ID is invalid.
     * @return A ID3v24 frame populated with data.
     */
    public static ID3v24Frame extractFrameMetadata(byte[] frameBytes) throws InvalidFrameException {
        ID3v24Frame id3v24Frame = new ID3v24Frame();
        id3v24Frame.setFrame(frameBytes);

        id3v24Frame.setId(extractFrameID(frameBytes));
        id3v24Frame.setDataSize(extractFrameSize(frameBytes));
        id3v24Frame.setFrameSize(id3v24Frame.getDataSize() + HEADER_SIZE);
        populateFrameFlags(id3v24Frame);
        populateFrameFlagData(id3v24Frame);
        id3v24Frame.setFrame(Arrays.copyOfRange(frameBytes, 0, id3v24Frame.getFrameSize()));
        id3v24Frame.setFrameData(Arrays.copyOfRange(frameBytes, HEADER_SIZE, id3v24Frame.getFrameSize()));

        return id3v24Frame;
    }

    /**
     * Extracts the frame id for a particular ID3v2 frame.
     *
     * @param frameData The data for a single frame as an array of bytes.
     * @throws InvalidFrameException If the ID is invalid.
     */
    public static String extractFrameID(byte[] frameData) throws InvalidFrameException {
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
     * Extracts the size of the ID3v23 frame.
     *
     * @param frameBytes The single frame as an array of bytes.
     */
    public static int extractFrameSize(byte[] frameBytes) {
        int size = unpackSynchsafeInteger(
            frameBytes[SIZE_START_1],
            frameBytes[SIZE_START_2],
            frameBytes[SIZE_START_3],
            frameBytes[SIZE_START_4]);
        return size;
    }

    /**
     * Extracts the flags configuration of the ID3v2.3 frame.
     *
     * @param id3v24Frame The ID3v2Frame being populated with flags configuration.
     * @throws InvalidFrameException If the id3v24Frame object is empty.
     */
    public static void populateFrameFlags(ID3v24Frame id3v24Frame) throws InvalidFrameException {
        if (id3v24Frame.getFrame() == null) throw new InvalidFrameException("[INVALID FRAME EXCEPTION] The id3v24Frame object is null.");
        if (id3v24Frame.getFrame().length == 0) throw new InvalidFrameException("[INVALID FRAME EXCEPTION] The id3v24Frame object is empty.");

        id3v24Frame.setUnassignedStatusMessageFlag1(checkBit(id3v24Frame.getFrame()[STATUS_MESSAGES_FLAGS_START], UNASSIGNED_STATUS_MESSAGES_FLAG_1_BIT_POS));
        id3v24Frame.setPreserveTag(checkBit(id3v24Frame.getFrame()[STATUS_MESSAGES_FLAGS_START], TAG_ALTER_PRESERVATION_FLAG_BIT_POS));
        id3v24Frame.setPreserveFile(checkBit(id3v24Frame.getFrame()[STATUS_MESSAGES_FLAGS_START], FILE_ALTER_PRESERVATION_FLAG_BIT_POS));
        id3v24Frame.setReadOnly(checkBit(id3v24Frame.getFrame()[STATUS_MESSAGES_FLAGS_START], READ_ONLY_FLAG_BIT_POS));
        id3v24Frame.setUnassignedStatusMessageFlag5(checkBit(id3v24Frame.getFrame()[STATUS_MESSAGES_FLAGS_START], UNASSIGNED_STATUS_MESSAGES_FLAG_5_BIT_POS));
        id3v24Frame.setUnassignedStatusMessageFlag6(checkBit(id3v24Frame.getFrame()[STATUS_MESSAGES_FLAGS_START], UNASSIGNED_STATUS_MESSAGES_FLAG_6_BIT_POS));
        id3v24Frame.setUnassignedStatusMessageFlag7(checkBit(id3v24Frame.getFrame()[STATUS_MESSAGES_FLAGS_START], UNASSIGNED_STATUS_MESSAGES_FLAG_7_BIT_POS));
        id3v24Frame.setUnassignedStatusMessageFlag8(checkBit(id3v24Frame.getFrame()[STATUS_MESSAGES_FLAGS_START], UNASSIGNED_STATUS_MESSAGES_FLAG_8_BIT_POS));

        id3v24Frame.setUnassignedFormatDescriptionFlag1(checkBit(id3v24Frame.getFrame()[FORMAT_DESCRIPTION_FLAGS_START], UNASSIGNED_FORMAT_DESCRIPTION_FLAG_1_BIT_POS));
        id3v24Frame.setGroupIdentity(checkBit(id3v24Frame.getFrame()[FORMAT_DESCRIPTION_FLAGS_START], GROUPING_IDENTITY_FLAG_BIT_POS));
        id3v24Frame.setUnassignedFormatDescriptionFlag3(checkBit(id3v24Frame.getFrame()[FORMAT_DESCRIPTION_FLAGS_START], UNASSIGNED_FORMAT_DESCRIPTION_FLAG_3_BIT_POS));
        id3v24Frame.setUnassignedFormatDescriptionFlag4(checkBit(id3v24Frame.getFrame()[FORMAT_DESCRIPTION_FLAGS_START], UNASSIGNED_FORMAT_DESCRIPTION_FLAG_4_BIT_POS));
        id3v24Frame.setCompression(checkBit(id3v24Frame.getFrame()[FORMAT_DESCRIPTION_FLAGS_START], COMPRESSION_FLAG_BIT_POS));
        id3v24Frame.setEncryption(checkBit(id3v24Frame.getFrame()[FORMAT_DESCRIPTION_FLAGS_START], ENCRYPTION_FLAG_BIT_POS));
        id3v24Frame.setUnsynchronisation(checkBit(id3v24Frame.getFrame()[FORMAT_DESCRIPTION_FLAGS_START], UNSYNCHRONISATION_FLAG_BIT_POS));
        id3v24Frame.setDataLengthIndicator(checkBit(id3v24Frame.getFrame()[FORMAT_DESCRIPTION_FLAGS_START], DATA_LENGTH_INDICATOR_FLAG_BIT_POS));
    }

    //TODO: Flag data based off checked flags
    /**
     * Extracts and populates necessary additional flag data.
     *
     * @param id3v24Frame The ID3v24Frame object being populated with additional flag data.
     * @throws InvalidFrameException If the ID3v24Frame object is empty.
     */
    public static void populateFrameFlagData(ID3v24Frame id3v24Frame) throws InvalidFrameException {
        if (id3v24Frame.getFrame().length == 0) throw new InvalidFrameException("[INVALID FRAME EXCEPTION] The ID3v24Frame object is empty.");

        if (id3v24Frame.isUnassignedStatusMessageFlag1()) {}
        if (id3v24Frame.isPreserveTag()) {}
        if (id3v24Frame.isPreserveFile()) {}
        if (id3v24Frame.isReadOnly()) {}
        if (id3v24Frame.isUnassignedStatusMessageFlag5()) {}
        if (id3v24Frame.isUnassignedStatusMessageFlag6()) {}
        if (id3v24Frame.isUnassignedStatusMessageFlag7()) {}
        if (id3v24Frame.isUnassignedStatusMessageFlag8()) {}

        if (id3v24Frame.isUnassignedFormatDescriptionFlag1()) {}
        if (id3v24Frame.isGroupIdentity()) {}
        if (id3v24Frame.isUnassignedFormatDescriptionFlag3()) {}
        if (id3v24Frame.isUnassignedFormatDescriptionFlag4()) {}
        if (id3v24Frame.isCompression()) {}
        if (id3v24Frame.isEncryption()) {}
        if (id3v24Frame.isUnsynchronisation()) {}
        if (id3v24Frame.isDataLengthIndicator()) {}
    }
}
