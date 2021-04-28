package TagTypes;

import Factories.ID3v23FrameFactory;
import TagStructures.ID3v23Frame;
import TagStructures.ID3v2ExtendedHeader;

import javax.management.timer.TimerNotification;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import static Factories.ID3v23FrameFactory.*;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v23 extends ID3v2 {

    private String audioEncryption;
    private String attachedPicture; //TODO: Change type
    private String comments;
    private String commercial;
    private String equalization;
    private String eventTimingCodes;
    private String generalEncapsulatedObject;
    private String linkedInformation;
    private String musicCDIdentifier;
    private String mpegLocationLookupTable;
    private String ownership;
    private int playCounter = -1; //unset
    private int popularimeter = -1; //unset
    private String recommendedBufferSize;
    private String relativeVolumeAdjustment;
    private String reverb;
    private String synchronizedLyricText;
    private String synchronizedTempoCodes;
    private int bpm = -1;
    private String initialKey;
    private String contentType;
    private String copyrightMessage;
    private String date;
    private String recordingDates;
    private String time;
    private int year = -1;
    private String encodedBy;
    private String softwareHardwareAndSettingsUsedForEncoding;
    private String playlistDelay;
    private String contentGroupDescription;
    private String title;
    private String subtitleDescriptionRefinement;
    private String album;
    private String language;
    private String length;
    private String fileType;
    private String mediaType;
    private String leadPerformerSoloists;
    private String bandOrchestraAccompaniment;
    private String conductorPerformerRefinement;
    private String remixedBy;
    private String composer;
    private String lyricistTextWriter;
    private String involvedPeopleList;
    private String originalAlbumMovieShowTitle;
    private String originalFilename;
    private String originalLyricistsTextWriters;
    private String originalArtistsPerformers;
    private String originalReleaseYear;
    private String trackNumberPositionInSet;
    private String partOfSet;
    private String publisher;
    private String internationalStandardRecordingCode;
    private String userDefinedTextInformationFrame;
    private String uniqueFileIdentifier;
    private String termsOfUse;
    private String unsynchronizedLyricTextTranscription;
    private String commercialInformation;
    private String copyrightLegalInformation;
    private String officialAudioFileWebpage;
    private String officialArtistPerformerWebpage;
    private String officialAudioSourceWebpage;
    private String publishersOfficialWebpage;
    private String userDefinedURLLink;
    
    private String encryptionMethodRegistration;
    private String groupIdentificationRegistration;
    private String privateField;
    private String positionSynchronisation;
    private String fileOwnerLicence;
    private String internetRadioStationName;
    private String internetRadioStationOwner;
    private String officialInternetRadioStationHomepage;
    private String payment;

    private ID3v2ExtendedHeader extendedHeader;
    private ArrayList<ID3v23Frame> frames;

    private int size;

    //TODO - JavaDoc
    public ID3v23() {

    }

    private ID3v2ExtendedHeader getExtendedHeader() {
        return extendedHeader;
    }

    private void setExtendedHeader(ID3v2ExtendedHeader extendedHeader) {
        this.extendedHeader = extendedHeader;
    }

    public ArrayList<ID3v23Frame> getFrames() {
        return frames;
    }

    public void setFrames(ArrayList<ID3v23Frame> frames) {
        this.frames = frames;
    }

    public void deleteFrame(String id) {
        ID3v23Frame frame = findFrame(frames, id);
        frames.remove(frame);
        updateFrameBytes();
    }

    public int getBpm() {
        if (bpm != -1) return bpm;
        ID3v23Frame frame = findFrame(frames, BEATS_PER_MINUTE);
        if (frame == null) return -1;
        String bpm = ID3v23FrameFactory.readTextFrame(frame);
        this.bpm = Integer.valueOf(bpm);
        return this.bpm;
    }

    public void setBpm(int bpm) {
        ID3v23FrameFactory.writeTextFrame(this, BEATS_PER_MINUTE, bpm);
        updateFrameBytes();
        this.bpm = bpm;
    }

    public String getInitialKey() {
        if (initialKey != null) return initialKey;
        ID3v23Frame frame = findFrame(frames, INITIAL_KEY);
        if (frame == null) return initialKey;
        this.initialKey = ID3v23FrameFactory.readTextFrame(frame);
        return initialKey;
    }

    public void setInitialKey(String initialKey) {
        ID3v23FrameFactory.writeTextFrame(this, INITIAL_KEY, initialKey);
        updateFrameBytes();
        this.initialKey = initialKey;
    }

    public String getContentType() {
        if (contentType != null) return contentType;
        ID3v23Frame frame = findFrame(frames, CONTENT_TYPE);
        if (frame == null) return contentType;
        this.contentType = ID3v23FrameFactory.readTextFrame(frame);
        return contentType;
    }

    public void setContentType(String contentType) {
        ID3v23FrameFactory.writeTextFrame(this, CONTENT_TYPE, contentType);
        updateFrameBytes();
        this.contentType = contentType;
    }

    public String getCopyrightMessage() {
        if (copyrightMessage != null) return copyrightMessage;
        ID3v23Frame frame = findFrame(frames, COPYRIGHT_MESSAGE);
        if (frame == null) return copyrightMessage;
        this.copyrightMessage = ID3v23FrameFactory.readTextFrame(frame);
        return copyrightMessage;
    }

    public void setCopyrightMessage(String copyrightMessage) {
        ID3v23FrameFactory.writeTextFrame(this, COPYRIGHT_MESSAGE, copyrightMessage);
        updateFrameBytes();
        this.copyrightMessage = copyrightMessage;
    }

    public String getDate() {
        if (date != null) return date;
        ID3v23Frame frame = findFrame(frames, DATE);
        if (frame == null) return date;
        this.date = ID3v23FrameFactory.readTextFrame(frame);
        return date;
    }

    public void setDate(String date) {
        ID3v23FrameFactory.writeTextFrame(this, DATE, date);
        updateFrameBytes();
        this.date = date;
    }

    public String getRecordingDates() {
        if (recordingDates != null) return recordingDates;
        ID3v23Frame frame = findFrame(frames, RECORDING_DATES);
        if (frame == null) return recordingDates;
        this.recordingDates = ID3v23FrameFactory.readTextFrame(frame);
        return recordingDates;
    }

    public void setRecordingDates(String recordingDates) {
        ID3v23FrameFactory.writeTextFrame(this, RECORDING_DATES, recordingDates);
        updateFrameBytes();
        this.recordingDates = recordingDates;
    }

    public String getTime() {
        if (time != null) return time;
        ID3v23Frame frame = findFrame(frames, TIME);
        if (frame == null) return time;
        this.time = ID3v23FrameFactory.readTextFrame(frame);
        return time;
    }

    public void setTime(String time) {
        ID3v23FrameFactory.writeTextFrame(this, TIME, time);
        updateFrameBytes();
        this.time = time;
    }

    public int getYear() {
        if (year != -1) return year;
        ID3v23Frame frame = findFrame(frames, YEAR);
        if (frame == null) return -1;
        String year = ID3v23FrameFactory.readTextFrame(frame);
        this.year = Integer.valueOf(year);
        return this.year;
    }

    public void setYear(int year) {
        ID3v23FrameFactory.writeTextFrame(this, YEAR, year);
        updateFrameBytes();
        this.year = year;
    }

    public String getEncodedBy() {
        if (encodedBy != null) return encodedBy;
        ID3v23Frame frame = findFrame(frames, ENCODED_BY);
        if (frame == null) return encodedBy;
        this.encodedBy = ID3v23FrameFactory.readTextFrame(frame);
        return encodedBy;
    }

    public void setEncodedBy(String encodedBy) {
        ID3v23FrameFactory.writeTextFrame(this, ENCODED_BY, encodedBy);
        updateFrameBytes();
        this.encodedBy = encodedBy;
    }

    public String getSoftwareHardwareAndSettingsUsedForEncoding() {
        if (softwareHardwareAndSettingsUsedForEncoding != null) return softwareHardwareAndSettingsUsedForEncoding;
        ID3v23Frame frame = findFrame(frames, SOFTWARE_HARDWARE_AND_SETTINGS_USED_FOR_ENCODING);
        if (frame == null) return softwareHardwareAndSettingsUsedForEncoding;
        this.softwareHardwareAndSettingsUsedForEncoding = ID3v23FrameFactory.readTextFrame(frame);
        return softwareHardwareAndSettingsUsedForEncoding;
    }

    public void setSoftwareHardwareAndSettingsUsedForEncoding(String softwareHardwareAndSettingsUsedForEncoding) {
        ID3v23FrameFactory.writeTextFrame(this, SOFTWARE_HARDWARE_AND_SETTINGS_USED_FOR_ENCODING, softwareHardwareAndSettingsUsedForEncoding);
        updateFrameBytes();
        this.softwareHardwareAndSettingsUsedForEncoding = softwareHardwareAndSettingsUsedForEncoding;
    }

    public String getPlaylistDelay() {
        if (playlistDelay != null) return playlistDelay;
        ID3v23Frame frame = findFrame(frames, PLAYLIST_DELAY);
        if (frame == null) return playlistDelay;
        this.playlistDelay = ID3v23FrameFactory.readTextFrame(frame);
        return playlistDelay;
    }

    public void setPlaylistDelay(String playlistDelay) {
        ID3v23FrameFactory.writeTextFrame(this, PLAYLIST_DELAY, playlistDelay);
        updateFrameBytes();
        this.playlistDelay = playlistDelay;
    }

    public String getContentGroupDescription() {
        if (contentGroupDescription != null) return contentGroupDescription;
        ID3v23Frame frame = findFrame(frames, CONTENT_GROUP_DESCRIPTION);
        if (frame == null) return contentGroupDescription;
        this.contentGroupDescription = ID3v23FrameFactory.readTextFrame(frame);
        return contentGroupDescription;
    }

    public void setContentGroupDescription(String contentGroupDescription) {
        ID3v23FrameFactory.writeTextFrame(this, CONTENT_GROUP_DESCRIPTION, contentGroupDescription);
        updateFrameBytes();
        this.contentGroupDescription = contentGroupDescription;
    }

    public String getTitle() {
        if (title != null) return title;
        ID3v23Frame frame = findFrame(frames, TITLE_SONG_NAME_CONTENT_DESCRIPTION);
        if (frame == null) return title;
        this.title = ID3v23FrameFactory.readTextFrame(frame);
        return title;
    }

    public void setTitle(String title) {
        ID3v23FrameFactory.writeTextFrame(this, TITLE_SONG_NAME_CONTENT_DESCRIPTION, title);
        updateFrameBytes();
        this.title = title;
    }

    public String getSubtitleDescriptionRefinement() {
        if (subtitleDescriptionRefinement != null) return subtitleDescriptionRefinement;
        ID3v23Frame frame = findFrame(frames, SUBTITLE_DESCRIPTION_REFINEMENT);
        if (frame == null) return subtitleDescriptionRefinement;
        this.subtitleDescriptionRefinement = ID3v23FrameFactory.readTextFrame(frame);
        return subtitleDescriptionRefinement;
    }

    public void setSubtitleDescriptionRefinement(String subtitleDescriptionRefinement) {
        ID3v23FrameFactory.writeTextFrame(this, SUBTITLE_DESCRIPTION_REFINEMENT, subtitleDescriptionRefinement);
        updateFrameBytes();
        this.subtitleDescriptionRefinement = subtitleDescriptionRefinement;
    }

    public String getAlbum() {
        if (album != null) return album;
        ID3v23Frame frame = findFrame(frames, ALBUM_MOVIE_SHOW_TITLE);
        if (frame == null) return album;
        this.album = ID3v23FrameFactory.readTextFrame(frame);
        return album;
    }

    public void setAlbum(String album) {
        ID3v23FrameFactory.writeTextFrame(this, ALBUM_MOVIE_SHOW_TITLE, album);
        updateFrameBytes();
        this.album = album;
    }

    public String getLanguage() {
        if (language != null) return language;
        ID3v23Frame frame = findFrame(frames, LANGUAGE);
        if (frame == null) return language;
        this.language = ID3v23FrameFactory.readTextFrame(frame);
        return language;
    }

    public void setLanguage(String language) {
        ID3v23FrameFactory.writeTextFrame(this, LANGUAGE, language);
        updateFrameBytes();
        this.language = language;
    }

    public String getLength() {
        if (length != null) return length;
        ID3v23Frame frame = findFrame(frames, LENGTH);
        if (frame == null) return length;
        this.length = ID3v23FrameFactory.readTextFrame(frame);
        return length;
    }

    public void setLength(String length) {
        ID3v23FrameFactory.writeTextFrame(this, LENGTH, length);
        updateFrameBytes();
        this.length = length;
    }

    public int getSize() {
        if (size != -1) return size;
        ID3v23Frame frame = findFrame(frames, SIZE);
        if (frame == null) return -1;
        String bpm = ID3v23FrameFactory.readTextFrame(frame);
        this.size = Integer.valueOf(bpm);
        return this.size;
    }

    public void setSize(int size) {
        ID3v23FrameFactory.writeTextFrame(this, SIZE, size);
        updateFrameBytes();
        this.size = size;
    }

    public String getFileType() {
        if (fileType != null) return fileType;
        ID3v23Frame frame = findFrame(frames, FILE_TYPE);
        if (frame == null) return fileType;
        this.fileType = ID3v23FrameFactory.readTextFrame(frame);
        return fileType;
    }

    public void setFileType(String fileType) {
        ID3v23FrameFactory.writeTextFrame(this, FILE_TYPE, fileType);
        updateFrameBytes();
        this.fileType = fileType;
    }

    public String getMediaType() {
        if (mediaType != null) return mediaType;
        ID3v23Frame frame = findFrame(frames, MEDIA_TYPE);
        if (frame == null) return mediaType;
        this.mediaType = ID3v23FrameFactory.readTextFrame(frame);
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        ID3v23FrameFactory.writeTextFrame(this, MEDIA_TYPE, mediaType);
        updateFrameBytes();
        this.mediaType = mediaType;
    }

    public String getLeadPerformerSoloists() {
        if (leadPerformerSoloists != null) return leadPerformerSoloists;
        ID3v23Frame frame = findFrame(frames, LEAD_PERFORMERS_SOLOISTS);
        if (frame == null) return leadPerformerSoloists;
        this.leadPerformerSoloists = ID3v23FrameFactory.readTextFrame(frame);
        return leadPerformerSoloists;
    }

    public void setLeadPerformerSoloists(String leadPerformerSoloists) {
        ID3v23FrameFactory.writeTextFrame(this, LEAD_PERFORMERS_SOLOISTS, leadPerformerSoloists);
        updateFrameBytes();
        this.leadPerformerSoloists = leadPerformerSoloists;
    }

    public String getBandOrchestraAccompaniment() {
        if (bandOrchestraAccompaniment != null) return bandOrchestraAccompaniment;
        ID3v23Frame frame = findFrame(frames, BAND_ORCHESTRA_ACCOMPANIMENT);
        if (frame == null) return bandOrchestraAccompaniment;
        this.bandOrchestraAccompaniment = ID3v23FrameFactory.readTextFrame(frame);
        return bandOrchestraAccompaniment;
    }

    public void setBandOrchestraAccompaniment(String bandOrchestraAccompaniment) {
        ID3v23FrameFactory.writeTextFrame(this, BAND_ORCHESTRA_ACCOMPANIMENT, bandOrchestraAccompaniment);
        updateFrameBytes();
        this.bandOrchestraAccompaniment = bandOrchestraAccompaniment;
    }

    public String getConductorPerformerRefinement() {
        if (conductorPerformerRefinement != null) return conductorPerformerRefinement;
        ID3v23Frame frame = findFrame(frames, CONDUCTOR_PERFORMER_REFINEMENT);
        if (frame == null) return conductorPerformerRefinement;
        this.conductorPerformerRefinement = ID3v23FrameFactory.readTextFrame(frame);
        return conductorPerformerRefinement;
    }

    public void setConductorPerformerRefinement(String conductorPerformerRefinement) {
        ID3v23FrameFactory.writeTextFrame(this, CONDUCTOR_PERFORMER_REFINEMENT, conductorPerformerRefinement);
        updateFrameBytes();
        this.conductorPerformerRefinement = conductorPerformerRefinement;
    }

    public String getRemixedBy() {
        if (remixedBy != null) return remixedBy;
        ID3v23Frame frame = findFrame(frames, INTERPRETED_REMIXED_OR_OTHERWISE_MODIFIED_BY);
        if (frame == null) return remixedBy;
        this.remixedBy = ID3v23FrameFactory.readTextFrame(frame);
        return remixedBy;
    }

    public void setRemixedBy(String remixedBy) {
        ID3v23FrameFactory.writeTextFrame(this, INTERPRETED_REMIXED_OR_OTHERWISE_MODIFIED_BY, remixedBy);
        updateFrameBytes();
        this.remixedBy = remixedBy;
    }

    public String getComposer() {
        if (composer != null) return composer;
        ID3v23Frame frame = findFrame(frames, COMPOSER);
        if (frame == null) return composer;
        this.composer = ID3v23FrameFactory.readTextFrame(frame);
        return composer;
    }

    public void setComposer(String composer) {
        ID3v23FrameFactory.writeTextFrame(this, COMPOSER, composer);
        updateFrameBytes();
        this.composer = composer;
    }

    public String getLyricistTextWriter() {
        if (lyricistTextWriter != null) return lyricistTextWriter;
        ID3v23Frame frame = findFrame(frames, LYRICIST_TEXT_WRITER);
        if (frame == null) return lyricistTextWriter;
        this.lyricistTextWriter = ID3v23FrameFactory.readTextFrame(frame);
        return lyricistTextWriter;
    }

    public void setLyricistTextWriter(String lyricistTextWriter) {
        ID3v23FrameFactory.writeTextFrame(this, LYRICIST_TEXT_WRITER, lyricistTextWriter);
        updateFrameBytes();
        this.lyricistTextWriter = lyricistTextWriter;
    }

    public String getInvolvedPeopleList() {
        if (involvedPeopleList != null) return involvedPeopleList;
        ID3v23Frame frame = findFrame(frames, INVOLVED_PEOPLE_LIST);
        if (frame == null) return involvedPeopleList;
        this.involvedPeopleList = ID3v23FrameFactory.readTextFrame(frame);
        return involvedPeopleList;
    }

    public void setInvolvedPeopleList(String involvedPeopleList) {
        ID3v23FrameFactory.writeTextFrame(this, INVOLVED_PEOPLE_LIST, involvedPeopleList);
        updateFrameBytes();
        this.involvedPeopleList = involvedPeopleList;
    }

    public String getOriginalAlbumMovieShowTitle() {
        if (originalAlbumMovieShowTitle != null) return originalAlbumMovieShowTitle;
        ID3v23Frame frame = findFrame(frames, ORIGINAL_ALBUM_MOVIE_SHOW_TITLE);
        if (frame == null) return originalAlbumMovieShowTitle;
        this.originalAlbumMovieShowTitle = ID3v23FrameFactory.readTextFrame(frame);
        return originalAlbumMovieShowTitle;
    }

    public void setOriginalAlbumMovieShowTitle(String originalAlbumMovieShowTitle) {
        ID3v23FrameFactory.writeTextFrame(this, ORIGINAL_ALBUM_MOVIE_SHOW_TITLE, originalAlbumMovieShowTitle);
        updateFrameBytes();
        this.originalAlbumMovieShowTitle = originalAlbumMovieShowTitle;
    }

    public String getOriginalFilename() {
        if (originalFilename != null) return originalFilename;
        ID3v23Frame frame = findFrame(frames, ORIGINAL_FILENAME);
        if (frame == null) return originalFilename;
        this.originalFilename = ID3v23FrameFactory.readTextFrame(frame);
        return originalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        ID3v23FrameFactory.writeTextFrame(this, ORIGINAL_FILENAME, originalFilename);
        updateFrameBytes();
        this.originalFilename = originalFilename;
    }

    public String getOriginalLyricistsTextWriters() {
        if (originalLyricistsTextWriters != null) return originalLyricistsTextWriters;
        ID3v23Frame frame = findFrame(frames, ORIGINAL_LYRICISTS_TEXT_WRITERS);
        if (frame == null) return originalLyricistsTextWriters;
        this.originalLyricistsTextWriters = ID3v23FrameFactory.readTextFrame(frame);
        return originalLyricistsTextWriters;
    }

    public void setOriginalLyricistsTextWriters(String originalLyricistsTextWriters) {
        ID3v23FrameFactory.writeTextFrame(this, ORIGINAL_LYRICISTS_TEXT_WRITERS, originalLyricistsTextWriters);
        updateFrameBytes();
        this.originalLyricistsTextWriters = originalLyricistsTextWriters;
    }

    public String getOriginalArtistsPerformers() {
        if (originalArtistsPerformers != null) return originalArtistsPerformers;
        ID3v23Frame frame = findFrame(frames, ORIGINAL_ARTISTS_PERFORMERS);
        if (frame == null) return originalArtistsPerformers;
        this.originalArtistsPerformers = ID3v23FrameFactory.readTextFrame(frame);
        return originalArtistsPerformers;
    }

    public void setOriginalArtistsPerformers(String originalArtistsPerformers) {
        ID3v23FrameFactory.writeTextFrame(this, ORIGINAL_ARTISTS_PERFORMERS, originalArtistsPerformers);
        updateFrameBytes();
        this.originalArtistsPerformers = originalArtistsPerformers;
    }

    public String getOriginalReleaseYear() {
        if (originalReleaseYear != null) return originalReleaseYear;
        ID3v23Frame frame = findFrame(frames, ORIGINAL_RELEASE_YEAR);
        if (frame == null) return originalReleaseYear;
        this.originalReleaseYear = ID3v23FrameFactory.readTextFrame(frame);
        return originalReleaseYear;
    }

    public void setOriginalReleaseYear(String originalReleaseYear) {
        ID3v23FrameFactory.writeTextFrame(this, ORIGINAL_RELEASE_YEAR, originalReleaseYear);
        updateFrameBytes();
        this.originalReleaseYear = originalReleaseYear;
    }

    public String getTrackNumberPositionInSet() {
        if (trackNumberPositionInSet != null) return trackNumberPositionInSet;
        ID3v23Frame frame = findFrame(frames, TRACK_NUMBER_POSITION_IN_SET);
        if (frame == null) return trackNumberPositionInSet;
        this.trackNumberPositionInSet = ID3v23FrameFactory.readTextFrame(frame);
        return trackNumberPositionInSet;
    }

    public void setTrackNumberPositionInSet(String trackNumberPositionInSet) {
        ID3v23FrameFactory.writeTextFrame(this, TRACK_NUMBER_POSITION_IN_SET, trackNumberPositionInSet);
        updateFrameBytes();
        this.trackNumberPositionInSet = trackNumberPositionInSet;
    }

    public String getPartOfSet() {
        if (partOfSet != null) return partOfSet;
        ID3v23Frame frame = findFrame(frames, PART_OF_A_SET);
        if (frame == null) return partOfSet;
        this.partOfSet = ID3v23FrameFactory.readTextFrame(frame);
        return partOfSet;
    }

    public void setPartOfSet(String partOfSet) {
        ID3v23FrameFactory.writeTextFrame(this, PART_OF_A_SET, partOfSet);
        updateFrameBytes();
        this.partOfSet = partOfSet;
    }

    public String getPublisher() {
        if (publisher != null) return publisher;
        ID3v23Frame frame = findFrame(frames, PUBLISHER);
        if (frame == null) return publisher;
        this.publisher = ID3v23FrameFactory.readTextFrame(frame);
        return publisher;
    }

    public void setPublisher(String publisher) {
        ID3v23FrameFactory.writeTextFrame(this, PUBLISHER, publisher);
        updateFrameBytes();
        this.publisher = publisher;
    }

    public String getInternationalStandardRecordingCode() {
        if (internationalStandardRecordingCode != null) return internationalStandardRecordingCode;
        ID3v23Frame frame = findFrame(frames, INTERNATIONAL_STANDARD_RECORDING_CODE);
        if (frame == null) return internationalStandardRecordingCode;
        this.internationalStandardRecordingCode = ID3v23FrameFactory.readTextFrame(frame);
        return internationalStandardRecordingCode;
    }

    public void setInternationalStandardRecordingCode(String internationalStandardRecordingCode) {
        ID3v23FrameFactory.writeTextFrame(this, INTERNATIONAL_STANDARD_RECORDING_CODE, internationalStandardRecordingCode);
        updateFrameBytes();
        this.internationalStandardRecordingCode = internationalStandardRecordingCode;
    }

    public String getFileOwnerLicence() {
        if (fileOwnerLicence != null) return fileOwnerLicence;
        ID3v23Frame frame = findFrame(frames, FILE_OWNER_LICENCE);
        if (frame == null) return fileOwnerLicence;
        this.fileOwnerLicence = ID3v23FrameFactory.readTextFrame(frame);
        return fileOwnerLicence;
    }

    public void setFileOwnerLicence(String fileOwnerLicence) {
        ID3v23FrameFactory.writeTextFrame(this, FILE_OWNER_LICENCE, fileOwnerLicence);
        updateFrameBytes();
        this.fileOwnerLicence = fileOwnerLicence;
    }

    public String getInternetRadioStationName() {
        if (internetRadioStationName != null) return internetRadioStationName;
        ID3v23Frame frame = findFrame(frames, INTERNET_RADIO_STATION_NAME);
        if (frame == null) return internetRadioStationName;
        this.internetRadioStationName = ID3v23FrameFactory.readTextFrame(frame);
        return internetRadioStationName;
    }

    public void setInternetRadioStationName(String internetRadioStationName) {
        ID3v23FrameFactory.writeTextFrame(this, INTERNET_RADIO_STATION_NAME, internetRadioStationName);
        updateFrameBytes();
        this.internetRadioStationName = internetRadioStationName;
    }

    public String getInternetRadioStationOwner() {
        if (internetRadioStationOwner != null) return internetRadioStationOwner;
        ID3v23Frame frame = findFrame(frames, INTERNET_RADIO_STATION_OWNER);
        if (frame == null) return internetRadioStationOwner;
        this.internetRadioStationOwner = ID3v23FrameFactory.readTextFrame(frame);
        return internetRadioStationOwner;
    }

    public void setInternetRadioStationOwner(String internetRadioStationOwner) {
        ID3v23FrameFactory.writeTextFrame(this, INTERNET_RADIO_STATION_OWNER, internetRadioStationOwner);
        updateFrameBytes();
        this.internetRadioStationOwner = internetRadioStationOwner;
    }

    /**
     * Finds a frame from the ID.
     *
     * @param frames The list of frames being searched through.
     * @param id The ID of the frame being searched for.
     * @return The ID3v24 frame.
     */
    private static ID3v23Frame findFrame(ArrayList<ID3v23Frame> frames, String id) {
        for (ID3v23Frame f : frames) {
            if (f.getId().equals(id)) return f;
        }
        return null;
    }

    /**
     * Updates the tag bytes to be in sync with frame data.
     */
    private void updateFrameBytes() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        try {
            outputStream.flush();
            outputStream.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (ID3v23Frame f : frames) {
            try {
                outputStream.write(f.getFrame());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        frameBytes = outputStream.toByteArray();

        try {
            outputStream.flush();
            outputStream.reset();
            outputStream.write(header.getBytes());
            outputStream.write(frameBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        tagBytes = outputStream.toByteArray();
    }

    public String toString() {
        String string = "ID3v23 Data Read:\n\n";

        if (audioEncryption != null) string += "audioEncryption: " + audioEncryption + "\n";
        if (attachedPicture != null) string += "attachedPicture: " + attachedPicture + "\n";
        if (comments != null) string += "comments: " + comments + "\n";
        if (commercial != null) string += "commercial: " + commercial + "\n";
        if (equalization != null) string += "equalization: " + equalization + "\n";
        if (eventTimingCodes != null) string += "eventTimingCodes: " + eventTimingCodes + "\n";
        if (generalEncapsulatedObject != null) string += "generalEncapsulatedObject: " + generalEncapsulatedObject + "\n";
        if (linkedInformation != null) string += "linkedInformation: " + linkedInformation + "\n";
        if (musicCDIdentifier != null) string += "musicCDIdentifier: " + musicCDIdentifier + "\n";
        if (mpegLocationLookupTable != null) string += "mpegLocationLookupTable: " + mpegLocationLookupTable + "\n";
        if (ownership != null) string += "ownership: " + ownership + "\n";
        if (playCounter != -1) string += "playCounter: " + playCounter + "\n";
        if (popularimeter != -1) string += "popularimeter: " + popularimeter + "\n";
        if (recommendedBufferSize != null) string += "recommendedBufferSize: " + recommendedBufferSize + "\n";
        if (relativeVolumeAdjustment != null) string += "relativeVolumeAdjustment: " + relativeVolumeAdjustment + "\n";
        if (reverb != null) string += "reverb: " + reverb + "\n";
        if (synchronizedLyricText != null) string += "synchronizedLyricText: " + synchronizedLyricText + "\n";
        if (synchronizedTempoCodes != null) string += "synchronizedTempoCodes: " + synchronizedTempoCodes + "\n";
        if (bpm != -1) string += "bpm: " + bpm + "\n";
        if (initialKey != null) string += "initialKey: " + initialKey + "\n";
        if (contentType != null) string += "contentType: " + contentType + "\n";
        if (copyrightMessage != null) string += "copyrightMessage: " + copyrightMessage + "\n";
        if (date != null) string += "date: " + date + "\n";
        if (recordingDates != null) string += "recordingDates: " + recordingDates + "\n";
        if (time != null) string += "time: " + time + "\n";
        if (year != -1) string += "year: " + year + "\n";
        if (encodedBy != null) string += "encodedBy: " + encodedBy + "\n";
        if (softwareHardwareAndSettingsUsedForEncoding != null) string += "softwareHardwareAndSettingsUsedForEncoding: " + softwareHardwareAndSettingsUsedForEncoding + "\n";
        if (playlistDelay != null) string += "playlistDelay: " + playlistDelay + "\n";
        if (contentGroupDescription != null) string += "contentGroupDescription: " + contentGroupDescription + "\n";
        if (title != null) string += "title: " + title + "\n";
        if (subtitleDescriptionRefinement != null) string += "subtitleDescriptionRefinement: " + subtitleDescriptionRefinement + "\n";
        if (album != null) string += "album: " + album + "\n";
        if (language != null) string += "language: " + language + "\n";
        if (length != null) string += "length: " + length + "\n";
        if (fileType != null) string += "fileType: " + fileType + "\n";
        if (mediaType != null) string += "mediaType: " + mediaType + "\n";
        if (leadPerformerSoloists != null) string += "leadPerformerSoloists: " + leadPerformerSoloists + "\n";
        if (bandOrchestraAccompaniment != null) string += "bandOrchestraAccompaniment: " + bandOrchestraAccompaniment + "\n";
        if (conductorPerformerRefinement != null) string += "conductorPerformerRefinement: " + conductorPerformerRefinement + "\n";
        if (remixedBy != null) string += "remixedBy: " + remixedBy + "\n";
        if (composer != null) string += "composer: " + composer + "\n";
        if (lyricistTextWriter != null) string += "lyricistTextWriter: " + lyricistTextWriter + "\n";
        if (involvedPeopleList != null) string += "involvedPeopleList: " + involvedPeopleList + "\n";
        if (originalAlbumMovieShowTitle != null) string += "originalAlbumMovieShowTitle: " + originalAlbumMovieShowTitle + "\n";
        if (originalFilename != null) string += "originalFilename: " + originalFilename + "\n";
        if (originalLyricistsTextWriters != null) string += "originalLyricistsTextWriters: " + originalLyricistsTextWriters + "\n";
        if (originalArtistsPerformers!= null) string += "originalArtistsPerformers: " + originalArtistsPerformers + "\n";
        if (originalReleaseYear != null) string += "originalReleaseYear: " + originalReleaseYear + "\n";
        if (trackNumberPositionInSet != null) string += "trackNumberPositionInSet: " + trackNumberPositionInSet + "\n";
        if (partOfSet != null) string += "partOfSet: " + partOfSet + "\n";
        if (publisher != null) string += "publisher: " + publisher + "\n";
        if (internationalStandardRecordingCode != null) string += "internationalStandardRecordingCode: " + internationalStandardRecordingCode + "\n";
        if (userDefinedTextInformationFrame != null) string += "userDefinedTextInformationFrame: " + userDefinedTextInformationFrame + "\n";
        if (uniqueFileIdentifier != null) string += "uniqueFileIdentifier: " + uniqueFileIdentifier + "\n";
        if (termsOfUse != null) string += "termsOfUse: " + termsOfUse + "\n";
        if (unsynchronizedLyricTextTranscription != null) string += "unsynchronizedLyricTextTranscription: " + unsynchronizedLyricTextTranscription + "\n";
        if (commercialInformation != null) string += "commercialInformation: " + commercialInformation + "\n";
        if (copyrightLegalInformation != null) string += "copyrightLegalInformation: " + copyrightLegalInformation + "\n";
        if (officialAudioFileWebpage != null) string += "officialAudioFileWebpage: " + officialAudioFileWebpage + "\n";
        if (officialArtistPerformerWebpage != null) string += "officialArtistPerformerWebpage: " + officialArtistPerformerWebpage + "\n";
        if (officialAudioSourceWebpage != null) string += "officialAudioSourceWebpage: " + officialAudioSourceWebpage + "\n";
        if (publishersOfficialWebpage != null) string += "publishersOfficialWebpage: " + publishersOfficialWebpage + "\n";
        if (userDefinedURLLink != null) string += "userDefinedURLLink: " + userDefinedURLLink + "\n";

        return string;
    }
}