package TagTypes;

import TagStructures.ID3v2Frame;

import java.util.ArrayList;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public abstract class AbstractID3v2 implements ID3v2 {

    protected String recommendedBufferSize;
    protected int playCounter;
    protected String comments;
    protected String audioEncryption;
    protected String[] eventTimingCodes;
    protected String equalization;
    protected String generalEncapsulatedObject;
    protected String[] involvedPeople;
    protected String attachedPicture; // Possibly change to Image type
    protected String linkedInformation;
    protected String musicCDIdentifier;
    protected String MPEGLocationLookupTable;
    protected String popularimeter;
    protected String reverb;
    protected String relativeVolumeAdjustment;
    protected String synchronizedLyricText;
    protected String albumMoveShowTitle;
    protected double beatsPerMinute;
    protected String composer;
    protected String contentType;
    protected String copyrightMessage;
    protected String date;
    protected String playlistDelay;
    protected String encodedBy;
    protected String fileType;
    protected String time;
    protected String initialKey; // Attempt to define an enumeration or type which can be used to transition between key formats
    protected String language;
    protected String length;
    protected String mediaType;
    protected String originalArtistsPerformers;
    protected String originalFilename;
    protected String originalLyricistsTextWriters;
    protected String originalReleaseYear;
    protected String originalAlbumMovieShowTitle;
    protected String bandOrchestraAccompaniment;
    protected String conductorPerformerRefinement;
    protected String interpretedRemixedOrOtherwiseModifiedBy;
    protected String partOfASet; // Possibly implement as a boolean
    protected String publisher;
    protected String internationalStandardRecordingCode;
    protected String[] recordingDates;
    protected int trackNumberPositionInSet;
    protected int size; // Detail a defined unit GB, MB, KB, etc
    protected String softwareHardwareAndSettingsUsedForEncoding;
    protected String contentGroupDescription;
    protected String titleSongNameContentDescription;
    protected String subtitleDescriptionRefinement;
    protected String lyricistTextWriter;
    protected String userDefinedTextInformation;
    protected String year;
    protected String uniqueFileIdentifier;
    protected String unsynchronizedLyricTextTranscription;
    protected String officialAudioWebpage;
    protected String officialArtistPerformerWebpage;
    protected String officialAudioSourceWebpage;
    protected String userDefinedURLLink;

    protected byte[] bytes;
    protected ArrayList<ID3v2Frame> frames;

    //TODO - JavaDoc
    public void addFrame(ID3v2Frame frame) {
        frames.add(frame);
    }

    //TODO - JavaDoc
    public byte[] getBytes() {
        return bytes;
    }

    //TODO - JavaDoc
    public String getRecommendedBufferSize() {
        return recommendedBufferSize;
    }

    //TODO - JavaDoc
    public void setRecommendedBufferSize(String recommendedBufferSize) {
        this.recommendedBufferSize = recommendedBufferSize;
    }

    //TODO - JavaDoc
    public int getPlayCounter() {
        return playCounter;
    }

    //TODO - JavaDoc
    public void setPlayCounter(int playCounter) {
        this.playCounter = playCounter;
    }

    //TODO - JavaDoc
    public String getAudioEncryption() {
        return audioEncryption;
    }

    //TODO - JavaDoc
    public void setAudioEncryption(String audioEncryption) {
        this.audioEncryption = audioEncryption;
    }

    //TODO - JavaDoc
    public String getAttachedPicture() {
        return attachedPicture;
    }

    //TODO - JavaDoc
    public void setAttachedPicture(String attachedPicture) {
        this.attachedPicture = attachedPicture;
    }

    //TODO - JavaDoc
    public String getComments() {
        return comments;
    }

    //TODO - JavaDoc
    public void setComments(String comments) {
        this.comments = comments;
    }

    //TODO - JavaDoc
    public String getEqualization() {
        return equalization;
    }

    //TODO - JavaDoc
    public void setEqualisation(String equalisation) {
        this.equalization = equalisation;
    }

    //TODO - JavaDoc
    public String[] getEventTimingCodes() {
        return eventTimingCodes;
    }

    //TODO - JavaDoc
    public void setEventTimingCodes(String[] eventTimingCodes) {
        this.eventTimingCodes = eventTimingCodes;
    }

    //TODO - JavaDoc
    public String getGeneralEncapsulatedObject() {
        return generalEncapsulatedObject;
    }

    //TODO - JavaDoc
    public void setGeneralEncapsulatedObject(String generalEncapsulatedObject) {
        this.generalEncapsulatedObject = generalEncapsulatedObject;
    }

    //TODO - JavaDoc
    public String[] getInvolvedPeople() {
        return involvedPeople;
    }

    //TODO - JavaDoc
    public void setInvolvedPeople(String[] involvedPeople) {
        this.involvedPeople = involvedPeople;
    }

    //TODO - JavaDoc
    public String getLinkedInformation() {
        return linkedInformation;
    }

    //TODO - JavaDoc
    public void setLinkedInformation(String linkedInformation) {
        this.linkedInformation = linkedInformation;
    }

    //TODO - JavaDoc
    public String getMusicCDIdentifier() {
        return musicCDIdentifier;
    }

    //TODO - JavaDoc
    public void setMusicCDIdentifier(String musicCDIdentifier) {
        this.musicCDIdentifier = musicCDIdentifier;
    }

    //TODO - JavaDoc
    public String getMPEGLocationLookupTable() {
        return MPEGLocationLookupTable;
    }

    //TODO - JavaDoc
    public void setMPEGLocationLookupTable(String MPEGLocationLookupTable) {
        this.MPEGLocationLookupTable = MPEGLocationLookupTable;
    }

    //TODO - JavaDoc
    public String getPopularimeter() {
        return popularimeter;
    }

    //TODO - JavaDoc
    public void setPopularimeter(String popularimeter) {
        this.popularimeter = popularimeter;
    }

    //TODO - JavaDoc
    public String getRelativeVolumeAdjustment() {
        return relativeVolumeAdjustment;
    }

    //TODO - JavaDoc
    public void setRelativeVolumeAdjustment(String relativeVolumeAdjustment) {
        this.relativeVolumeAdjustment = relativeVolumeAdjustment;
    }

    //TODO - JavaDoc
    public String getReverb() {
        return reverb;
    }

    //TODO - JavaDoc
    public void setReverb(String reverb) {
        this.reverb = reverb;
    }

    //TODO - JavaDoc
    public String getSynchronizedLyricText() {
        return synchronizedLyricText;
    }

    //TODO - JavaDoc
    public void setSynchronizedLyricText(String synchronizedLyricText) {
        this.synchronizedLyricText = synchronizedLyricText;
    }

    //TODO - JavaDoc
    public String getAlbumMoveShowTitle() {
        return albumMoveShowTitle;
    }

    //TODO - JavaDoc
    public void setAlbumMoveShowTitle(String albumMoveShowTitle) {
        this.albumMoveShowTitle = albumMoveShowTitle;
    }

    //TODO - JavaDoc
    public double getBeatsPerMinute() {
        return beatsPerMinute;
    }

    //TODO - JavaDoc
    public void setBeatsPerMinute(double beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

    //TODO - JavaDoc
    public String getComposer() {
        return composer;
    }

    //TODO - JavaDoc
    public void setComposer(String composer) {
        this.composer = composer;
    }

    //TODO - JavaDoc
    public String getContentType() {
        return contentType;
    }

    //TODO - JavaDoc
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    //TODO - JavaDoc
    public String getCopyrightMessage() {
        return copyrightMessage;
    }

    //TODO - JavaDoc
    public void setCopyrightMessage(String copyrightMessage) {
        this.copyrightMessage = copyrightMessage;
    }

    //TODO - JavaDoc
    public String getDate() {
        return date;
    }

    //TODO - JavaDoc
    public void setDate(String date) {
        this.date = date;
    }

    //TODO - JavaDoc
    public String getPlaylistDelay() {
        return playlistDelay;
    }

    //TODO - JavaDoc
    public void setPlaylistDelay(String playlistDelay) {
        this.playlistDelay = playlistDelay;
    }

    //TODO - JavaDoc
    public String getEncodedBy() {
        return encodedBy;
    }

    //TODO - JavaDoc
    public void setEncodedBy(String encodedBy) {
        this.encodedBy = encodedBy;
    }

    //TODO - JavaDoc
    public String getLyricistTextWriter() {
        return lyricistTextWriter;
    }

    //TODO - JavaDoc
    public void setLyricistTextWriter(String lyricistTextWriter) {
        this.lyricistTextWriter = lyricistTextWriter;
    }

    //TODO - JavaDoc
    public String getFileType() {
        return fileType;
    }

    //TODO - JavaDoc
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    //TODO - JavaDoc
    public String getTime() {
        return time;
    }

    //TODO - JavaDoc
    public void setTime(String time) {
        this.time = time;
    }

    //TODO - JavaDoc
    public String getContentGroupDescription() {
        return contentGroupDescription;
    }

    //TODO - JavaDoc
    public void setContentGroupDescription(String contentGroupDescription) {
        this.contentGroupDescription = contentGroupDescription;
    }

    //TODO - JavaDoc
    public String getTitleSongNameContentDescription() {
        return titleSongNameContentDescription;
    }

    //TODO - JavaDoc
    public void setTitleSongNameContentDescription(String titleSongNameContentDescription) {
        this.titleSongNameContentDescription = titleSongNameContentDescription;
    }

    //TODO - JavaDoc
    public String getSubtitleDescriptionRefinement() {
        return subtitleDescriptionRefinement;
    }

    //TODO - JavaDoc
    public void setSubtitleDescriptionRefinement(String subtitleDescriptionRefinement) {
        this.subtitleDescriptionRefinement = subtitleDescriptionRefinement;
    }

    //TODO - JavaDoc
    public String getInitialKey() {
        return initialKey;
    }

    //TODO - JavaDoc
    public void setInitialKey(String initialKey) {
        this.initialKey = initialKey;
    }

    //TODO - JavaDoc
    public String getLanguage() {
        return language;
    }

    //TODO - JavaDoc
    public void setLanguage(String language) {
        this.language = language;
    }

    //TODO - JavaDoc
    public String getLength() {
        return length;
    }

    //TODO - JavaDoc
    public void setLength(String length) {
        this.length = length;
    }

    //TODO - JavaDoc
    public String getMediaType() {
        return mediaType;
    }

    //TODO - JavaDoc
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    //TODO - JavaDoc
    public String getOriginalAlbumMovieShowTitle() {
        return originalAlbumMovieShowTitle;
    }

    //TODO - JavaDoc
    public void setOriginalAlbumMovieShowTitle(String originalAlbumMovieShowTitle) {
        this.originalAlbumMovieShowTitle = originalAlbumMovieShowTitle;
    }

    //TODO - JavaDoc
    public String getOriginalFilename() {
        return originalFilename;
    }

    //TODO - JavaDoc
    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    //TODO - JavaDoc
    public String getOriginalLyricistsTextWriters() {
        return originalLyricistsTextWriters;
    }

    //TODO - JavaDoc
    public void setOriginalLyricistsTextWriters(String originalLyricistsTextWriters) {
        this.originalLyricistsTextWriters = originalLyricistsTextWriters;
    }

    //TODO - JavaDoc
    public String getOriginalArtistsPerformers() {
        return originalArtistsPerformers;
    }

    //TODO - JavaDoc
    public void setOriginalArtistsPerformers(String originalArtistsPerformers) {
        this.originalArtistsPerformers = originalArtistsPerformers;
    }

    //TODO - JavaDoc
    public String getOriginalReleaseYear() {
        return originalReleaseYear;
    }

    //TODO - JavaDoc
    public void setOriginalReleaseYear(String originalReleaseYear) {
        this.originalReleaseYear = originalReleaseYear;
    }

    //TODO - JavaDoc
    public String getBandOrchestraAccompaniment() {
        return bandOrchestraAccompaniment;
    }

    //TODO - JavaDoc
    public void setBandOrchestraAccompaniment(String bandOrchestraAccompaniment) {
        this.bandOrchestraAccompaniment = bandOrchestraAccompaniment;
    }

    //TODO - JavaDoc
    public String getConductorPerformerRefinement() {
        return conductorPerformerRefinement;
    }

    //TODO - JavaDoc
    public void setConductorPerformerRefinement(String conductorPerformerRefinement) {
        this.conductorPerformerRefinement = conductorPerformerRefinement;
    }

    //TODO - JavaDoc
    public String getInterpretedRemixedOrOtherwiseModifiedBy() {
        return interpretedRemixedOrOtherwiseModifiedBy;
    }

    //TODO - JavaDoc
    public void setInterpretedRemixedOrOtherwiseModifiedBy(String interpretedRemixedOrOtherwiseModifiedBy) {
        this.interpretedRemixedOrOtherwiseModifiedBy = interpretedRemixedOrOtherwiseModifiedBy;
    }

    //TODO - JavaDoc
    public String getPartOfASet() {
        return partOfASet;
    }

    //TODO - JavaDoc
    public void setPartOfASet(String partOfASet) {
        this.partOfASet = partOfASet;
    }

    //TODO - JavaDoc
    public String getPublisher() {
        return publisher;
    }

    //TODO - JavaDoc
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    //TODO - JavaDoc
    public int getTrackNumberPositionInSet() {
        return trackNumberPositionInSet;
    }

    //TODO - JavaDoc
    public void setTrackNumberPositionInSet(int trackNumberPositionInSet) {
        this.trackNumberPositionInSet = trackNumberPositionInSet;
    }

    //TODO - JavaDoc
    public String[] getRecordingDates() {
        return recordingDates;
    }

    //TODO - JavaDoc
    public void setRecordingDates(String[] recordingDates) {
        this.recordingDates = recordingDates;
    }

    //TODO - JavaDoc
    public int getSize() {
        return size;
    }

    //TODO - JavaDoc
    public void setSize(int size) {
        this.size = size;
    }

    //TODO - JavaDoc
    public String getInternationalStandardRecordingCode() {
        return internationalStandardRecordingCode;
    }

    //TODO - JavaDoc
    public void setInternationalStandardRecordingCode(String internationalStandardRecordingCode) {
        this.internationalStandardRecordingCode = internationalStandardRecordingCode;
    }

    //TODO - JavaDoc
    public String getSoftwareHardwareAndSettingsUsedForEncoding() {
        return softwareHardwareAndSettingsUsedForEncoding;
    }

    //TODO - JavaDoc
    public void setSoftwareHardwareAndSettingsUsedForEncoding(String softwareHardwareAndSettingsUsedForEncoding) {
        this.softwareHardwareAndSettingsUsedForEncoding = softwareHardwareAndSettingsUsedForEncoding;
    }

    //TODO - JavaDoc
    public String getUserDefinedTextInformation() {
        return userDefinedTextInformation;
    }

    //TODO - JavaDoc
    public void setUserDefinedTextInformation(String userDefinedTextInformation) {
        this.userDefinedTextInformation = userDefinedTextInformation;
    }

    //TODO - JavaDoc
    public String getYear() {
        return year;
    }

    //TODO - JavaDoc
    public void setYear(String year) {
        this.year = year;
    }

    //TODO - JavaDoc
    public String getUniqueFileIdentifier() {
        return uniqueFileIdentifier;
    }

    //TODO - JavaDoc
    public void setUniqueFileIdentifier(String uniqueFileIdentifier) {
        this.uniqueFileIdentifier = uniqueFileIdentifier;
    }

    //TODO - JavaDoc
    public String getUnsynchronizedLyricTextTranscription() {
        return unsynchronizedLyricTextTranscription;
    }

    //TODO - JavaDoc
    public void setUnsynchronizedLyricTextTranscription(String unsynchronisedLyricTextTranscription) {
        this.unsynchronizedLyricTextTranscription = unsynchronisedLyricTextTranscription;
    }

    //TODO - JavaDoc
    public String getOfficialAudioWebpage() {
        return officialAudioWebpage;
    }

    //TODO - JavaDoc
    public void setOfficialAudioWebpage(String officialAudioWebpage) {
        this.officialAudioWebpage = officialAudioWebpage;
    }

    //TODO - JavaDoc
    public String getOfficialArtistPerformerWebpage() {
        return officialArtistPerformerWebpage;
    }

    //TODO - JavaDoc
    public void setOfficialArtistPerformerWebpage(String officialArtistPerformerWebpage) {
        this.officialArtistPerformerWebpage = officialArtistPerformerWebpage;
    }

    //TODO - JavaDoc
    public String getOfficialAudioSourceWebpage() {
        return officialAudioSourceWebpage;
    }

    //TODO - JavaDoc
    public void setOfficialAudioSourceWebpage(String officialAudioSourceWebpage) {
        this.officialAudioSourceWebpage = officialAudioSourceWebpage;
    }

    //TODO - JavaDoc
    public String getUserDefinedURLLink() {
        return userDefinedURLLink;
    }

    //TODO - JavaDoc
    public void setUserDefinedURLLink(String userDefinedURLLink) {
        this.userDefinedURLLink = userDefinedURLLink;
    }
}