package me.ryanw.diy.API;

public class QueryData {

    private static String baseURL;
    private static int makerID;
    private static int projectID;
    private static int clipID;
    private static int commentID;
    private static int skillID;
    private static int challengeID;
    private static int achievementID;
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

    public static int getAchievementID() { return achievementID; }

    public static void setBaseURL(String URL) {
        QueryData.baseURL = URL;
    }

    public static void setMakerID(int ID) {
        QueryData.makerID = ID;
    }

    public static void setProjectID(int ID) {
        QueryData.projectID = ID;
    }

    public static void setClipID(int ID) {
        QueryData.clipID = ID;
    }

    public static void setCommentID(int ID) {
        QueryData.commentID = ID;
    }

    public static void setSkillID(int ID) {
        QueryData.skillID = ID;
    }

    public static void setChallengeID(int ID) {
        QueryData.challengeID = ID;
    }

    public static void setExampleID(int ID) {
        QueryData.exampleID = ID;
    }

    public static void setAchievementID(int ID) {QueryData.achievementID = ID; }
}
