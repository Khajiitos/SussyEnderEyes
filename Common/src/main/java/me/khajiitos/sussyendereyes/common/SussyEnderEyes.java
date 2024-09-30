package me.khajiitos.sussyendereyes.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SussyEnderEyes {
    public static final String MOD_ID = "sussyendereyes";
    public static final Logger LOGGER = LoggerFactory.getLogger("Sussy Ender Eyes");

    public static int currentTuneStage = 0;
    public static float[] melodyNotes = { 0.94f, 1.11f, 1.22f, 1.3f, 1.22f, 1.11f, 0.94f, 0.87f, 1.05f, 0.94f };

    public static long lastTimePlayed = 0;
}
