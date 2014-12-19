package me.ryanw.diy.Data;

import com.google.gson.annotations.SerializedName;

public abstract class Achievement {

    @SerializedName("id")
    private static int ID;

    @SerializedName("status")
    private static String status;

    @SerializedName("stamp")
    private static String date;

}
