package TestFileTypes.MP3.ID3.ID3v1.ID3v10;

import DataStore.Genres;
import Exceptions.InvalidGenreException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ID3v1Genres {

    @Test
    @DisplayName("Should return Blues ID3v1 genre")
    void shouldReturnBluesGenre() {
        Assertions.assertEquals("Blues", Genres.ID3V1_TAG_GENRES[0]);
    }

    @Test
    @DisplayName("Should return Blues ID3v1 genre index")
    void shouldReturnBluesGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(0, Genres.convertStringGenreToIndexID3v1("Blues"));
    }

    @Test
    @DisplayName("Should return Classic Rock ID3v1 genre")
    void shouldReturnClassicRockGenre() {
        Assertions.assertEquals("Classic Rock", Genres.ID3V1_TAG_GENRES[1]);
    }

    @Test
    @DisplayName("Should return Classic Rock ID3v1 genre index")
    void shouldReturnClassicRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(1, Genres.convertStringGenreToIndexID3v1("Classic Rock"));
    }

    @Test
    @DisplayName("Should return Country ID3v1 genre")
    void shouldReturnCountryGenre() {
        Assertions.assertEquals("Country", Genres.ID3V1_TAG_GENRES[2]);
    }

    @Test
    @DisplayName("Should return Country ID3v1 genre index")
    void shouldReturnCountryGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(2, Genres.convertStringGenreToIndexID3v1("Country"));
    }

    @Test
    @DisplayName("Should return Dance ID3v1 genre")
    void shouldReturnDanceGenre() {
        Assertions.assertEquals("Dance", Genres.ID3V1_TAG_GENRES[3]);
    }

    @Test
    @DisplayName("Should return Dance ID3v1 genre index")
    void shouldReturnDanceGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(3, Genres.convertStringGenreToIndexID3v1("Dance"));
    }

    @Test
    @DisplayName("Should return Disco ID3v1 genre")
    void shouldReturnDiscoGenre() {
        Assertions.assertEquals("Disco", Genres.ID3V1_TAG_GENRES[4]);
    }

    @Test
    @DisplayName("Should return Disco ID3v1 genre index")
    void shouldReturnDiscoGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(4, Genres.convertStringGenreToIndexID3v1("Disco"));
    }

    @Test
    @DisplayName("Should return Funk ID3v1 genre")
    void shouldReturnFunkGenre() {
        Assertions.assertEquals("Funk", Genres.ID3V1_TAG_GENRES[5]);
    }

    @Test
    @DisplayName("Should return Funk ID3v1 genre index")
    void shouldReturnFunkGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(5, Genres.convertStringGenreToIndexID3v1("Funk"));
    }

    @Test
    @DisplayName("Should return Grunge ID3v1 genre")
    void shouldReturnGrungeGenre() {
        Assertions.assertEquals("Grunge", Genres.ID3V1_TAG_GENRES[6]);
    }

    @Test
    @DisplayName("Should return Grunge ID3v1 genre index")
    void shouldReturnGrungeGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(6, Genres.convertStringGenreToIndexID3v1("Grunge"));
    }

    @Test
    @DisplayName("Should return Hip-Hop ID3v1 genre")
    void shouldReturnHipHopGenre() {
        Assertions.assertEquals("Hip-Hop", Genres.ID3V1_TAG_GENRES[7]);
    }

    @Test
    @DisplayName("Should return Hip-Hop ID3v1 genre index")
    void shouldReturnHipHopGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(7, Genres.convertStringGenreToIndexID3v1("Hip-Hop"));
    }

    @Test
    @DisplayName("Should return Jazz ID3v1 genre")
    void shouldReturnJazzGenre() {
        Assertions.assertEquals("Jazz", Genres.ID3V1_TAG_GENRES[8]);
    }

    @Test
    @DisplayName("Should return Jazz ID3v1 genre index")
    void shouldReturnJazzGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(8, Genres.convertStringGenreToIndexID3v1("Jazz"));
    }

    @Test
    @DisplayName("Should return Metal ID3v1 genre")
    void shouldReturnMetalGenre() {
        Assertions.assertEquals("Metal", Genres.ID3V1_TAG_GENRES[9]);
    }

    @Test
    @DisplayName("Should return Metal ID3v1 genre index")
    void shouldReturnMetalGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(9, Genres.convertStringGenreToIndexID3v1("Metal"));
    }

    @Test
    @DisplayName("Should return New Age ID3v1 genre")
    void shouldReturnNewAgeGenre() {
        Assertions.assertEquals("New Age", Genres.ID3V1_TAG_GENRES[10]);
    }

    @Test
    @DisplayName("Should return New Age ID3v1 genre index")
    void shouldReturnNewAgeGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(10, Genres.convertStringGenreToIndexID3v1("New Age"));
    }

    @Test
    @DisplayName("Should return Oldies ID3v1 genre")
    void shouldReturnOldiesGenre() {
        Assertions.assertEquals("Oldies", Genres.ID3V1_TAG_GENRES[11]);
    }

    @Test
    @DisplayName("Should return Oldies ID3v1 genre index")
    void shouldReturnOldiesGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(11, Genres.convertStringGenreToIndexID3v1("Oldies"));
    }

    @Test
    @DisplayName("Should return Other ID3v1 genre")
    void shouldReturnOtherGenre() {
        Assertions.assertEquals("Other", Genres.ID3V1_TAG_GENRES[12]);
    }

    @Test
    @DisplayName("Should return Other ID3v1 genre index")
    void shouldReturnOtherGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(12, Genres.convertStringGenreToIndexID3v1("Other"));
    }

    @Test
    @DisplayName("Should return Pop ID3v1 genre")
    void shouldReturnPopGenre() {
        Assertions.assertEquals("Pop", Genres.ID3V1_TAG_GENRES[13]);
    }

    @Test
    @DisplayName("Should return Pop ID3v1 genre index")
    void shouldReturnPopGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(13, Genres.convertStringGenreToIndexID3v1("Pop"));
    }

    @Test
    @DisplayName("Should return Rhythm and Blues ID3v1 genre")
    void shouldReturnRhythmandBluesGenre() {
        Assertions.assertEquals("Rhythm and Blues", Genres.ID3V1_TAG_GENRES[14]);
    }

    @Test
    @DisplayName("Should return Rhythm and Blues ID3v1 genre index")
    void shouldReturnRhythmandBluesGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(14, Genres.convertStringGenreToIndexID3v1("Rhythm and Blues"));
    }

    @Test
    @DisplayName("Should return Rap ID3v1 genre")
    void shouldReturnRapGenre() {
        Assertions.assertEquals("Rap", Genres.ID3V1_TAG_GENRES[15]);
    }

    @Test
    @DisplayName("Should return Rap ID3v1 genre index")
    void shouldReturnRapGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(15, Genres.convertStringGenreToIndexID3v1("Rap"));
    }

    @Test
    @DisplayName("Should return Reggae ID3v1 genre")
    void shouldReturnReggaeGenre() {
        Assertions.assertEquals("Reggae", Genres.ID3V1_TAG_GENRES[16]);
    }

    @Test
    @DisplayName("Should return Reggae ID3v1 genre index")
    void shouldReturnReggaeGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(16, Genres.convertStringGenreToIndexID3v1("Reggae"));
    }

    @Test
    @DisplayName("Should return Rock ID3v1 genre")
    void shouldReturnRockGenre() {
        Assertions.assertEquals("Rock", Genres.ID3V1_TAG_GENRES[17]);
    }

    @Test
    @DisplayName("Should return Rock ID3v1 genre index")
    void shouldReturnRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(17, Genres.convertStringGenreToIndexID3v1("Rock"));
    }

    @Test
    @DisplayName("Should return Techno ID3v1 genre")
    void shouldReturnTechnoGenre() {
        Assertions.assertEquals("Techno", Genres.ID3V1_TAG_GENRES[18]);
    }

    @Test
    @DisplayName("Should return Techno ID3v1 genre index")
    void shouldReturnTechnoGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(18, Genres.convertStringGenreToIndexID3v1("Techno"));
    }

    @Test
    @DisplayName("Should return Industrial ID3v1 genre")
    void shouldReturnIndustrialGenre() {
        Assertions.assertEquals("Industrial", Genres.ID3V1_TAG_GENRES[19]);
    }

    @Test
    @DisplayName("Should return Industrial ID3v1 genre index")
    void shouldReturnIndustrialGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(19, Genres.convertStringGenreToIndexID3v1("Industrial"));
    }

    @Test
    @DisplayName("Should return Alternative ID3v1 genre")
    void shouldReturnAlternativeGenre() {
        Assertions.assertEquals("Alternative", Genres.ID3V1_TAG_GENRES[20]);
    }

    @Test
    @DisplayName("Should return Alternative ID3v1 genre index")
    void shouldReturnAlternativeGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(20, Genres.convertStringGenreToIndexID3v1("Alternative"));
    }

    @Test
    @DisplayName("Should return Ska ID3v1 genre")
    void shouldReturnSkaGenre() {
        Assertions.assertEquals("Ska", Genres.ID3V1_TAG_GENRES[21]);
    }

    @Test
    @DisplayName("Should return Ska ID3v1 genre index")
    void shouldReturnSkaGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(21, Genres.convertStringGenreToIndexID3v1("Ska"));
    }

    @Test
    @DisplayName("Should return Death Metal ID3v1 genre")
    void shouldReturnDeathMetalGenre() {
        Assertions.assertEquals("Death Metal", Genres.ID3V1_TAG_GENRES[22]);
    }

    @Test
    @DisplayName("Should return Death Metal ID3v1 genre index")
    void shouldReturnDeathMetalGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(22, Genres.convertStringGenreToIndexID3v1("Death Metal"));
    }

    @Test
    @DisplayName("Should return Pranks ID3v1 genre")
    void shouldReturnPranksGenre() {
        Assertions.assertEquals("Pranks", Genres.ID3V1_TAG_GENRES[23]);
    }

    @Test
    @DisplayName("Should return Pranks ID3v1 genre index")
    void shouldReturnPranksGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(23, Genres.convertStringGenreToIndexID3v1("Pranks"));
    }

    @Test
    @DisplayName("Should return Soundtrack ID3v1 genre")
    void shouldReturnSoundtrackGenre() {
        Assertions.assertEquals("Soundtrack", Genres.ID3V1_TAG_GENRES[24]);
    }

    @Test
    @DisplayName("Should return Soundtrack ID3v1 genre index")
    void shouldReturnSoundtrackGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(24, Genres.convertStringGenreToIndexID3v1("Soundtrack"));
    }

    @Test
    @DisplayName("Should return Euro-Techno ID3v1 genre")
    void shouldReturnEuroTechnoGenre() {
        Assertions.assertEquals("Euro-Techno", Genres.ID3V1_TAG_GENRES[25]);
    }

    @Test
    @DisplayName("Should return Euro-Techno ID3v1 genre index")
    void shouldReturnEuroTechnoGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(25, Genres.convertStringGenreToIndexID3v1("Euro-Techno"));
    }

    @Test
    @DisplayName("Should return Ambient ID3v1 genre")
    void shouldReturnAmbientGenre() {
        Assertions.assertEquals("Ambient", Genres.ID3V1_TAG_GENRES[26]);
    }

    @Test
    @DisplayName("Should return Ambient ID3v1 genre index")
    void shouldReturnAmbientGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(26, Genres.convertStringGenreToIndexID3v1("Ambient"));
    }

    @Test
    @DisplayName("Should return Trip-Hop ID3v1 genre")
    void shouldReturnTripHopGenre() {
        Assertions.assertEquals("Trip-Hop", Genres.ID3V1_TAG_GENRES[27]);
    }

    @Test
    @DisplayName("Should return Trip-Hop ID3v1 genre index")
    void shouldReturnTripHopGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(27, Genres.convertStringGenreToIndexID3v1("Trip-Hop"));
    }

    @Test
    @DisplayName("Should return Vocal ID3v1 genre")
    void shouldReturnVocalGenre() {
        Assertions.assertEquals("Vocal", Genres.ID3V1_TAG_GENRES[28]);
    }

    @Test
    @DisplayName("Should return Vocal ID3v1 genre index")
    void shouldReturnVocalGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(28, Genres.convertStringGenreToIndexID3v1("Vocal"));
    }

    @Test
    @DisplayName("Should return Jazz & Funk ID3v1 genre")
    void shouldReturnJazzFunkGenre() {
        Assertions.assertEquals("Jazz & Funk", Genres.ID3V1_TAG_GENRES[29]);
    }

    @Test
    @DisplayName("Should return Jazz & Funk ID3v1 genre index")
    void shouldReturnJazzFunkGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(29, Genres.convertStringGenreToIndexID3v1("Jazz & Funk"));
    }

    @Test
    @DisplayName("Should return Fusion ID3v1 genre")
    void shouldReturnFusionGenre() {
        Assertions.assertEquals("Fusion", Genres.ID3V1_TAG_GENRES[30]);
    }

    @Test
    @DisplayName("Should return Fusion ID3v1 genre index")
    void shouldReturnFusionGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(30, Genres.convertStringGenreToIndexID3v1("Fusion"));
    }

    @Test
    @DisplayName("Should return Trance ID3v1 genre")
    void shouldReturnTranceGenre() {
        Assertions.assertEquals("Trance", Genres.ID3V1_TAG_GENRES[31]);
    }

    @Test
    @DisplayName("Should return Trance ID3v1 genre index")
    void shouldReturnTranceGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(31, Genres.convertStringGenreToIndexID3v1("Trance"));
    }

    @Test
    @DisplayName("Should return Classical ID3v1 genre")
    void shouldReturnClassicalGenre() {
        Assertions.assertEquals("Classical", Genres.ID3V1_TAG_GENRES[32]);
    }

    @Test
    @DisplayName("Should return Classical ID3v1 genre index")
    void shouldReturnClassicalGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(32, Genres.convertStringGenreToIndexID3v1("Classical"));
    }

    @Test
    @DisplayName("Should return Instrumental ID3v1 genre")
    void shouldReturnInstrumentalGenre() {
        Assertions.assertEquals("Instrumental", Genres.ID3V1_TAG_GENRES[33]);
    }

    @Test
    @DisplayName("Should return Instrumental ID3v1 genre index")
    void shouldReturnInstrumentalGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(33, Genres.convertStringGenreToIndexID3v1("Instrumental"));
    }

    @Test
    @DisplayName("Should return Acid ID3v1 genre")
    void shouldReturnAcidGenre() {
        Assertions.assertEquals("Acid", Genres.ID3V1_TAG_GENRES[34]);
    }

    @Test
    @DisplayName("Should return Acid ID3v1 genre index")
    void shouldReturnAcidGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(34, Genres.convertStringGenreToIndexID3v1("Acid"));
    }

    @Test
    @DisplayName("Should return House ID3v1 genre")
    void shouldReturnHouseGenre() {
        Assertions.assertEquals("House", Genres.ID3V1_TAG_GENRES[35]);
    }

    @Test
    @DisplayName("Should return House ID3v1 genre index")
    void shouldReturnHouseGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(35, Genres.convertStringGenreToIndexID3v1("House"));
    }

    @Test
    @DisplayName("Should return Game ID3v1 genre")
    void shouldReturnGameGenre() {
        Assertions.assertEquals("Game", Genres.ID3V1_TAG_GENRES[36]);
    }

    @Test
    @DisplayName("Should return Game ID3v1 genre index")
    void shouldReturnGameGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(36, Genres.convertStringGenreToIndexID3v1("Game"));
    }

    @Test
    @DisplayName("Should return Sound clip ID3v1 genre")
    void shouldReturnSoundclipGenre() {
        Assertions.assertEquals("Sound clip", Genres.ID3V1_TAG_GENRES[37]);
    }

    @Test
    @DisplayName("Should return Sound clip ID3v1 genre index")
    void shouldReturnSoundclipGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(37, Genres.convertStringGenreToIndexID3v1("Sound clip"));
    }

    @Test
    @DisplayName("Should return Gospel ID3v1 genre")
    void shouldReturnGospelGenre() {
        Assertions.assertEquals("Gospel", Genres.ID3V1_TAG_GENRES[38]);
    }

    @Test
    @DisplayName("Should return Gospel ID3v1 genre index")
    void shouldReturnGospelGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(38, Genres.convertStringGenreToIndexID3v1("Gospel"));
    }

    @Test
    @DisplayName("Should return Noise ID3v1 genre")
    void shouldReturnNoiseGenre() {
        Assertions.assertEquals("Noise", Genres.ID3V1_TAG_GENRES[39]);
    }

    @Test
    @DisplayName("Should return Noise ID3v1 genre index")
    void shouldReturnNoiseGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(39, Genres.convertStringGenreToIndexID3v1("Noise"));
    }

    @Test
    @DisplayName("Should return Alternative Rock ID3v1 genre")
    void shouldReturnAlternativeRockGenre() {
        Assertions.assertEquals("Alternative Rock", Genres.ID3V1_TAG_GENRES[40]);
    }

    @Test
    @DisplayName("Should return Alternative Rock ID3v1 genre index")
    void shouldReturnAlternativeRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(40, Genres.convertStringGenreToIndexID3v1("Alternative Rock"));
    }

    @Test
    @DisplayName("Should return Bass ID3v1 genre")
    void shouldReturnBassGenre() {
        Assertions.assertEquals("Bass", Genres.ID3V1_TAG_GENRES[41]);
    }

    @Test
    @DisplayName("Should return Bass ID3v1 genre index")
    void shouldReturnBassGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(41, Genres.convertStringGenreToIndexID3v1("Bass"));
    }

    @Test
    @DisplayName("Should return Soul ID3v1 genre")
    void shouldReturnSoulGenre() {
        Assertions.assertEquals("Soul", Genres.ID3V1_TAG_GENRES[42]);
    }

    @Test
    @DisplayName("Should return Soul ID3v1 genre index")
    void shouldReturnSoulGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(42, Genres.convertStringGenreToIndexID3v1("Soul"));
    }

    @Test
    @DisplayName("Should return Punk ID3v1 genre")
    void shouldReturnPunkGenre() {
        Assertions.assertEquals("Punk", Genres.ID3V1_TAG_GENRES[43]);
    }

    @Test
    @DisplayName("Should return Punk ID3v1 genre index")
    void shouldReturnPunkGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(43, Genres.convertStringGenreToIndexID3v1("Punk"));
    }

    @Test
    @DisplayName("Should return Space ID3v1 genre")
    void shouldReturnSpaceGenre() {
        Assertions.assertEquals("Space", Genres.ID3V1_TAG_GENRES[44]);
    }

    @Test
    @DisplayName("Should return Space ID3v1 genre index")
    void shouldReturnSpaceGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(44, Genres.convertStringGenreToIndexID3v1("Space"));
    }

    @Test
    @DisplayName("Should return Meditative ID3v1 genre")
    void shouldReturnMeditativeGenre() {
        Assertions.assertEquals("Meditative", Genres.ID3V1_TAG_GENRES[45]);
    }

    @Test
    @DisplayName("Should return Meditative ID3v1 genre index")
    void shouldReturnMeditativeGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(45, Genres.convertStringGenreToIndexID3v1("Meditative"));
    }

    @Test
    @DisplayName("Should return Instrumental Pop ID3v1 genre")
    void shouldReturnInstrumentalPopGenre() {
        Assertions.assertEquals("Instrumental Pop", Genres.ID3V1_TAG_GENRES[46]);
    }

    @Test
    @DisplayName("Should return Instrumental Pop ID3v1 genre index")
    void shouldReturnInstrumentalPopGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(46, Genres.convertStringGenreToIndexID3v1("Instrumental Pop"));
    }

    @Test
    @DisplayName("Should return Instrumental Rock ID3v1 genre")
    void shouldReturnInstrumentalRockGenre() {
        Assertions.assertEquals("Instrumental Rock", Genres.ID3V1_TAG_GENRES[47]);
    }

    @Test
    @DisplayName("Should return Instrumental Rock ID3v1 genre index")
    void shouldReturnInstrumentalRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(47, Genres.convertStringGenreToIndexID3v1("Instrumental Rock"));
    }

    @Test
    @DisplayName("Should return Ethnic ID3v1 genre")
    void shouldReturnEthnicGenre() {
        Assertions.assertEquals("Ethnic", Genres.ID3V1_TAG_GENRES[48]);
    }

    @Test
    @DisplayName("Should return Ethnic ID3v1 genre index")
    void shouldReturnEthnicGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(48, Genres.convertStringGenreToIndexID3v1("Ethnic"));
    }

    @Test
    @DisplayName("Should return Gothic ID3v1 genre")
    void shouldReturnGothicGenre() {
        Assertions.assertEquals("Gothic", Genres.ID3V1_TAG_GENRES[49]);
    }

    @Test
    @DisplayName("Should return Gothic ID3v1 genre index")
    void shouldReturnGothicGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(49, Genres.convertStringGenreToIndexID3v1("Gothic"));
    }

    @Test
    @DisplayName("Should return Darkwave ID3v1 genre")
    void shouldReturnDarkwaveGenre() {
        Assertions.assertEquals("Darkwave", Genres.ID3V1_TAG_GENRES[50]);
    }

    @Test
    @DisplayName("Should return Darkwave ID3v1 genre index")
    void shouldReturnDarkwaveGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(50, Genres.convertStringGenreToIndexID3v1("Darkwave"));
    }

    @Test
    @DisplayName("Should return Techno-Industrial ID3v1 genre")
    void shouldReturnTechnoIndustrialGenre() {
        Assertions.assertEquals("Techno-Industrial", Genres.ID3V1_TAG_GENRES[51]);
    }

    @Test
    @DisplayName("Should return Techno-Industrial ID3v1 genre index")
    void shouldReturnTechnoIndustrialGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(51, Genres.convertStringGenreToIndexID3v1("Techno-Industrial"));
    }

    @Test
    @DisplayName("Should return Electronic ID3v1 genre")
    void shouldReturnElectronicGenre() {
        Assertions.assertEquals("Electronic", Genres.ID3V1_TAG_GENRES[52]);
    }

    @Test
    @DisplayName("Should return Electronic ID3v1 genre index")
    void shouldReturnElectronicGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(52, Genres.convertStringGenreToIndexID3v1("Electronic"));
    }

    @Test
    @DisplayName("Should return Pop-Folk ID3v1 genre")
    void shouldReturnPopFolkGenre() {
        Assertions.assertEquals("Pop-Folk", Genres.ID3V1_TAG_GENRES[53]);
    }

    @Test
    @DisplayName("Should return Pop-Folk ID3v1 genre index")
    void shouldReturnPopFolkGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(53, Genres.convertStringGenreToIndexID3v1("Pop-Folk"));
    }

    @Test
    @DisplayName("Should return Eurodance ID3v1 genre")
    void shouldReturnEurodanceGenre() {
        Assertions.assertEquals("Eurodance", Genres.ID3V1_TAG_GENRES[54]);
    }

    @Test
    @DisplayName("Should return Eurodance ID3v1 genre index")
    void shouldReturnEurodanceGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(54, Genres.convertStringGenreToIndexID3v1("Eurodance"));
    }

    @Test
    @DisplayName("Should return Dream ID3v1 genre")
    void shouldReturnDreamGenre() {
        Assertions.assertEquals("Dream", Genres.ID3V1_TAG_GENRES[55]);
    }

    @Test
    @DisplayName("Should return Dream ID3v1 genre index")
    void shouldReturnDreamGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(55, Genres.convertStringGenreToIndexID3v1("Dream"));
    }

    @Test
    @DisplayName("Should return Southern Rock ID3v1 genre")
    void shouldReturnSouthernRockGenre() {
        Assertions.assertEquals("Southern Rock", Genres.ID3V1_TAG_GENRES[56]);
    }

    @Test
    @DisplayName("Should return Southern Rock ID3v1 genre index")
    void shouldReturnSouthernRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(56, Genres.convertStringGenreToIndexID3v1("Southern Rock"));
    }

    @Test
    @DisplayName("Should return Comedy ID3v1 genre")
    void shouldReturnComedyGenre() {
        Assertions.assertEquals("Comedy", Genres.ID3V1_TAG_GENRES[57]);
    }

    @Test
    @DisplayName("Should return Comedy ID3v1 genre index")
    void shouldReturnComedyGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(57, Genres.convertStringGenreToIndexID3v1("Comedy"));
    }

    @Test
    @DisplayName("Should return Cult ID3v1 genre")
    void shouldReturnCultGenre() {
        Assertions.assertEquals("Cult", Genres.ID3V1_TAG_GENRES[58]);
    }

    @Test
    @DisplayName("Should return Cult ID3v1 genre index")
    void shouldReturnCultGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(58, Genres.convertStringGenreToIndexID3v1("Cult"));
    }

    @Test
    @DisplayName("Should return Gangsta ID3v1 genre")
    void shouldReturnGangstaGenre() {
        Assertions.assertEquals("Gangsta", Genres.ID3V1_TAG_GENRES[59]);
    }

    @Test
    @DisplayName("Should return Gangsta ID3v1 genre index")
    void shouldReturnGangstaGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(59, Genres.convertStringGenreToIndexID3v1("Gangsta"));
    }

    @Test
    @DisplayName("Should return Top 40 ID3v1 genre")
    void shouldReturnTop40Genre() {
        Assertions.assertEquals("Top 40", Genres.ID3V1_TAG_GENRES[60]);
    }

    @Test
    @DisplayName("Should return Top 40 ID3v1 genre index")
    void shouldReturnTop40GenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(60, Genres.convertStringGenreToIndexID3v1("Top 40"));
    }

    @Test
    @DisplayName("Should return Christian Rap ID3v1 genre")
    void shouldReturnChristianRapGenre() {
        Assertions.assertEquals("Christian Rap", Genres.ID3V1_TAG_GENRES[61]);
    }

    @Test
    @DisplayName("Should return Christian Rap ID3v1 genre index")
    void shouldReturnChristianRapGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(61, Genres.convertStringGenreToIndexID3v1("Christian Rap"));
    }

    @Test
    @DisplayName("Should return Pop/Funk ID3v1 genre")
    void shouldReturnPopFunkGenre() {
        Assertions.assertEquals("Pop/Funk", Genres.ID3V1_TAG_GENRES[62]);
    }

    @Test
    @DisplayName("Should return Pop/Funk ID3v1 genre index")
    void shouldReturnPopFunkGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(62, Genres.convertStringGenreToIndexID3v1("Pop/Funk"));
    }

    @Test
    @DisplayName("Should return Jungle Music ID3v1 genre")
    void shouldReturnJungleMusicGenre() {
        Assertions.assertEquals("Jungle Music", Genres.ID3V1_TAG_GENRES[63]);
    }

    @Test
    @DisplayName("Should return Jungle Music ID3v1 genre index")
    void shouldReturnJungleMusicGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(63, Genres.convertStringGenreToIndexID3v1("Jungle Music"));
    }

    @Test
    @DisplayName("Should return Native US ID3v1 genre")
    void shouldReturnNativeUSGenre() {
        Assertions.assertEquals("Native US", Genres.ID3V1_TAG_GENRES[64]);
    }

    @Test
    @DisplayName("Should return Native US ID3v1 genre index")
    void shouldReturnNativeUSGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(64, Genres.convertStringGenreToIndexID3v1("Native US"));
    }

    @Test
    @DisplayName("Should return Cabaret ID3v1 genre")
    void shouldReturnCabaretGenre() {
        Assertions.assertEquals("Cabaret", Genres.ID3V1_TAG_GENRES[65]);
    }

    @Test
    @DisplayName("Should return Cabaret ID3v1 genre index")
    void shouldReturnCabaretGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(65, Genres.convertStringGenreToIndexID3v1("Cabaret"));
    }

    @Test
    @DisplayName("Should return New Wave ID3v1 genre")
    void shouldReturnNewWaveGenre() {
        Assertions.assertEquals("New Wave", Genres.ID3V1_TAG_GENRES[66]);
    }

    @Test
    @DisplayName("Should return New Wave ID3v1 genre index")
    void shouldReturnNewWaveGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(66, Genres.convertStringGenreToIndexID3v1("New Wave"));
    }

    @Test
    @DisplayName("Should return Psychedelic ID3v1 genre")
    void shouldReturnPsychedelicGenre() {
        Assertions.assertEquals("Psychedelic", Genres.ID3V1_TAG_GENRES[67]);
    }

    @Test
    @DisplayName("Should return Psychedelic ID3v1 genre index")
    void shouldReturnPsychedelicGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(67, Genres.convertStringGenreToIndexID3v1("Psychedelic"));
    }

    @Test
    @DisplayName("Should return Rave ID3v1 genre")
    void shouldReturnRaveGenre() {
        Assertions.assertEquals("Rave", Genres.ID3V1_TAG_GENRES[68]);
    }

    @Test
    @DisplayName("Should return Rave ID3v1 genre index")
    void shouldReturnRaveGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(68, Genres.convertStringGenreToIndexID3v1("Rave"));
    }

    @Test
    @DisplayName("Should return Showtunes ID3v1 genre")
    void shouldReturnShowtunesGenre() {
        Assertions.assertEquals("Showtunes", Genres.ID3V1_TAG_GENRES[69]);
    }

    @Test
    @DisplayName("Should return Showtunes ID3v1 genre index")
    void shouldReturnShowtunesGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(69, Genres.convertStringGenreToIndexID3v1("Showtunes"));
    }

    @Test
    @DisplayName("Should return Trailer ID3v1 genre")
    void shouldReturnTrailerGenre() {
        Assertions.assertEquals("Trailer", Genres.ID3V1_TAG_GENRES[70]);
    }

    @Test
    @DisplayName("Should return Trailer ID3v1 genre index")
    void shouldReturnTrailerGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(70, Genres.convertStringGenreToIndexID3v1("Trailer"));
    }

    @Test
    @DisplayName("Should return Lo-Fi ID3v1 genre")
    void shouldReturnLoFiGenre() {
        Assertions.assertEquals("Lo-Fi", Genres.ID3V1_TAG_GENRES[71]);
    }

    @Test
    @DisplayName("Should return Lo-Fi ID3v1 genre index")
    void shouldReturnLoFiGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(71, Genres.convertStringGenreToIndexID3v1("Lo-Fi"));
    }

    @Test
    @DisplayName("Should return Tribal ID3v1 genre")
    void shouldReturnTribalGenre() {
        Assertions.assertEquals("Tribal", Genres.ID3V1_TAG_GENRES[72]);
    }

    @Test
    @DisplayName("Should return Tribal ID3v1 genre index")
    void shouldReturnTribalGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(72, Genres.convertStringGenreToIndexID3v1("Tribal"));
    }

    @Test
    @DisplayName("Should return Acid Punk ID3v1 genre")
    void shouldReturnAcidPunkGenre() {
        Assertions.assertEquals("Acid Punk", Genres.ID3V1_TAG_GENRES[73]);
    }

    @Test
    @DisplayName("Should return Acid Punk ID3v1 genre index")
    void shouldReturnAcidPunkGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(73, Genres.convertStringGenreToIndexID3v1("Acid Punk"));
    }

    @Test
    @DisplayName("Should return Acid Jazz ID3v1 genre")
    void shouldReturnAcidJazzGenre() {
        Assertions.assertEquals("Acid Jazz", Genres.ID3V1_TAG_GENRES[74]);
    }

    @Test
    @DisplayName("Should return Acid Jazz ID3v1 genre index")
    void shouldReturnAcidJazzGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(74, Genres.convertStringGenreToIndexID3v1("Acid Jazz"));
    }

    @Test
    @DisplayName("Should return Polka ID3v1 genre")
    void shouldReturnPolkaGenre() {
        Assertions.assertEquals("Polka", Genres.ID3V1_TAG_GENRES[75]);
    }

    @Test
    @DisplayName("Should return Polka ID3v1 genre index")
    void shouldReturnPolkaGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(75, Genres.convertStringGenreToIndexID3v1("Polka"));
    }

    @Test
    @DisplayName("Should return Retro ID3v1 genre")
    void shouldReturnRetroGenre() {
        Assertions.assertEquals("Retro", Genres.ID3V1_TAG_GENRES[76]);
    }

    @Test
    @DisplayName("Should return Retro ID3v1 genre index")
    void shouldReturnRetroGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(76, Genres.convertStringGenreToIndexID3v1("Retro"));
    }

    @Test
    @DisplayName("Should return Musical ID3v1 genre")
    void shouldReturnMusicalGenre() {
        Assertions.assertEquals("Musical", Genres.ID3V1_TAG_GENRES[77]);
    }

    @Test
    @DisplayName("Should return Musical ID3v1 genre index")
    void shouldReturnMusicalGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(77, Genres.convertStringGenreToIndexID3v1("Musical"));
    }

    @Test
    @DisplayName("Should return Rock 'n' Roll ID3v1 genre")
    void shouldReturnRocknRollGenre() {
        Assertions.assertEquals("Rock 'n' Roll", Genres.ID3V1_TAG_GENRES[78]);
    }

    @Test
    @DisplayName("Should return Rock 'n' Roll ID3v1 genre index")
    void shouldReturnRocknRollGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(78, Genres.convertStringGenreToIndexID3v1("Rock 'n' Roll"));
    }

    @Test
    @DisplayName("Should return Hard Rock ID3v1 genre")
    void shouldReturnHardRockGenre() {
        Assertions.assertEquals("Hard Rock", Genres.ID3V1_TAG_GENRES[79]);
    }

    @Test
    @DisplayName("Should return Hard Rock ID3v1 genre index")
    void shouldReturnHardRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(79, Genres.convertStringGenreToIndexID3v1("Hard Rock"));
    }

    @Test
    @DisplayName("Should return Folk ID3v1 genre")
    void shouldReturnFolkGenre() {
        Assertions.assertEquals("Folk", Genres.ID3V1_TAG_GENRES[80]);
    }

    @Test
    @DisplayName("Should return Folk ID3v1 genre index")
    void shouldReturnFolkGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(80, Genres.convertStringGenreToIndexID3v1("Folk"));
    }

    @Test
    @DisplayName("Should return Folk-Rock ID3v1 genre")
    void shouldReturnFolkRockGenre() {
        Assertions.assertEquals("Folk-Rock", Genres.ID3V1_TAG_GENRES[81]);
    }

    @Test
    @DisplayName("Should return Folk-Rock ID3v1 genre index")
    void shouldReturnFolkRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(81, Genres.convertStringGenreToIndexID3v1("Folk-Rock"));
    }

    @Test
    @DisplayName("Should return National Folk ID3v1 genre")
    void shouldReturnNationalFolkGenre() {
        Assertions.assertEquals("National Folk", Genres.ID3V1_TAG_GENRES[82]);
    }

    @Test
    @DisplayName("Should return National Folk ID3v1 genre index")
    void shouldReturnNationalFolkGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(82, Genres.convertStringGenreToIndexID3v1("National Folk"));
    }

    @Test
    @DisplayName("Should return Swing ID3v1 genre")
    void shouldReturnSwingGenre() {
        Assertions.assertEquals("Swing", Genres.ID3V1_TAG_GENRES[83]);
    }

    @Test
    @DisplayName("Should return Swing ID3v1 genre index")
    void shouldReturnSwingGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(83, Genres.convertStringGenreToIndexID3v1("Swing"));
    }

    @Test
    @DisplayName("Should return Fast Fusion ID3v1 genre")
    void shouldReturnFastFusionGenre() {
        Assertions.assertEquals("Fast Fusion", Genres.ID3V1_TAG_GENRES[84]);
    }

    @Test
    @DisplayName("Should return Fast Fusion ID3v1 genre index")
    void shouldReturnFastFusionGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(84, Genres.convertStringGenreToIndexID3v1("Fast Fusion"));
    }

    @Test
    @DisplayName("Should return Bebop ID3v1 genre")
    void shouldReturnBebopGenre() {
        Assertions.assertEquals("Bebop", Genres.ID3V1_TAG_GENRES[85]);
    }

    @Test
    @DisplayName("Should return Bebop ID3v1 genre index")
    void shouldReturnBebopGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(85, Genres.convertStringGenreToIndexID3v1("Bebop"));
    }

    @Test
    @DisplayName("Should return Latin ID3v1 genre")
    void shouldReturnLatinGenre() {
        Assertions.assertEquals("Latin", Genres.ID3V1_TAG_GENRES[86]);
    }

    @Test
    @DisplayName("Should return Latin ID3v1 genre index")
    void shouldReturnLatinGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(86, Genres.convertStringGenreToIndexID3v1("Latin"));
    }

    @Test
    @DisplayName("Should return Revival ID3v1 genre")
    void shouldReturnRevivalGenre() {
        Assertions.assertEquals("Revival", Genres.ID3V1_TAG_GENRES[87]);
    }

    @Test
    @DisplayName("Should return Revival ID3v1 genre index")
    void shouldReturnRevivalGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(87, Genres.convertStringGenreToIndexID3v1("Revival"));
    }

    @Test
    @DisplayName("Should return Celtic ID3v1 genre")
    void shouldReturnCelticGenre() {
        Assertions.assertEquals("Celtic", Genres.ID3V1_TAG_GENRES[88]);
    }

    @Test
    @DisplayName("Should return Celtic ID3v1 genre index")
    void shouldReturnCelticGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(88, Genres.convertStringGenreToIndexID3v1("Celtic"));
    }

    @Test
    @DisplayName("Should return Bluegrass ID3v1 genre")
    void shouldReturnBluegrassGenre() {
        Assertions.assertEquals("Bluegrass", Genres.ID3V1_TAG_GENRES[89]);
    }

    @Test
    @DisplayName("Should return Bluegrass ID3v1 genre index")
    void shouldReturnBluegrassGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(89, Genres.convertStringGenreToIndexID3v1("Bluegrass"));
    }

    @Test
    @DisplayName("Should return Avantgarde ID3v1 genre")
    void shouldReturnAvantgardeGenre() {
        Assertions.assertEquals("Avantgarde", Genres.ID3V1_TAG_GENRES[90]);
    }

    @Test
    @DisplayName("Should return Avantgarde ID3v1 genre index")
    void shouldReturnAvantgardeGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(90, Genres.convertStringGenreToIndexID3v1("Avantgarde"));
    }

    @Test
    @DisplayName("Should return Gothic Rock ID3v1 genre")
    void shouldReturnGothicRockGenre() {
        Assertions.assertEquals("Gothic Rock", Genres.ID3V1_TAG_GENRES[91]);
    }

    @Test
    @DisplayName("Should return Gothic Rock ID3v1 genre index")
    void shouldReturnGothicRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(91, Genres.convertStringGenreToIndexID3v1("Gothic Rock"));
    }

    @Test
    @DisplayName("Should return Progressive Rock ID3v1 genre")
    void shouldReturnProgressiveRockGenre() {
        Assertions.assertEquals("Progressive Rock", Genres.ID3V1_TAG_GENRES[92]);
    }

    @Test
    @DisplayName("Should return Progressive Rock ID3v1 genre index")
    void shouldReturnProgressiveRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(92, Genres.convertStringGenreToIndexID3v1("Progressive Rock"));
    }

    @Test
    @DisplayName("Should return Psychedelic Rock ID3v1 genre")
    void shouldReturnPsychedelicRockGenre() {
        Assertions.assertEquals("Psychedelic Rock", Genres.ID3V1_TAG_GENRES[93]);
    }

    @Test
    @DisplayName("Should return Psychedelic Rock ID3v1 genre index")
    void shouldReturnPsychedelicRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(93, Genres.convertStringGenreToIndexID3v1("Psychedelic Rock"));
    }

    @Test
    @DisplayName("Should return Symphonic Rock ID3v1 genre")
    void shouldReturnSymphonicRockGenre() {
        Assertions.assertEquals("Symphonic Rock", Genres.ID3V1_TAG_GENRES[94]);
    }

    @Test
    @DisplayName("Should return Symphonic Rock ID3v1 genre index")
    void shouldReturnSymphonicRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(94, Genres.convertStringGenreToIndexID3v1("Symphonic Rock"));
    }

    @Test
    @DisplayName("Should return Slow Rock ID3v1 genre")
    void shouldReturnSlowRockGenre() {
        Assertions.assertEquals("Slow Rock", Genres.ID3V1_TAG_GENRES[95]);
    }

    @Test
    @DisplayName("Should return Slow Rock ID3v1 genre index")
    void shouldReturnSlowRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(95, Genres.convertStringGenreToIndexID3v1("Slow Rock"));
    }

    @Test
    @DisplayName("Should return Big Band ID3v1 genre")
    void shouldReturnBigBandGenre() {
        Assertions.assertEquals("Big Band", Genres.ID3V1_TAG_GENRES[96]);
    }

    @Test
    @DisplayName("Should return Big Band ID3v1 genre index")
    void shouldReturnBigBandGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(96, Genres.convertStringGenreToIndexID3v1("Big Band"));
    }

    @Test
    @DisplayName("Should return Chorus ID3v1 genre")
    void shouldReturnChorusGenre() {
        Assertions.assertEquals("Chorus", Genres.ID3V1_TAG_GENRES[97]);
    }

    @Test
    @DisplayName("Should return Chorus ID3v1 genre index")
    void shouldReturnChorusGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(97, Genres.convertStringGenreToIndexID3v1("Chorus"));
    }

    @Test
    @DisplayName("Should return Easy Listening ID3v1 genre")
    void shouldReturnEasyListeningGenre() {
        Assertions.assertEquals("Easy Listening", Genres.ID3V1_TAG_GENRES[98]);
    }

    @Test
    @DisplayName("Should return Easy Listening ID3v1 genre index")
    void shouldReturnEasyListeningGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(98, Genres.convertStringGenreToIndexID3v1("Easy Listening"));
    }

    @Test
    @DisplayName("Should return Acoustic ID3v1 genre")
    void shouldReturnAcousticGenre() {
        Assertions.assertEquals("Acoustic", Genres.ID3V1_TAG_GENRES[99]);
    }

    @Test
    @DisplayName("Should return Acoustic ID3v1 genre index")
    void shouldReturnAcousticGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(99, Genres.convertStringGenreToIndexID3v1("Acoustic"));
    }

    @Test
    @DisplayName("Should return Humour ID3v1 genre")
    void shouldReturnHumourGenre() {
        Assertions.assertEquals("Humour", Genres.ID3V1_TAG_GENRES[100]);
    }

    @Test
    @DisplayName("Should return Humour ID3v1 genre index")
    void shouldReturnHumourGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(100, Genres.convertStringGenreToIndexID3v1("Humour"));
    }

    @Test
    @DisplayName("Should return Speech ID3v1 genre")
    void shouldReturnSpeechGenre() {
        Assertions.assertEquals("Speech", Genres.ID3V1_TAG_GENRES[101]);
    }

    @Test
    @DisplayName("Should return Speech ID3v1 genre index")
    void shouldReturnSpeechGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(101, Genres.convertStringGenreToIndexID3v1("Speech"));
    }

    @Test
    @DisplayName("Should return Chanson ID3v1 genre")
    void shouldReturnChansonGenre() {
        Assertions.assertEquals("Chanson", Genres.ID3V1_TAG_GENRES[102]);
    }

    @Test
    @DisplayName("Should return Chanson ID3v1 genre index")
    void shouldReturnChansonGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(102, Genres.convertStringGenreToIndexID3v1("Chanson"));
    }

    @Test
    @DisplayName("Should return Opera ID3v1 genre")
    void shouldReturnOperaGenre() {
        Assertions.assertEquals("Opera", Genres.ID3V1_TAG_GENRES[103]);
    }

    @Test
    @DisplayName("Should return Opera ID3v1 genre index")
    void shouldReturnOperaGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(103, Genres.convertStringGenreToIndexID3v1("Opera"));
    }

    @Test
    @DisplayName("Should return Chamber Music ID3v1 genre")
    void shouldReturnChamberMusicGenre() {
        Assertions.assertEquals("Chamber Music", Genres.ID3V1_TAG_GENRES[104]);
    }

    @Test
    @DisplayName("Should return Chamber Music ID3v1 genre index")
    void shouldReturnChamberMusicGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(104, Genres.convertStringGenreToIndexID3v1("Chamber Music"));
    }

    @Test
    @DisplayName("Should return Sonata ID3v1 genre")
    void shouldReturnSonataGenre() {
        Assertions.assertEquals("Sonata", Genres.ID3V1_TAG_GENRES[105]);
    }

    @Test
    @DisplayName("Should return Sonata ID3v1 genre index")
    void shouldReturnSonataGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(105, Genres.convertStringGenreToIndexID3v1("Sonata"));
    }

    @Test
    @DisplayName("Should return Symphony ID3v1 genre")
    void shouldReturnSymphonyGenre() {
        Assertions.assertEquals("Symphony", Genres.ID3V1_TAG_GENRES[106]);
    }

    @Test
    @DisplayName("Should return Symphony ID3v1 genre index")
    void shouldReturnSymphonyGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(106, Genres.convertStringGenreToIndexID3v1("Symphony"));
    }

    @Test
    @DisplayName("Should return Booty Bass ID3v1 genre")
    void shouldReturnBootyBassGenre() {
        Assertions.assertEquals("Booty Bass", Genres.ID3V1_TAG_GENRES[107]);
    }

    @Test
    @DisplayName("Should return Booty Bass ID3v1 genre index")
    void shouldReturnBootyBassGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(107, Genres.convertStringGenreToIndexID3v1("Booty Bass"));
    }

    @Test
    @DisplayName("Should return Primus ID3v1 genre")
    void shouldReturnPrimusGenre() {
        Assertions.assertEquals("Primus", Genres.ID3V1_TAG_GENRES[108]);
    }

    @Test
    @DisplayName("Should return Primus ID3v1 genre index")
    void shouldReturnPrimusGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(108, Genres.convertStringGenreToIndexID3v1("Primus"));
    }

    @Test
    @DisplayName("Should return Porn Grove ID3v1 genre")
    void shouldReturnPornGroveGenre() {
        Assertions.assertEquals("Porn Grove", Genres.ID3V1_TAG_GENRES[109]);
    }

    @Test
    @DisplayName("Should return Porn Grove ID3v1 genre index")
    void shouldReturnPornGroveGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(109, Genres.convertStringGenreToIndexID3v1("Porn Grove"));
    }

    @Test
    @DisplayName("Should return Satire ID3v1 genre")
    void shouldReturnSatireGenre() {
        Assertions.assertEquals("Satire", Genres.ID3V1_TAG_GENRES[110]);
    }

    @Test
    @DisplayName("Should return Satire ID3v1 genre index")
    void shouldReturnSatireGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(110, Genres.convertStringGenreToIndexID3v1("Satire"));
    }

    @Test
    @DisplayName("Should return Slow Jam ID3v1 genre")
    void shouldReturnSlowJamGenre() {
        Assertions.assertEquals("Slow Jam", Genres.ID3V1_TAG_GENRES[111]);
    }

    @Test
    @DisplayName("Should return Slow Jam ID3v1 genre index")
    void shouldReturnSlowJamGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(111, Genres.convertStringGenreToIndexID3v1("Slow Jam"));
    }

    @Test
    @DisplayName("Should return Club ID3v1 genre")
    void shouldReturnClubGenre() {
        Assertions.assertEquals("Club", Genres.ID3V1_TAG_GENRES[112]);
    }

    @Test
    @DisplayName("Should return Club ID3v1 genre index")
    void shouldReturnClubGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(112, Genres.convertStringGenreToIndexID3v1("Club"));
    }

    @Test
    @DisplayName("Should return Tango ID3v1 genre")
    void shouldReturnTangoGenre() {
        Assertions.assertEquals("Tango", Genres.ID3V1_TAG_GENRES[113]);
    }

    @Test
    @DisplayName("Should return Tango ID3v1 genre index")
    void shouldReturnTangoGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(113, Genres.convertStringGenreToIndexID3v1("Tango"));
    }

    @Test
    @DisplayName("Should return Samba ID3v1 genre")
    void shouldReturnSambaGenre() {
        Assertions.assertEquals("Samba", Genres.ID3V1_TAG_GENRES[114]);
    }

    @Test
    @DisplayName("Should return Samba ID3v1 genre index")
    void shouldReturnSambaGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(114, Genres.convertStringGenreToIndexID3v1("Samba"));
    }

    @Test
    @DisplayName("Should return Folklore ID3v1 genre")
    void shouldReturnFolkloreGenre() {
        Assertions.assertEquals("Folklore", Genres.ID3V1_TAG_GENRES[115]);
    }

    @Test
    @DisplayName("Should return Folklore ID3v1 genre index")
    void shouldReturnFolkloreGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(115, Genres.convertStringGenreToIndexID3v1("Folklore"));
    }

    @Test
    @DisplayName("Should return Ballad ID3v1 genre")
    void shouldReturnBalladGenre() {
        Assertions.assertEquals("Ballad", Genres.ID3V1_TAG_GENRES[116]);
    }

    @Test
    @DisplayName("Should return Ballad ID3v1 genre index")
    void shouldReturnBalladGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(116, Genres.convertStringGenreToIndexID3v1("Ballad"));
    }

    @Test
    @DisplayName("Should return Power Ballad ID3v1 genre")
    void shouldReturnPowerBalladGenre() {
        Assertions.assertEquals("Power Ballad", Genres.ID3V1_TAG_GENRES[117]);
    }

    @Test
    @DisplayName("Should return Power Ballad ID3v1 genre index")
    void shouldReturnPowerBalladGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(117, Genres.convertStringGenreToIndexID3v1("Power Ballad"));
    }

    @Test
    @DisplayName("Should return Rhythmic Soul ID3v1 genre")
    void shouldReturnRhythmicSoulGenre() {
        Assertions.assertEquals("Rhythmic Soul", Genres.ID3V1_TAG_GENRES[118]);
    }

    @Test
    @DisplayName("Should return Rhythmic Soul ID3v1 genre index")
    void shouldReturnRhythmicSoulGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(118, Genres.convertStringGenreToIndexID3v1("Rhythmic Soul"));
    }

    @Test
    @DisplayName("Should return Freestyle ID3v1 genre")
    void shouldReturnFreestyleGenre() {
        Assertions.assertEquals("Freestyle", Genres.ID3V1_TAG_GENRES[119]);
    }

    @Test
    @DisplayName("Should return Freestyle ID3v1 genre index")
    void shouldReturnFreestyleGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(119, Genres.convertStringGenreToIndexID3v1("Freestyle"));
    }

    @Test
    @DisplayName("Should return Duet ID3v1 genre")
    void shouldReturnDuetGenre() {
        Assertions.assertEquals("Duet", Genres.ID3V1_TAG_GENRES[120]);
    }

    @Test
    @DisplayName("Should return Duet ID3v1 genre index")
    void shouldReturnDuetGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(120, Genres.convertStringGenreToIndexID3v1("Duet"));
    }

    @Test
    @DisplayName("Should return Punk Rock ID3v1 genre")
    void shouldReturnPunkRockGenre() {
        Assertions.assertEquals("Punk Rock", Genres.ID3V1_TAG_GENRES[121]);
    }

    @Test
    @DisplayName("Should return Punk Rock ID3v1 genre index")
    void shouldReturnPunkRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(121, Genres.convertStringGenreToIndexID3v1("Punk Rock"));
    }

    @Test
    @DisplayName("Should return Drum Solo ID3v1 genre")
    void shouldReturnDrumSoloGenre() {
        Assertions.assertEquals("Drum Solo", Genres.ID3V1_TAG_GENRES[122]);
    }

    @Test
    @DisplayName("Should return Drum Solo ID3v1 genre index")
    void shouldReturnDrumSoloGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(122, Genres.convertStringGenreToIndexID3v1("Drum Solo"));
    }

    @Test
    @DisplayName("Should return A cappella ID3v1 genre")
    void shouldReturnAcappellaGenre() {
        Assertions.assertEquals("A cappella", Genres.ID3V1_TAG_GENRES[123]);
    }

    @Test
    @DisplayName("Should return A cappella ID3v1 genre index")
    void shouldReturnAcappellaGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(123, Genres.convertStringGenreToIndexID3v1("A cappella"));
    }

    @Test
    @DisplayName("Should return Euro-House ID3v1 genre")
    void shouldReturnEuroHouseGenre() {
        Assertions.assertEquals("Euro-House", Genres.ID3V1_TAG_GENRES[124]);
    }

    @Test
    @DisplayName("Should return Euro-House ID3v1 genre index")
    void shouldReturnEuroHouseGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(124, Genres.convertStringGenreToIndexID3v1("Euro-House"));
    }

    @Test
    @DisplayName("Should return Dance Hall ID3v1 genre")
    void shouldReturnDanceHallGenre() {
        Assertions.assertEquals("Dance Hall", Genres.ID3V1_TAG_GENRES[125]);
    }

    @Test
    @DisplayName("Should return Dance Hall ID3v1 genre index")
    void shouldReturnDanceHallGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(125, Genres.convertStringGenreToIndexID3v1("Dance Hall"));
    }

    @Test
    @DisplayName("Should return Goa music ID3v1 genre")
    void shouldReturnGoamusicGenre() {
        Assertions.assertEquals("Goa music", Genres.ID3V1_TAG_GENRES[126]);
    }

    @Test
    @DisplayName("Should return Goa music ID3v1 genre index")
    void shouldReturnGoamusicGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(126, Genres.convertStringGenreToIndexID3v1("Goa music"));
    }

    @Test
    @DisplayName("Should return Drum & Bass ID3v1 genre")
    void shouldReturnDrumBassGenre() {
        Assertions.assertEquals("Drum & Bass", Genres.ID3V1_TAG_GENRES[127]);
    }

    @Test
    @DisplayName("Should return Drum & Bass ID3v1 genre index")
    void shouldReturnDrumBassGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(127, Genres.convertStringGenreToIndexID3v1("Drum & Bass"));
    }

    @Test
    @DisplayName("Should return Club-House ID3v1 genre")
    void shouldReturnClubHouseGenre() {
        Assertions.assertEquals("Club-House", Genres.ID3V1_TAG_GENRES[128]);
    }

    @Test
    @DisplayName("Should return Club-House ID3v1 genre index")
    void shouldReturnClubHouseGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(128, Genres.convertStringGenreToIndexID3v1("Club-House"));
    }

    @Test
    @DisplayName("Should return Hardcore Techno ID3v1 genre")
    void shouldReturnHardcoreTechnoGenre() {
        Assertions.assertEquals("Hardcore Techno", Genres.ID3V1_TAG_GENRES[129]);
    }

    @Test
    @DisplayName("Should return Hardcore Techno ID3v1 genre index")
    void shouldReturnHardcoreTechnoGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(129, Genres.convertStringGenreToIndexID3v1("Hardcore Techno"));
    }

    @Test
    @DisplayName("Should return Terror ID3v1 genre")
    void shouldReturnTerrorGenre() {
        Assertions.assertEquals("Terror", Genres.ID3V1_TAG_GENRES[130]);
    }

    @Test
    @DisplayName("Should return Terror ID3v1 genre index")
    void shouldReturnTerrorGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(130, Genres.convertStringGenreToIndexID3v1("Terror"));
    }

    @Test
    @DisplayName("Should return Indie ID3v1 genre")
    void shouldReturnIndieGenre() {
        Assertions.assertEquals("Indie", Genres.ID3V1_TAG_GENRES[131]);
    }

    @Test
    @DisplayName("Should return Indie ID3v1 genre index")
    void shouldReturnIndieGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(131, Genres.convertStringGenreToIndexID3v1("Indie"));
    }

    @Test
    @DisplayName("Should return BritPop ID3v1 genre")
    void shouldReturnBritPopGenre() {
        Assertions.assertEquals("BritPop", Genres.ID3V1_TAG_GENRES[132]);
    }

    @Test
    @DisplayName("Should return BritPop ID3v1 genre index")
    void shouldReturnBritPopGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(132, Genres.convertStringGenreToIndexID3v1("BritPop"));
    }

    @Test
    @DisplayName("Should return Negerpunk ID3v1 genre")
    void shouldReturnNegerpunkGenre() {
        Assertions.assertEquals("Negerpunk", Genres.ID3V1_TAG_GENRES[133]);
    }

    @Test
    @DisplayName("Should return Negerpunk ID3v1 genre index")
    void shouldReturnNegerpunkGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(133, Genres.convertStringGenreToIndexID3v1("Negerpunk"));
    }

    @Test
    @DisplayName("Should return Polsk Punk ID3v1 genre")
    void shouldReturnPolskPunkGenre() {
        Assertions.assertEquals("Polsk Punk", Genres.ID3V1_TAG_GENRES[134]);
    }

    @Test
    @DisplayName("Should return Polsk Punk ID3v1 genre index")
    void shouldReturnPolskPunkGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(134, Genres.convertStringGenreToIndexID3v1("Polsk Punk"));
    }

    @Test
    @DisplayName("Should return Beat ID3v1 genre")
    void shouldReturnBeatGenre() {
        Assertions.assertEquals("Beat", Genres.ID3V1_TAG_GENRES[135]);
    }

    @Test
    @DisplayName("Should return Beat ID3v1 genre index")
    void shouldReturnBeatGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(135, Genres.convertStringGenreToIndexID3v1("Beat"));
    }

    @Test
    @DisplayName("Should return Christian Gangsta Rap ID3v1 genre")
    void shouldReturnChristianGangstaRapGenre() {
        Assertions.assertEquals("Christian Gangsta Rap", Genres.ID3V1_TAG_GENRES[136]);
    }

    @Test
    @DisplayName("Should return Christian Gangsta Rap ID3v1 genre index")
    void shouldReturnChristianGangstaRapGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(136, Genres.convertStringGenreToIndexID3v1("Christian Gangsta Rap"));
    }

    @Test
    @DisplayName("Should return Heavy Metal ID3v1 genre")
    void shouldReturnHeavyMetalGenre() {
        Assertions.assertEquals("Heavy Metal", Genres.ID3V1_TAG_GENRES[137]);
    }

    @Test
    @DisplayName("Should return Heavy Metal ID3v1 genre index")
    void shouldReturnHeavyMetalGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(137, Genres.convertStringGenreToIndexID3v1("Heavy Metal"));
    }

    @Test
    @DisplayName("Should return Black Metal ID3v1 genre")
    void shouldReturnBlackMetalGenre() {
        Assertions.assertEquals("Black Metal", Genres.ID3V1_TAG_GENRES[138]);
    }

    @Test
    @DisplayName("Should return Black Metal ID3v1 genre index")
    void shouldReturnBlackMetalGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(138, Genres.convertStringGenreToIndexID3v1("Black Metal"));
    }

    @Test
    @DisplayName("Should return Crossover ID3v1 genre")
    void shouldReturnCrossoverGenre() {
        Assertions.assertEquals("Crossover", Genres.ID3V1_TAG_GENRES[139]);
    }

    @Test
    @DisplayName("Should return Crossover ID3v1 genre index")
    void shouldReturnCrossoverGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(139, Genres.convertStringGenreToIndexID3v1("Crossover"));
    }

    @Test
    @DisplayName("Should return Contemporary Christian ID3v1 genre")
    void shouldReturnContemporaryChristianGenre() {
        Assertions.assertEquals("Contemporary Christian", Genres.ID3V1_TAG_GENRES[140]);
    }

    @Test
    @DisplayName("Should return Contemporary Christian ID3v1 genre index")
    void shouldReturnContemporaryChristianGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(140, Genres.convertStringGenreToIndexID3v1("Contemporary Christian"));
    }

    @Test
    @DisplayName("Should return Christian Rock ID3v1 genre")
    void shouldReturnChristianRockGenre() {
        Assertions.assertEquals("Christian Rock", Genres.ID3V1_TAG_GENRES[141]);
    }

    @Test
    @DisplayName("Should return Christian Rock ID3v1 genre index")
    void shouldReturnChristianRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(141, Genres.convertStringGenreToIndexID3v1("Christian Rock"));
    }

    @Test
    @DisplayName("Should return Merenegue ID3v1 genre")
    void shouldReturnMerenegueGenre() {
        Assertions.assertEquals("Merenegue", Genres.ID3V1_TAG_GENRES[142]);
    }

    @Test
    @DisplayName("Should return Merenegue ID3v1 genre index")
    void shouldReturnMerenegueGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(142, Genres.convertStringGenreToIndexID3v1("Merenegue"));
    }

    @Test
    @DisplayName("Should return Salsa ID3v1 genre")
    void shouldReturnSalsaGenre() {
        Assertions.assertEquals("Salsa", Genres.ID3V1_TAG_GENRES[143]);
    }

    @Test
    @DisplayName("Should return Salsa ID3v1 genre index")
    void shouldReturnSalsaGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(143, Genres.convertStringGenreToIndexID3v1("Salsa"));
    }

    @Test
    @DisplayName("Should return Thrash Metal ID3v1 genre")
    void shouldReturnThrashMetalGenre() {
        Assertions.assertEquals("Thrash Metal", Genres.ID3V1_TAG_GENRES[144]);
    }

    @Test
    @DisplayName("Should return Thrash Metal ID3v1 genre index")
    void shouldReturnThrashMetalGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(144, Genres.convertStringGenreToIndexID3v1("Thrash Metal"));
    }

    @Test
    @DisplayName("Should return Anime ID3v1 genre")
    void shouldReturnAnimeGenre() {
        Assertions.assertEquals("Anime", Genres.ID3V1_TAG_GENRES[145]);
    }

    @Test
    @DisplayName("Should return Anime ID3v1 genre index")
    void shouldReturnAnimeGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(145, Genres.convertStringGenreToIndexID3v1("Anime"));
    }

    @Test
    @DisplayName("Should return Jpop ID3v1 genre")
    void shouldReturnJpopGenre() {
        Assertions.assertEquals("Jpop", Genres.ID3V1_TAG_GENRES[146]);
    }

    @Test
    @DisplayName("Should return Jpop ID3v1 genre index")
    void shouldReturnJpopGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(146, Genres.convertStringGenreToIndexID3v1("Jpop"));
    }

    @Test
    @DisplayName("Should return Synthpop ID3v1 genre")
    void shouldReturnSynthpopGenre() {
        Assertions.assertEquals("Synthpop", Genres.ID3V1_TAG_GENRES[147]);
    }

    @Test
    @DisplayName("Should return Synthpop ID3v1 genre index")
    void shouldReturnSynthpopGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(147, Genres.convertStringGenreToIndexID3v1("Synthpop"));
    }

    @Test
    @DisplayName("Should return Abstract ID3v1 genre")
    void shouldReturnAbstractGenre() {
        Assertions.assertEquals("Abstract", Genres.ID3V1_TAG_GENRES[148]);
    }

    @Test
    @DisplayName("Should return Abstract ID3v1 genre index")
    void shouldReturnAbstractGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(148, Genres.convertStringGenreToIndexID3v1("Abstract"));
    }

    @Test
    @DisplayName("Should return Art Rock ID3v1 genre")
    void shouldReturnArtRockGenre() {
        Assertions.assertEquals("Art Rock", Genres.ID3V1_TAG_GENRES[149]);
    }

    @Test
    @DisplayName("Should return Art Rock ID3v1 genre index")
    void shouldReturnArtRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(149, Genres.convertStringGenreToIndexID3v1("Art Rock"));
    }

    @Test
    @DisplayName("Should return Baroque ID3v1 genre")
    void shouldReturnBaroqueGenre() {
        Assertions.assertEquals("Baroque", Genres.ID3V1_TAG_GENRES[150]);
    }

    @Test
    @DisplayName("Should return Baroque ID3v1 genre index")
    void shouldReturnBaroqueGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(150, Genres.convertStringGenreToIndexID3v1("Baroque"));
    }

    @Test
    @DisplayName("Should return Bhangra ID3v1 genre")
    void shouldReturnBhangraGenre() {
        Assertions.assertEquals("Bhangra", Genres.ID3V1_TAG_GENRES[151]);
    }

    @Test
    @DisplayName("Should return Bhangra ID3v1 genre index")
    void shouldReturnBhangraGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(151, Genres.convertStringGenreToIndexID3v1("Bhangra"));
    }

    @Test
    @DisplayName("Should return Big beat ID3v1 genre")
    void shouldReturnBigbeatGenre() {
        Assertions.assertEquals("Big beat", Genres.ID3V1_TAG_GENRES[152]);
    }

    @Test
    @DisplayName("Should return Big beat ID3v1 genre index")
    void shouldReturnBigbeatGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(152, Genres.convertStringGenreToIndexID3v1("Big beat"));
    }

    @Test
    @DisplayName("Should return Breakbeat ID3v1 genre")
    void shouldReturnBreakbeatGenre() {
        Assertions.assertEquals("Breakbeat", Genres.ID3V1_TAG_GENRES[153]);
    }

    @Test
    @DisplayName("Should return Breakbeat ID3v1 genre index")
    void shouldReturnBreakbeatGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(153, Genres.convertStringGenreToIndexID3v1("Breakbeat"));
    }

    @Test
    @DisplayName("Should return Chillout ID3v1 genre")
    void shouldReturnChilloutGenre() {
        Assertions.assertEquals("Chillout", Genres.ID3V1_TAG_GENRES[154]);
    }

    @Test
    @DisplayName("Should return Chillout ID3v1 genre index")
    void shouldReturnChilloutGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(154, Genres.convertStringGenreToIndexID3v1("Chillout"));
    }

    @Test
    @DisplayName("Should return Downtempo ID3v1 genre")
    void shouldReturnDowntempoGenre() {
        Assertions.assertEquals("Downtempo", Genres.ID3V1_TAG_GENRES[155]);
    }

    @Test
    @DisplayName("Should return Downtempo ID3v1 genre index")
    void shouldReturnDowntempoGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(155, Genres.convertStringGenreToIndexID3v1("Downtempo"));
    }

    @Test
    @DisplayName("Should return Dub ID3v1 genre")
    void shouldReturnDubGenre() {
        Assertions.assertEquals("Dub", Genres.ID3V1_TAG_GENRES[156]);
    }

    @Test
    @DisplayName("Should return Dub ID3v1 genre index")
    void shouldReturnDubGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(156, Genres.convertStringGenreToIndexID3v1("Dub"));
    }

    @Test
    @DisplayName("Should return EBM ID3v1 genre")
    void shouldReturnEBMGenre() {
        Assertions.assertEquals("EBM", Genres.ID3V1_TAG_GENRES[157]);
    }

    @Test
    @DisplayName("Should return EBM ID3v1 genre index")
    void shouldReturnEBMGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(157, Genres.convertStringGenreToIndexID3v1("EBM"));
    }

    @Test
    @DisplayName("Should return Eclectic ID3v1 genre")
    void shouldReturnEclecticGenre() {
        Assertions.assertEquals("Eclectic", Genres.ID3V1_TAG_GENRES[158]);
    }

    @Test
    @DisplayName("Should return Eclectic ID3v1 genre index")
    void shouldReturnEclecticGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(158, Genres.convertStringGenreToIndexID3v1("Eclectic"));
    }

    @Test
    @DisplayName("Should return Electro ID3v1 genre")
    void shouldReturnElectroGenre() {
        Assertions.assertEquals("Electro", Genres.ID3V1_TAG_GENRES[159]);
    }

    @Test
    @DisplayName("Should return Electro ID3v1 genre index")
    void shouldReturnElectroGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(159, Genres.convertStringGenreToIndexID3v1("Electro"));
    }

    @Test
    @DisplayName("Should return Electroclash ID3v1 genre")
    void shouldReturnElectroclashGenre() {
        Assertions.assertEquals("Electroclash", Genres.ID3V1_TAG_GENRES[160]);
    }

    @Test
    @DisplayName("Should return Electroclash ID3v1 genre index")
    void shouldReturnElectroclashGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(160, Genres.convertStringGenreToIndexID3v1("Electroclash"));
    }

    @Test
    @DisplayName("Should return Emo ID3v1 genre")
    void shouldReturnEmoGenre() {
        Assertions.assertEquals("Emo", Genres.ID3V1_TAG_GENRES[161]);
    }

    @Test
    @DisplayName("Should return Emo ID3v1 genre index")
    void shouldReturnEmoGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(161, Genres.convertStringGenreToIndexID3v1("Emo"));
    }

    @Test
    @DisplayName("Should return Experimental ID3v1 genre")
    void shouldReturnExperimentalGenre() {
        Assertions.assertEquals("Experimental", Genres.ID3V1_TAG_GENRES[162]);
    }

    @Test
    @DisplayName("Should return Experimental ID3v1 genre index")
    void shouldReturnExperimentalGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(162, Genres.convertStringGenreToIndexID3v1("Experimental"));
    }

    @Test
    @DisplayName("Should return Garage ID3v1 genre")
    void shouldReturnGarageGenre() {
        Assertions.assertEquals("Garage", Genres.ID3V1_TAG_GENRES[163]);
    }

    @Test
    @DisplayName("Should return Garage ID3v1 genre index")
    void shouldReturnGarageGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(163, Genres.convertStringGenreToIndexID3v1("Garage"));
    }

    @Test
    @DisplayName("Should return Global ID3v1 genre")
    void shouldReturnGlobalGenre() {
        Assertions.assertEquals("Global", Genres.ID3V1_TAG_GENRES[164]);
    }

    @Test
    @DisplayName("Should return Global ID3v1 genre index")
    void shouldReturnGlobalGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(164, Genres.convertStringGenreToIndexID3v1("Global"));
    }

    @Test
    @DisplayName("Should return IDM ID3v1 genre")
    void shouldReturnIDMGenre() {
        Assertions.assertEquals("IDM", Genres.ID3V1_TAG_GENRES[165]);
    }

    @Test
    @DisplayName("Should return IDM ID3v1 genre index")
    void shouldReturnIDMGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(165, Genres.convertStringGenreToIndexID3v1("IDM"));
    }

    @Test
    @DisplayName("Should return Illbient ID3v1 genre")
    void shouldReturnIllbientGenre() {
        Assertions.assertEquals("Illbient", Genres.ID3V1_TAG_GENRES[166]);
    }

    @Test
    @DisplayName("Should return Illbient ID3v1 genre index")
    void shouldReturnIllbientGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(166, Genres.convertStringGenreToIndexID3v1("Illbient"));
    }

    @Test
    @DisplayName("Should return Industro-Goth ID3v1 genre")
    void shouldReturnIndustroGothGenre() {
        Assertions.assertEquals("Industro-Goth", Genres.ID3V1_TAG_GENRES[167]);
    }

    @Test
    @DisplayName("Should return Industro-Goth ID3v1 genre index")
    void shouldReturnIndustroGothGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(167, Genres.convertStringGenreToIndexID3v1("Industro-Goth"));
    }

    @Test
    @DisplayName("Should return Jam Band ID3v1 genre")
    void shouldReturnJamBandGenre() {
        Assertions.assertEquals("Jam Band", Genres.ID3V1_TAG_GENRES[168]);
    }

    @Test
    @DisplayName("Should return Jam Band ID3v1 genre index")
    void shouldReturnJamBandGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(168, Genres.convertStringGenreToIndexID3v1("Jam Band"));
    }

    @Test
    @DisplayName("Should return Krautrock ID3v1 genre")
    void shouldReturnKrautrockGenre() {
        Assertions.assertEquals("Krautrock", Genres.ID3V1_TAG_GENRES[169]);
    }

    @Test
    @DisplayName("Should return Krautrock ID3v1 genre index")
    void shouldReturnKrautrockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(169, Genres.convertStringGenreToIndexID3v1("Krautrock"));
    }

    @Test
    @DisplayName("Should return Leftfield ID3v1 genre")
    void shouldReturnLeftfieldGenre() {
        Assertions.assertEquals("Leftfield", Genres.ID3V1_TAG_GENRES[170]);
    }

    @Test
    @DisplayName("Should return Leftfield ID3v1 genre index")
    void shouldReturnLeftfieldGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(170, Genres.convertStringGenreToIndexID3v1("Leftfield"));
    }

    @Test
    @DisplayName("Should return Lounge ID3v1 genre")
    void shouldReturnLoungeGenre() {
        Assertions.assertEquals("Lounge", Genres.ID3V1_TAG_GENRES[171]);
    }

    @Test
    @DisplayName("Should return Lounge ID3v1 genre index")
    void shouldReturnLoungeGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(171, Genres.convertStringGenreToIndexID3v1("Lounge"));
    }

    @Test
    @DisplayName("Should return Math Rock ID3v1 genre")
    void shouldReturnMathRockGenre() {
        Assertions.assertEquals("Math Rock", Genres.ID3V1_TAG_GENRES[172]);
    }

    @Test
    @DisplayName("Should return Math Rock ID3v1 genre index")
    void shouldReturnMathRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(172, Genres.convertStringGenreToIndexID3v1("Math Rock"));
    }

    @Test
    @DisplayName("Should return New Romantic ID3v1 genre")
    void shouldReturnNewRomanticGenre() {
        Assertions.assertEquals("New Romantic", Genres.ID3V1_TAG_GENRES[173]);
    }

    @Test
    @DisplayName("Should return New Romantic ID3v1 genre index")
    void shouldReturnNewRomanticGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(173, Genres.convertStringGenreToIndexID3v1("New Romantic"));
    }

    @Test
    @DisplayName("Should return Nu-Breakz ID3v1 genre")
    void shouldReturnNuBreakzGenre() {
        Assertions.assertEquals("Nu-Breakz", Genres.ID3V1_TAG_GENRES[174]);
    }

    @Test
    @DisplayName("Should return Nu-Breakz ID3v1 genre index")
    void shouldReturnNuBreakzGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(174, Genres.convertStringGenreToIndexID3v1("Nu-Breakz"));
    }

    @Test
    @DisplayName("Should return Post-Punk ID3v1 genre")
    void shouldReturnPostPunkGenre() {
        Assertions.assertEquals("Post-Punk", Genres.ID3V1_TAG_GENRES[175]);
    }

    @Test
    @DisplayName("Should return Post-Punk ID3v1 genre index")
    void shouldReturnPostPunkGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(175, Genres.convertStringGenreToIndexID3v1("Post-Punk"));
    }

    @Test
    @DisplayName("Should return Post-Rock ID3v1 genre")
    void shouldReturnPostRockGenre() {
        Assertions.assertEquals("Post-Rock", Genres.ID3V1_TAG_GENRES[176]);
    }

    @Test
    @DisplayName("Should return Post-Rock ID3v1 genre index")
    void shouldReturnPostRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(176, Genres.convertStringGenreToIndexID3v1("Post-Rock"));
    }

    @Test
    @DisplayName("Should return Psytrance ID3v1 genre")
    void shouldReturnPsytranceGenre() {
        Assertions.assertEquals("Psytrance", Genres.ID3V1_TAG_GENRES[177]);
    }

    @Test
    @DisplayName("Should return Psytrance ID3v1 genre index")
    void shouldReturnPsytranceGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(177, Genres.convertStringGenreToIndexID3v1("Psytrance"));
    }

    @Test
    @DisplayName("Should return Shoegaze ID3v1 genre")
    void shouldReturnShoegazeGenre() {
        Assertions.assertEquals("Shoegaze", Genres.ID3V1_TAG_GENRES[178]);
    }

    @Test
    @DisplayName("Should return Shoegaze ID3v1 genre index")
    void shouldReturnShoegazeGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(178, Genres.convertStringGenreToIndexID3v1("Shoegaze"));
    }

    @Test
    @DisplayName("Should return Space Rock ID3v1 genre")
    void shouldReturnSpaceRockGenre() {
        Assertions.assertEquals("Space Rock", Genres.ID3V1_TAG_GENRES[179]);
    }

    @Test
    @DisplayName("Should return Space Rock ID3v1 genre index")
    void shouldReturnSpaceRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(179, Genres.convertStringGenreToIndexID3v1("Space Rock"));
    }

    @Test
    @DisplayName("Should return Trop Rock ID3v1 genre")
    void shouldReturnTropRockGenre() {
        Assertions.assertEquals("Trop Rock", Genres.ID3V1_TAG_GENRES[180]);
    }

    @Test
    @DisplayName("Should return Trop Rock ID3v1 genre index")
    void shouldReturnTropRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(180, Genres.convertStringGenreToIndexID3v1("Trop Rock"));
    }

    @Test
    @DisplayName("Should return World Music ID3v1 genre")
    void shouldReturnWorldMusicGenre() {
        Assertions.assertEquals("World Music", Genres.ID3V1_TAG_GENRES[181]);
    }

    @Test
    @DisplayName("Should return World Music ID3v1 genre index")
    void shouldReturnWorldMusicGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(181, Genres.convertStringGenreToIndexID3v1("World Music"));
    }

    @Test
    @DisplayName("Should return Neoclassical ID3v1 genre")
    void shouldReturnNeoclassicalGenre() {
        Assertions.assertEquals("Neoclassical", Genres.ID3V1_TAG_GENRES[182]);
    }

    @Test
    @DisplayName("Should return Neoclassical ID3v1 genre index")
    void shouldReturnNeoclassicalGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(182, Genres.convertStringGenreToIndexID3v1("Neoclassical"));
    }

    @Test
    @DisplayName("Should return Audiobook ID3v1 genre")
    void shouldReturnAudiobookGenre() {
        Assertions.assertEquals("Audiobook", Genres.ID3V1_TAG_GENRES[183]);
    }

    @Test
    @DisplayName("Should return Audiobook ID3v1 genre index")
    void shouldReturnAudiobookGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(183, Genres.convertStringGenreToIndexID3v1("Audiobook"));
    }

    @Test
    @DisplayName("Should return Audio Theatre ID3v1 genre")
    void shouldReturnAudioTheatreGenre() {
        Assertions.assertEquals("Audio Theatre", Genres.ID3V1_TAG_GENRES[184]);
    }

    @Test
    @DisplayName("Should return Audio Theatre ID3v1 genre index")
    void shouldReturnAudioTheatreGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(184, Genres.convertStringGenreToIndexID3v1("Audio Theatre"));
    }

    @Test
    @DisplayName("Should return Neue Deutche Welle ID3v1 genre")
    void shouldReturnNeueDeutcheWelleGenre() {
        Assertions.assertEquals("Neue Deutche Welle", Genres.ID3V1_TAG_GENRES[185]);
    }

    @Test
    @DisplayName("Should return Neue Deutche Welle ID3v1 genre index")
    void shouldReturnNeueDeutcheWelleGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(185, Genres.convertStringGenreToIndexID3v1("Neue Deutche Welle"));
    }

    @Test
    @DisplayName("Should return Podcast ID3v1 genre")
    void shouldReturnPodcastGenre() {
        Assertions.assertEquals("Podcast", Genres.ID3V1_TAG_GENRES[186]);
    }

    @Test
    @DisplayName("Should return Podcast ID3v1 genre index")
    void shouldReturnPodcastGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(186, Genres.convertStringGenreToIndexID3v1("Podcast"));
    }

    @Test
    @DisplayName("Should return Inde-Rock ID3v1 genre")
    void shouldReturnIndeRockGenre() {
        Assertions.assertEquals("Inde-Rock", Genres.ID3V1_TAG_GENRES[187]);
    }

    @Test
    @DisplayName("Should return Inde-Rock ID3v1 genre index")
    void shouldReturnIndeRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(187, Genres.convertStringGenreToIndexID3v1("Inde-Rock"));
    }

    @Test
    @DisplayName("Should return G-Funk ID3v1 genre")
    void shouldReturnGFunkGenre() {
        Assertions.assertEquals("G-Funk", Genres.ID3V1_TAG_GENRES[188]);
    }

    @Test
    @DisplayName("Should return G-Funk ID3v1 genre index")
    void shouldReturnGFunkGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(188, Genres.convertStringGenreToIndexID3v1("G-Funk"));
    }

    @Test
    @DisplayName("Should return Dubstep ID3v1 genre")
    void shouldReturnDubstepGenre() {
        Assertions.assertEquals("Dubstep", Genres.ID3V1_TAG_GENRES[189]);
    }

    @Test
    @DisplayName("Should return Dubstep ID3v1 genre index")
    void shouldReturnDubstepGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(189, Genres.convertStringGenreToIndexID3v1("Dubstep"));
    }

    @Test
    @DisplayName("Should return Garage Rock ID3v1 genre")
    void shouldReturnGarageRockGenre() {
        Assertions.assertEquals("Garage Rock", Genres.ID3V1_TAG_GENRES[190]);
    }

    @Test
    @DisplayName("Should return Garage Rock ID3v1 genre index")
    void shouldReturnGarageRockGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(190, Genres.convertStringGenreToIndexID3v1("Garage Rock"));
    }

    @Test
    @DisplayName("Should return Psybient ID3v1 genre")
    void shouldReturnPsybientGenre() {
        Assertions.assertEquals("Psybient", Genres.ID3V1_TAG_GENRES[191]);
    }

    @Test
    @DisplayName("Should return Psybient ID3v1 genre index")
    void shouldReturnPsybientGenreIndex() throws InvalidGenreException {
        Assertions.assertEquals(191, Genres.convertStringGenreToIndexID3v1("Psybient"));
    }
}
