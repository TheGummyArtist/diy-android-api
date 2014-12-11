package me.ryanw.diy.REST;

public class REST {

    private static String baseURL;
    private static Long makerID;
    private static Long projectID;
    private static Long clipID;
    private static Long commentID;
    private static Long skillID;
    private static Long challengeID;
    private static Long exampleID;

    public static String getBaseURL() {
        return baseURL;
    }

    public static Long getMakerID() {
        return makerID;
    }

    public static Long getProjectID() {
        return projectID;
    }

    public static Long getClipID() {
        return clipID;
    }

    public static Long getCommentID() {
        return commentID;
    }

    public static Long getSkillID() {
        return skillID;
    }

    public static Long getChallengeID() {
        return challengeID;
    }

    public static Long getExampleID() {
        return exampleID;
    }

    public static void setBaseURL(String URL) {
        REST.baseURL = URL;
    }

    public static void setMakerID(Long ID) {
        REST.makerID = ID;
    }

    public static void setProjectID(Long ID) {
        REST.projectID = ID;
    }

    public static void setClipID(Long ID) {
        REST.clipID = ID;
    }

    public static void setCommentID(Long ID) {
        REST.commentID = ID;
    }

    public static void setSkillID(Long ID) {
        REST.skillID = ID;
    }

    public static void setChallengeID(Long ID) {
        REST.challengeID = ID;
    }

    public static void setExampleID(Long ID) {
        REST.exampleID = ID;
    }





}
