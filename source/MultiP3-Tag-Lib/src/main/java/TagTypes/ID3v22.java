package TagTypes;

import Factories.ID3v22FrameFactory;
import TagStructures.ID3v22Frame;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import static Factories.ID3v22FrameFactory.*;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v22 extends ID3v2 {

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

    private int size = -1;
    private String encryptedMeta;

    private ArrayList<ID3v22Frame> frames;

    //TODO - JavaDoc
    public ID3v22() {

    }

    public ArrayList<ID3v22Frame> getFrames() {
        return frames;
    }

    public void setFrames(ArrayList<ID3v22Frame> frames) {
        this.frames = frames;
    }

    public int getBpm() {
        if (bpm != -1) return bpm;
        ID3v22Frame frame = findFrame(frames, BEATS_PER_MINUTE);
        if (frame == null) return -1;
        String bpm = ID3v22FrameFactory.readTextFrame(frame);
        this.bpm = Integer.valueOf(bpm);
        return this.bpm;
    }

    public String getInitialKey() {
        if (initialKey != null) return initialKey;
        ID3v22Frame frame = findFrame(frames, INITIAL_KEY);
        if (frame == null) return initialKey;
        this.initialKey = ID3v22FrameFactory.readTextFrame(frame);
        return initialKey;
    }

    public String getContentType() {
        if (contentType != null) return contentType;
        ID3v22Frame frame = findFrame(frames, CONTENT_TYPE);
        if (frame == null) return contentType;
        this.contentType = ID3v22FrameFactory.readTextFrame(frame);
        return contentType;
    }

    public String getCopyrightMessage() {
        if (copyrightMessage != null) return copyrightMessage;
        ID3v22Frame frame = findFrame(frames, COPYRIGHT_MESSAGE);
        if (frame == null) return copyrightMessage;
        this.copyrightMessage = ID3v22FrameFactory.readTextFrame(frame);
        return copyrightMessage;
    }

    public String getDate() {
        if (date != null) return date;
        ID3v22Frame frame = findFrame(frames, DATE);
        if (frame == null) return date;
        this.date = ID3v22FrameFactory.readTextFrame(frame);
        return date;
    }

    public String getRecordingDates() {
        if (recordingDates != null) return recordingDates;
        ID3v22Frame frame = findFrame(frames, RECORDING_DATES);
        if (frame == null) return recordingDates;
        this.recordingDates = ID3v22FrameFactory.readTextFrame(frame);
        return recordingDates;
    }

    public String getTime() {
        if (time != null) return time;
        ID3v22Frame frame = findFrame(frames, TIME);
        if (frame == null) return time;
        this.time = ID3v22FrameFactory.readTextFrame(frame);
        return time;
    }

    public int getYear() {
        if (year != -1) return year;
        ID3v22Frame frame = findFrame(frames, YEAR);
        if (frame == null) return year;
        String year = ID3v22FrameFactory.readTextFrame(frame);
        this.year = Integer.valueOf(year);
        return this.year;
    }

    public String getEncodedBy() {
        if (encodedBy != null) return encodedBy;
        ID3v22Frame frame = findFrame(frames, ENCODED_BY);
        if (frame == null) return encodedBy;
        this.encodedBy = ID3v22FrameFactory.readTextFrame(frame);
        return encodedBy;
    }

    public String getSoftwareHardwareAndSettingsUsedForEncoding() {
        if (softwareHardwareAndSettingsUsedForEncoding != null) return softwareHardwareAndSettingsUsedForEncoding;
        ID3v22Frame frame = findFrame(frames, SOFTWARE_HARDWARE_AND_SETTINGS_USED_FOR_ENCODING);
        if (frame == null) return softwareHardwareAndSettingsUsedForEncoding;
        this.softwareHardwareAndSettingsUsedForEncoding = ID3v22FrameFactory.readTextFrame(frame);
        return softwareHardwareAndSettingsUsedForEncoding;
    }

    public String getPlaylistDelay() {
        if (playlistDelay != null) return playlistDelay;
        ID3v22Frame frame = findFrame(frames, PLAYLIST_DELAY);
        if (frame == null) return playlistDelay;
        this.playlistDelay = ID3v22FrameFactory.readTextFrame(frame);
        return playlistDelay;
    }

    public String getContentGroupDescription() {
        if (contentGroupDescription != null) return contentGroupDescription;
        ID3v22Frame frame = findFrame(frames, CONTENT_GROUP_DESCRIPTION);
        if (frame == null) return contentGroupDescription;
        this.contentGroupDescription = ID3v22FrameFactory.readTextFrame(frame);
        return contentGroupDescription;
    }

    public String getTitle() {
        if (title != null) return title;
        ID3v22Frame frame = findFrame(frames, TITLE_SONG_NAME_CONTENT_DESCRIPTION);
        if (frame == null) return title;
        this.title = ID3v22FrameFactory.readTextFrame(frame);
        return title;
    }

    public String getSubtitleDescriptionRefinement() {
        if (subtitleDescriptionRefinement != null) return subtitleDescriptionRefinement;
        ID3v22Frame frame = findFrame(frames, SUBTITLE_DESCRIPTION_REFINEMENT);
        if (frame == null) return subtitleDescriptionRefinement;
        this.subtitleDescriptionRefinement = ID3v22FrameFactory.readTextFrame(frame);
        return subtitleDescriptionRefinement;
    }

    public String getAlbum() {
        if (album != null) return album;
        ID3v22Frame frame = findFrame(frames, ALBUM_MOVIE_SHOW_TITLE);
        if (frame == null) return album;
        this.album = ID3v22FrameFactory.readTextFrame(frame);
        return album;
    }

    public String getLanguage() {
        if (language != null) return language;
        ID3v22Frame frame = findFrame(frames, LANGUAGES);
        if (frame == null) return language;
        this.language = ID3v22FrameFactory.readTextFrame(frame);
        return language;
    }

    public String getLength() {
        if (length != null) return length;
        ID3v22Frame frame = findFrame(frames, LENGTH);
        if (frame == null) return length;
        this.length = ID3v22FrameFactory.readTextFrame(frame);
        return length;
    }

    public int getSize() {
        if (size != -1) return size;
        ID3v22Frame frame = findFrame(frames, SIZE);
        if (frame == null) return size;
        String size = ID3v22FrameFactory.readTextFrame(frame);
        this.size = Integer.valueOf(size);
        return this.size;
    }

    public String getFileType() {
        if (fileType != null) return fileType;
        ID3v22Frame frame = findFrame(frames, FILE_TYPE);
        if (frame == null) return fileType;
        this.fileType = ID3v22FrameFactory.readTextFrame(frame);
        return fileType;
    }

    public String getMediaType() {
        if (mediaType != null) return mediaType;
        ID3v22Frame frame = findFrame(frames, MEDIA_TYPE);
        if (frame == null) return mediaType;
        this.mediaType = ID3v22FrameFactory.readTextFrame(frame);
        return mediaType;
    }

    public String getLeadPerformerSoloists() {
        if (leadPerformerSoloists != null) return leadPerformerSoloists;
        ID3v22Frame frame = findFrame(frames, LEAD_ARTISTS_LEAD_PERFORMERS_SOLOISTS_PERFORMING_GROUP);
        if (frame == null) return leadPerformerSoloists;
        this.leadPerformerSoloists = ID3v22FrameFactory.readTextFrame(frame);
        return leadPerformerSoloists;
    }

    public String getBandOrchestraAccompaniment() {
        if (bandOrchestraAccompaniment != null) return bandOrchestraAccompaniment;
        ID3v22Frame frame = findFrame(frames, BAND_ORCHESTRA_ACCOMPANIMENT);
        if (frame == null) return bandOrchestraAccompaniment;
        this.bandOrchestraAccompaniment = ID3v22FrameFactory.readTextFrame(frame);
        return bandOrchestraAccompaniment;
    }

    public String getConductorPerformerRefinement() {
        if (conductorPerformerRefinement != null) return conductorPerformerRefinement;
        ID3v22Frame frame = findFrame(frames, CONDUCTOR_PERFORMER_REFINEMENT);
        if (frame == null) return conductorPerformerRefinement;
        this.conductorPerformerRefinement = ID3v22FrameFactory.readTextFrame(frame);
        return conductorPerformerRefinement;
    }

    public String getRemixedBy() {
        if (remixedBy != null) return remixedBy;
        ID3v22Frame frame = findFrame(frames, INTERPRETED_REMIXED_OR_OTHERWISE_MODIFIED_BY);
        if (frame == null) return remixedBy;
        this.remixedBy = ID3v22FrameFactory.readTextFrame(frame);
        return remixedBy;
    }

    public String getComposer() {
        if (composer != null) return composer;
        ID3v22Frame frame = findFrame(frames, COMPOSER);
        if (frame == null) return composer;
        this.composer = ID3v22FrameFactory.readTextFrame(frame);
        return composer;
    }

    public String getLyricistTextWriter() {
        if (lyricistTextWriter != null) return lyricistTextWriter;
        ID3v22Frame frame = findFrame(frames, LYRICIST_TEXT_WRITER);
        if (frame == null) return lyricistTextWriter;
        this.lyricistTextWriter = ID3v22FrameFactory.readTextFrame(frame);
        return lyricistTextWriter;
    }

    public String getInvolvedPeopleList() {
        if (involvedPeopleList != null) return involvedPeopleList;
        ID3v22Frame frame = findFrame(frames, INVOLVED_PEOPLE_LIST);
        if (frame == null) return involvedPeopleList;
        this.involvedPeopleList = ID3v22FrameFactory.readTextFrame(frame);
        return involvedPeopleList;
    }

    public String getOriginalAlbumMovieShowTitle() {
        if (originalAlbumMovieShowTitle != null) return originalAlbumMovieShowTitle;
        ID3v22Frame frame = findFrame(frames, ORIGINAL_ALBUM_MOVIE_SHOW_TITLE);
        if (frame == null) return originalAlbumMovieShowTitle;
        this.originalAlbumMovieShowTitle = ID3v22FrameFactory.readTextFrame(frame);
        return originalAlbumMovieShowTitle;
    }

    public String getOriginalFilename() {
        if (originalFilename != null) return originalFilename;
        ID3v22Frame frame = findFrame(frames, ORIGINAL_FILENAME);
        if (frame == null) return originalFilename;
        this.originalFilename = ID3v22FrameFactory.readTextFrame(frame);
        return originalFilename;
    }

    public String getOriginalLyricistsTextWriters() {
        if (originalLyricistsTextWriters != null) return originalLyricistsTextWriters;
        ID3v22Frame frame = findFrame(frames, ORIGINAL_LYRICISTS_TEXT_WRITERS);
        if (frame == null) return originalLyricistsTextWriters;
        this.originalLyricistsTextWriters = ID3v22FrameFactory.readTextFrame(frame);
        return originalLyricistsTextWriters;
    }

    public String getOriginalArtistsPerformers() {
        if (originalArtistsPerformers != null) return originalArtistsPerformers;
        ID3v22Frame frame = findFrame(frames, ORIGINAL_ARTISTS_PERFORMERS);
        if (frame == null) return originalArtistsPerformers;
        this.originalArtistsPerformers = ID3v22FrameFactory.readTextFrame(frame);
        return originalArtistsPerformers;
    }

    public String getOriginalReleaseYear() {
        if (originalReleaseYear != null) return originalReleaseYear;
        ID3v22Frame frame = findFrame(frames, ORIGINAL_RELEASE_YEAR);
        if (frame == null) return originalArtistsPerformers;
        this.originalReleaseYear = ID3v22FrameFactory.readTextFrame(frame);
        return originalReleaseYear;
    }

    public String getTrackNumberPositionInSet() {
        if (trackNumberPositionInSet != null) return trackNumberPositionInSet;
        ID3v22Frame frame = findFrame(frames, TRACK_NUMBER_POSITION_IN_SET);
        if (frame == null) return trackNumberPositionInSet;
        this.trackNumberPositionInSet = ID3v22FrameFactory.readTextFrame(frame);
        return trackNumberPositionInSet;
    }

    public String getPartOfSet() {
        if (partOfSet != null) return partOfSet;
        ID3v22Frame frame = findFrame(frames, PART_OF_A_SET);
        if (frame == null) return partOfSet;
        this.partOfSet = ID3v22FrameFactory.readTextFrame(frame);
        return partOfSet;
    }

    public String getPublisher() {
        if (publisher != null) return publisher;
        ID3v22Frame frame = findFrame(frames, PUBLISHER);
        if (frame == null) return publisher;
        this.publisher = ID3v22FrameFactory.readTextFrame(frame);
        return publisher;
    }

    public String getInternationalStandardRecordingCode() {
        if (internationalStandardRecordingCode != null) return internationalStandardRecordingCode;
        ID3v22Frame frame = findFrame(frames, INTERNATIONAL_STANDARD_RECORDING_CODE);
        if (frame == null) return internationalStandardRecordingCode;
        this.internationalStandardRecordingCode = ID3v22FrameFactory.readTextFrame(frame);
        return internationalStandardRecordingCode;
    }

    /**
     * Finds a frame from the ID.
     *
     * @param frames The list of frames being searched through.
     * @param id The ID of the frame being searched for.
     * @return The ID3v24 frame.
     */
    private static ID3v22Frame findFrame(ArrayList<ID3v22Frame> frames, String id) {
        for (ID3v22Frame f : frames) {
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

        for (ID3v22Frame f : frames) {
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
}