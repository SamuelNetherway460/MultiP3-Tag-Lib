package TagTypes;

import FileTypes.MP3;
import Utilities.ByteUtilities;

//TODO - JavaDoc
public class ID3v23 extends AbstractID3v2 {

    protected String commercial = null;
    protected String encryptionMethodRegistration = null;
    protected String groupIdentificationRegistration = null;
    protected String ownership = null;
    protected String positionSynchronisation = null;
    protected String privateField = null;
    protected String[] synchronizedTempoCodes = null;
    protected String fileOwnerLicence = null;
    protected String leadPerformersSoloists = null;
    protected String internetRadioStationName = null;
    protected String internetRadioStationOwner = null;
    protected String termsOfUse = null;
    protected String commercialInformation = null;
    protected String copyrightLegalInformation = null;
    protected String officialInternetRadioStationHomepage = null;
    protected String payment = null;
    protected String publishersOfficialWebpage = null;

    //TODO - JavaDoc
    public ID3v23(MP3 mp3) {
        initTag(mp3);
    }

    //TODO - JavaDoc
    public void initTag(MP3 mp3) {
        bytes = ByteUtilities.getID3v23Bytes(mp3);
    }

    //TODO - JavaDoc
    public String getCommercial() {
        return commercial;
    }

    //TODO - JavaDoc
    public void setCommercial(String commercial) {
        this.commercial = commercial;
    }

    //TODO - JavaDoc
    public String getEncryptionMethodRegistration() {
        return encryptionMethodRegistration;
    }

    //TODO - JavaDoc
    public void setEncryptionMethodRegistration(String encryptionMethodRegistration) {
        this.encryptionMethodRegistration = encryptionMethodRegistration;
    }

    //TODO - JavaDoc
    public String getGroupIdentificationRegistration() {
        return groupIdentificationRegistration;
    }

    //TODO - JavaDoc
    public void setGroupIdentificationRegistration(String groupIdentificationRegistration) {
        this.groupIdentificationRegistration = groupIdentificationRegistration;
    }

    //TODO - JavaDoc
    public String getOwnership() {
        return ownership;
    }

    //TODO - JavaDoc
    public void setOwnership(String ownership) {
        this.ownership = ownership;
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
    public String getPositionSynchronisation() {
        return positionSynchronisation;
    }

    //TODO - JavaDoc
    public void setPositionSynchronisation(String positionSynchronisation) {
        this.positionSynchronisation = positionSynchronisation;
    }

    //TODO - JavaDoc
    public String getPrivateField() {
        return privateField;
    }

    //TODO - JavaDoc
    public void setPrivateField(String privateField) {
        this.privateField = privateField;
    }

    //TODO - JavaDoc
    public String[] getSynchronizedTempoCodes() {
        return synchronizedTempoCodes;
    }

    //TODO - JavaDoc
    public void setSynchronizedTempoCodes(String[] synchronizedTempoCodes) {
        this.synchronizedTempoCodes = synchronizedTempoCodes;
    }

    //TODO - JavaDoc
    public String getFileOwnerLicence() {
        return fileOwnerLicence;
    }

    //TODO - JavaDoc
    public void setFileOwnerLicence(String fileOwnerLicence) {
        this.fileOwnerLicence = fileOwnerLicence;
    }

    //TODO - JavaDoc
    public String getLeadPerformersSoloists() {
        return leadPerformersSoloists;
    }

    //TODO - JavaDoc
    public void setLeadPerformersSoloists(String leadPerformersSoloists) {
        this.leadPerformersSoloists = leadPerformersSoloists;
    }

    //TODO - JavaDoc
    public String getInternetRadioStationName() {
        return internetRadioStationName;
    }

    //TODO - JavaDoc
    public void setInternetRadioStationName(String internetRadioStationName) {
        this.internetRadioStationName = internetRadioStationName;
    }

    //TODO - JavaDoc
    public String getInternetRadioStationOwner() {
        return internetRadioStationOwner;
    }

    //TODO - JavaDoc
    public void setInternetRadioStationOwner(String internetRadioStationOwner) {
        this.internetRadioStationOwner = internetRadioStationOwner;
    }

    //TODO - JavaDoc
    public String getTermsOfUse() {
        return termsOfUse;
    }

    //TODO - JavaDoc
    public void setTermsOfUse(String termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    //TODO - JavaDoc
    public String getCommercialInformation() {
        return commercialInformation;
    }

    //TODO - JavaDoc
    public void setCommercialInformation(String commercialInformation) {
        this.commercialInformation = commercialInformation;
    }

    //TODO - JavaDoc
    public String getCopyrightLegalInformation() {
        return copyrightLegalInformation;
    }

    //TODO - JavaDoc
    public void setCopyrightLegalInformation(String copyrightLegalInformation) {
        this.copyrightLegalInformation = copyrightLegalInformation;
    }

    //TODO - JavaDoc
    public String getOfficialInternetRadioStationHomepage() {
        return officialInternetRadioStationHomepage;
    }

    //TODO - JavaDoc
    public void setOfficialInternetRadioStationHomepage(String officialInternetRadioStationHomepage) {
        this.officialInternetRadioStationHomepage = officialInternetRadioStationHomepage;
    }

    //TODO - JavaDoc
    public String getPayment() {
        return payment;
    }

    //TODO - JavaDoc
    public void setPayment(String payment) {
        this.payment = payment;
    }

    //TODO - JavaDoc
    public String getPublishersOfficialWebpage() {
        return publishersOfficialWebpage;
    }

    //TODO - JavaDoc
    public void setPublishersOfficialWebpage(String publishersOfficialWebpage) {
        this.publishersOfficialWebpage = publishersOfficialWebpage;
    }
}