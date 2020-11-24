package DataStore;

import Exceptions.SpeedOutOfBoundsException;

public class Speeds {

    private static final int SPEED_LOWER_BOUND = 0;
    private static final int SPEED_UPPER_BOUND = 4;
    private static final String[] SPEEDS = {"Unset", "Slow", "Medium", "Fast", "Hardcore"};

    public static String getSpeedFromIndexID3v1Enhanced(int index) throws SpeedOutOfBoundsException {
        if (index >= SPEED_LOWER_BOUND && index <= SPEED_UPPER_BOUND) {
            return SPEEDS[index];
        } else {
            throw new SpeedOutOfBoundsException("[SPEED OUT OF RANGE EXCEPTION] " + index + " is not in range " + SPEED_LOWER_BOUND + " to " + SPEED_UPPER_BOUND);
        }
    }
}