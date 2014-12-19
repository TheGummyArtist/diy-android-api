package me.ryanw.diy.Data;

import com.google.gson.annotations.SerializedName;

public abstract class Authorize {

    @SerializedName("id")
    private static int makerID;

    @SerializedName("url")
    private static String makerName;

    @SerializedName("token")
    private static String TokenHMAC;

    @SerializedName("moderator")
    private static boolean isModerator;

    @SerializedName("adult")
    private static boolean isAdult;

    @SerializedName("subscriber")
    private static boolean isSubscriber;

    @SerializedName("verified")
    private static boolean isVerified;

    /**
     * Gets the Maker's numeric ID
     * @return Maker Numeric ID
     */
    public static int getMakerID() {
        return makerID;
    }

    /**
     * Gets the Maker's display name
     * @return Maker display name
     */
    public static String getMakerName() {
        return makerName;
    }

    /**
     * Gets the Maker's HMAC Token
     * @return Maker HMAC Token
     */
    public static String getTokenHMAC() {
        return TokenHMAC;
    }

    /**
     * Checks if the user is a moderator
     * @return isModerator boolean
     */
    public static boolean isModerator() {
        return isModerator;
    }

    /**
     * Checks if the user is a adult
     * @return isAdult boolean
     */
    public static boolean isAdult() {
        return isAdult;
    }

    /**
     * Checks if the user is a subscriber
     * @return isSubscriber boolean
     */
    public static boolean isSubscriber() {
        return isSubscriber;
    }

    /**
     * Checks if the user is verified
     * @return isVerified boolean
     */
    public static boolean isVerified() {
        return isVerified;
    }
}
