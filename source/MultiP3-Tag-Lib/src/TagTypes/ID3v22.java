package TagTypes;

import FileTypes.MP3;
import Utilities.ByteUtilities;

//TODO - JavaDoc
public class ID3v22 extends AbstractID3v2 {

    private String[] tempoCodes;
    private String[] leadArtistsLeadPerformersSoloistsPerformingGroup;

    //TODO - JavaDoc
    public ID3v22(MP3 mp3) {
        initTag(mp3);
    }

    //TODO - JavaDoc
    public void initTag(MP3 mp3) {
        bytes = ByteUtilities.getID3v22Bytes(mp3);
    }

    //TODO - JavaDoc
    public String[] getTempoCodes() {
        return tempoCodes;
    }

    //TODO - JavaDoc
    public void setTempoCodes(String[] tempoCodes) {
        this.tempoCodes = tempoCodes;
    }

    //TODO - JavaDoc
    public String[] getLeadArtistsLeadPerformersSoloistsPerformingGroup() {
        return leadArtistsLeadPerformersSoloistsPerformingGroup;
    }

    //TODO - JavaDoc
    public void setLeadArtistsLeadPerformersSoloistsPerformingGroup(String[] leadArtistsLeadPerformersSoloistsPerformingGroup) {
        this.leadArtistsLeadPerformersSoloistsPerformingGroup = leadArtistsLeadPerformersSoloistsPerformingGroup;
    }
}