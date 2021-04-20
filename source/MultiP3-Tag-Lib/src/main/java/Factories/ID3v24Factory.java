package Factories;

import Exceptions.HeaderNotFoundException;
import FileTypes.MP3;
import TagStructures.ID3v2Frame;
import TagStructures.ID3v2Header;
import TagTypes.ID3v2;
import TagTypes.ID3v22;
import TagTypes.ID3v24;

import java.util.ArrayList;
import java.util.Arrays;

import static Factories.ID3v2FrameFactory.extractFrames;
import static Factories.ID3v2HeaderFactory.HEADER_LENGTH;

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
        ID3v2Header header = null;
        try {
            header = ID3v2HeaderFactory.extractHeader(mp3);
        } catch (HeaderNotFoundException hnfe) {
            hnfe.printStackTrace(); // TODO Handle correctly
        }

        ID3v24 tag = new ID3v24();
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