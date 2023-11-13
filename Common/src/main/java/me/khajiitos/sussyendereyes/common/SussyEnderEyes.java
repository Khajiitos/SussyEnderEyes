package me.khajiitos.sussyendereyes.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SussyEnderEyes {
    public static final String MOD_ID = "sussyendereyes";
    public static final Logger LOGGER = LoggerFactory.getLogger("Sussy Ender Eyes");

    public static int currentTuneStage = 0;
    public static float[] melodyNotes = { 1.0f, 1.122462f, 1.259921f, 1.587401f, 1.259921f, 1.122462f, 1.0f, 0.8f, 1.159921f, 1.0f };

    public static long lastTimePlayed = 0;
}
