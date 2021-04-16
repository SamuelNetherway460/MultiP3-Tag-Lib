package TagTypes;

import Exceptions.HeaderNotFoundException;
import Factories.ID3v2HeaderFactory;
import FileTypes.MP3;
import TagStructures.ID3v2Header;
import Utilities.ByteUtilities;

import java.sql.Time;

//TODO - JavaDoc
public class ID3v24 extends ID3v23 {

    private ID3v2Header header = null;
    private int audioSeekPointIndex;
    private String seek;
    private String signature;
    private Time encodingTime;
    private Time recordingTime;
    private Time releaseTime;
    private Time taggingTime;
    private String[] musicianCreditsList;
    private String mood;
    private String producedNotice;
    private String albumSortOrder;
    private String performerSortOrder;
    private String titleSortOrder;
    private String setSubtitle;
    private String equalization;

    //TODO - JavaDoc
    public ID3v24(MP3 mp3) {
        super(mp3);
    }

    //TODO - JavaDoc
    @Override
    public void initTag(MP3 mp3) {
        bytes = ByteUtilities.getID3v24Bytes(mp3);
        try {
            header = ID3v2HeaderFactory.extractHeader(mp3);
        } catch (HeaderNotFoundException hnfe) {
            hnfe.printStackTrace(); // TODO Handle correctly
        }
    }

    public ID3v2Header getHeader() {
        return header;
    }

    public void setHeader(ID3v2Header header) {
        this.header = header;
    }

    //TODO - JavaDoc
    public int getAudioSeekPointIndex() {
        return audioSeekPointIndex;
    }

    //TODO - JavaDoc
    public void setAudioSeekPointIndex(int audioSeekPointIndex) {
        this.audioSeekPointIndex = audioSeekPointIndex;
    }

    //TODO - JavaDoc
    public String getSeek() {
        return seek;
    }

    //TODO - JavaDoc
    public void setSeek(String seek) {
        this.seek = seek;
    }

    //TODO - JavaDoc
    public String getSignature() {
        return signature;
    }

    //TODO - JavaDoc
    public void setSignature(String signature) {
        this.signature = signature;
    }

    //TODO - JavaDoc
    public Time getEncodingTime() {
        return encodingTime;
    }

    //TODO - JavaDoc
    public void setEncodingTime(Time encodingTime) {
        this.encodingTime = encodingTime;
    }

    //TODO - JavaDoc
    public Time getRecordingTime() {
        return recordingTime;
    }

    //TODO - JavaDoc
    public void setRecordingTime(Time recordingTime) {
        this.recordingTime = recordingTime;
    }

    //TODO - JavaDoc
    public Time getReleaseTime() {
        return releaseTime;
    }

    //TODO - JavaDoc
    public void setReleaseTime(Time releaseTime) {
        this.releaseTime = releaseTime;
    }

    //TODO - JavaDoc
    public Time getTaggingTime() {
        return taggingTime;
    }

    //TODO - JavaDoc
    public void setTaggingTime(Time taggingTime) {
        this.taggingTime = taggingTime;
    }

    //TODO - JavaDoc
    public void setMusicianCreditsList(String[] musicianCreditsList) {
        this.musicianCreditsList = musicianCreditsList;
    }

    //TODO - JavaDoc
    public String[] getMusicianCreditsList() {
        return musicianCreditsList;
    }

    //TODO - JavaDoc
    public String getMood() {
        return mood;
    }

    //TODO - JavaDoc
    public void setMood(String mood) {
        this.mood = mood;
    }

    //TODO - JavaDoc
    public String getProducedNotice() {
        return producedNotice;
    }

    //TODO - JavaDoc
    public void setProducedNotice(String producedNotice) {
        this.producedNotice = producedNotice;
    }

    //TODO - JavaDoc
    public String getAlbumSortOrder() {
        return albumSortOrder;
    }

    //TODO - JavaDoc
    public void setAlbumSortOrder(String albumSortOrder) {
        this.albumSortOrder = albumSortOrder;
    }

    //TODO - JavaDoc
    public String getPerformerSortOrder() {
        return performerSortOrder;
    }

    //TODO - JavaDoc
    public void setPerformerSortOrder(String performerSortOrder) {
        this.performerSortOrder = performerSortOrder;
    }

    //TODO - JavaDoc
    public String getTitleSortOrder() {
        return titleSortOrder;
    }

    //TODO - JavaDoc
    public void setTitleSortOrder(String titleSortOrder) {
        this.titleSortOrder = titleSortOrder;
    }

    //TODO - JavaDoc
    public String getSetSubtitle() {
        return setSubtitle;
    }

    //TODO - JavaDoc
    public void setSetSubtitle(String setSubtitle) {
        this.setSubtitle = setSubtitle;
    }

    //TODO - JavaDoc
    public String getEqualization() {
        return equalization;
    }

    //TODO - JavaDoc
    public void setEqualization(String equalization) {
        this.equalization = equalization;
    }
}