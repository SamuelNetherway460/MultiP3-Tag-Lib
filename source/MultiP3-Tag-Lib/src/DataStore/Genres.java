package DataStore;

import Exceptions.GenreOutOfBoundsException;

public class Genres {

    private static final int ID3V1_LOWER_BOUND = 0;
    private static final int ID3V1_UPPER_BOUND = 79;
    private static final String[] ID3V1_TAG_GENRES =
        {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age",
            "Oldies", "Other", "Pop", "Rhythm and Blues", "Rap", "Reggae", "Rock", "Techno", "Industrial",
            "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal",
            "Jazz & Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound clip",
            "Gospel", "Noise", "Alternative Rock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop",
            "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk",
            "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk",
            "Jungle Music", "Native US", "Cabaret", "New Wave", "Psychedelic", "Rave", "Showtunes", "Trailer", "Lo-Fi",
            "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock 'n' Roll", "Hard Rock"};

    private static final int ID3V1_ENHANCED_LOWER_BOUND = 0;
    private static final int ID3V1_ENHANCED_UPPER_BOUND = 191;
    private static final String[] ID3V1_ENHANCED_TAG_GENRES =
        {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age",
            "Oldies", "Other", "Pop", "Rhythm and Blues", "Rap", "Reggae", "Rock", "Techno", "Industrial",
            "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal",
            "Jazz & Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound clip",
            "Gospel", "Noise", "Alternative Rock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop",
            "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk",
            "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk",
            "Jungle Music", "Native US", "Cabaret", "New Wave", "Psychedelic", "Rave", "Showtunes", "Trailer", "Lo-Fi",
            "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock 'n' Roll", "Hard Rock", "Folk",
            "Folk-Rock",  "National Folk", "Swing", "Fast Fusion", "Bebop", "Latin", "Revival", "Celtic", "Bluegrass",
            "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock",
            "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music",
            "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Grove", "Satire", "Slow Jam", "Club", "Tango", "Samba",
            "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo",
            "A cappella", "Euro-House", "Dance Hall", "Goa music", "Drum & Bass", "Club-House", "Hardcore Techno",
            "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal",
            "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merenegue", "Salsa",
            "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat",
            "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo",
            "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock",
            "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance",
            "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio Theatre",
            "Neue Deutche Welle", "Podcast", "Inde-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /**
     * Gets the genre corresponding to the index.
     *
     * @param index The index of the genre.
     * @return The genre corresponding to the genre.
     */
    public static String getGenreFromIndexID3v1Tag(int index) throws GenreOutOfBoundsException {
        if (index >= ID3V1_LOWER_BOUND && index <= ID3V1_UPPER_BOUND) {
            return ID3V1_TAG_GENRES[index];
        } else {
            throw new GenreOutOfBoundsException("[GENRE OUT OF BOUNDS EXCEPTION] " + index + " is not in the range of " + ID3V1_LOWER_BOUND + " to " + ID3V1_UPPER_BOUND);
        }
    }

    /**
     * Gets the genre corresponding to the index.
     *
     * @param index The index of the genre.
     * @return The genre corresponding to the genre.
     */
    public static String getGenreFromIndexID3v1EnhancedTag(int index) throws GenreOutOfBoundsException {
        if (index >= ID3V1_ENHANCED_LOWER_BOUND && index <= ID3V1_ENHANCED_UPPER_BOUND) {
            return ID3V1_ENHANCED_TAG_GENRES[index];
        } else {
            throw new GenreOutOfBoundsException("[GENRE OUT OF BOUNDS EXCEPTION] " + index + " is not in the range of " + ID3V1_ENHANCED_LOWER_BOUND + " to " + ID3V1_ENHANCED_UPPER_BOUND);
        }
    }
}