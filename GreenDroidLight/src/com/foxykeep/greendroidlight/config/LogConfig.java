package com.foxykeep.greendroidlight.config;

@SuppressWarnings("all")
public class LogConfig {

    private LogConfig() {
    }

    private static final int LOG_LEVEL_INFO = 3;
    private static final int LOG_LEVEL_WARNING = 2;
    private static final int LOG_LEVEL_ERROR = 1;
    private static final int LOG_LEVEL_NONE = 0;

    /**
     * Set this flag to GD_LOG_LEVEL_NONE when releasing your application in order to remove all logs generated by GreenDroid.
     */
    private static final int LOG_LEVEL = LOG_LEVEL_NONE;

    /**
     * Indicates whether info logs are enabled. This should be true only when developing/debugging an application/the library
     */
    public static final boolean GD_INFO_LOGS_ENABLED = (LOG_LEVEL == LOG_LEVEL_INFO);

    /**
     * Indicates whether warning logs are enabled
     */
    public static final boolean GD_WARNING_LOGS_ENABLED = GD_INFO_LOGS_ENABLED || (LOG_LEVEL == LOG_LEVEL_WARNING);

    /**
     * Indicates whether error logs are enabled. Error logs are usually always enabled, even in production releases.
     */
    public static final boolean GD_ERROR_LOGS_ENABLED = GD_WARNING_LOGS_ENABLED || (LOG_LEVEL == LOG_LEVEL_ERROR);

}
