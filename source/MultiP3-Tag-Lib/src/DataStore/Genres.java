package DataStore;

import Exceptions.GenreOutOfBoundsException;
import Exceptions.InvalidGenreException;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Genres {

    public static final int ID3V1_GENRES = 192;
    private static final int ID3V1_GENRES_LOWER_BOUND = 0;
    private static final int ID3V1_GENRES_UPPER_BOUND = 191;
    private static final String[] ID3V1_TAG_GENRES =
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
        if (index >= ID3V1_GENRES_LOWER_BOUND && index <= ID3V1_GENRES_UPPER_BOUND) {
            return ID3V1_TAG_GENRES[index];
        } else {
            throw new GenreOutOfBoundsException("[GENRE OUT OF BOUNDS EXCEPTION] " + index + " is not in the range of " + ID3V1_GENRES_LOWER_BOUND + " to " + ID3V1_GENRES_UPPER_BOUND);
        }
    }

    /**
     * Gets the genre corresponding to the index.
     *
     * @param index The index of the genre.
     * @return The genre corresponding to the genre.
     */
    /*
    public static String getGenreFromIndexID3v1EnhancedTag(int index) throws GenreOutOfBoundsException {
        if (index >= ID3V1_ENHANCED_LOWER_BOUND && index <= ID3V1_ENHANCED_UPPER_BOUND) {
            return ID3V1_ENHANCED_TAG_GENRES[index];
        } else {
            throw new GenreOutOfBoundsException("[GENRE OUT OF BOUNDS EXCEPTION] " + index + " is not in the range of " + ID3V1_ENHANCED_LOWER_BOUND + " to " + ID3V1_ENHANCED_UPPER_BOUND);
        }
    }
     */

    /**
     * Converts a string genre to the corresponding ID3v1 genre index.
     *
     * @param genre The string genre to be converted.
     * @return The index of the ID3v1 genre.
     * @throws InvalidGenreException Thrown if the genre is not in the list of ID3v1 genres.
     */
    public static int convertStringGenreToIndexID3v1(String genre) throws InvalidGenreException {
        // Convert genres to lowercase for comparison
        ArrayList<String> genres = new ArrayList<>(List.of(ID3V1_TAG_GENRES));
        ListIterator<String> iterator = genres.listIterator();
        while (iterator.hasNext())
        {
            iterator.set(iterator.next().toLowerCase());
        }

        if (genres.contains(genre.toLowerCase())) {
            return genre.indexOf(genre.toLowerCase());
        } else {
            throw new InvalidGenreException("[INVALID GENRE EXCEPTION] " + genre + " is not a valid ID3v1 genre");
        }
    }

    public static String[] getId3v1TagGenres() {
        return ID3V1_TAG_GENRES;
    }
}