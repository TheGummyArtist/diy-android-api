package me.ryanw.diy.REST;

public class REST {

    private static String baseURL;
    private static int makerID;
    private static int projectID;
    private static int clipID;
    private static int commentID;
    private static int skillID;
    private static int challengeID;
    private static int exampleID;

    public static String getBaseURL() {
        return baseURL;
    }

    public static int getMakerID() {
        return makerID;
    }

    public static int getProjectID() {
        return projectID;
    }

    public static int getClipID() {
        return clipID;
    }

    public static int getCommentID() {
        return commentID;
    }

    public static int getSkillID() {
        return skillID;
    }

    public static int getChallengeID() {
        return challengeID;
    }

    public static int getExampleID() {
        return exampleID;
    }

    public static void setBaseURL(String URL) {
        REST.baseURL = URL;
    }

    public static void setMakerID(int ID) {
        REST.makerID = ID;
    }

    public static void setProjectID(int ID) {
        REST.projectID = ID;
    }

    public static void setClipID(int ID) {
        REST.clipID = ID;
    }

    public static void setCommentID(int ID) {
        REST.commentID = ID;
    }

    public static void setSkillID(int ID) {
        REST.skillID = ID;
    }

    public static void setChallengeID(int ID) {
        REST.challengeID = ID;
    }

    public static void setExampleID(int ID) {
        REST.exampleID = ID;
    }





}
