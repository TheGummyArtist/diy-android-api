package me.ryanw.diy.Data;

import com.google.gson.annotations.SerializedName;

public abstract class BasicRequest {

    @SerializedName("code")
    private static int response_code;

    @SerializedName("status")
    private static String status_string;

    @SerializedName("limit")
    private static int limit;

    @SerializedName("offset")
    private static int offset;

    /**
     * Get the Request response code!
     * @return Request response integer
     */
    public static int getResponseCode() {
        return response_code;
    }

    /**
     * Gets the request response message!
     * @return Simple request response message
     */
    public static String getResponseMsg() {
        return status_string;
    }

    /**
     * Gets the request offset amount
     * @return Returns the offset amount for request
     */
    public static int getOffsetAmount() {
        return offset;
    }

    /**
     * Sets the offset amount for a request
     * @param offset
     */
    public static void setOffsetAmount(int offset) {
        BasicRequest.offset = offset;
    }

    /**
     * Gets the request limit amount
     * @return Returns the limit amount for request
     */
    public static int getLimitAmount() {
        return limit;
    }

    /**
     * Sets the amount of results to display for request
     * @param limit
     */
    public static void setLimitAmount(int limit) {
        BasicRequest.limit = limit;
    }

}
