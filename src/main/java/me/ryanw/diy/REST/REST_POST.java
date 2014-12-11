package me.ryanw.diy.REST;

public class REST_POST {

    private static String makerID;
    private static String challengeID;
    private static String skillID;
    private static String projectID;
    private static String baseURL = "https://api.diy.org";

    /**
     * @return Creates a new maker achivement for the specified project and challenge id.
     */
    public static String addAchievement(int projectID, int challengeID) {
        return baseURL + "/makers/" + makerID + "/achievements";
    }

    /**
     * @return Creates a new clip for the specified project.
     */
    public static String addClip() {
        return baseURL + "/makers/" + makerID + "/projects/" + projectID + "/clips";
    }

    /**
     * @return Creates a new comment for the specified project.
     */
    public static String addComment() {
        return baseURL + "/makers/" + makerID + "/projects/" + projectID + "/comments";
    }

    /**
     * @return Creates a new example for the specified skill and challenge.
     */
    public static String addExample() {
        return baseURL + "/skills/" + skillID + "/challenges/" + challengeID + "/examples";
    }

    /**
     * @return Creates a new favorite for the specified project.
     */
    public static String addFavorite() {
        return baseURL + "/makers/" + makerID + "/projects/" + projectID + "/favorites";
    }

    /**
     * @return Adds a new follower.
     */
    public static String addFollower() {
        return baseURL + "/makers/" + makerID + "/following";
    }

    /**
     * @return Creates a new project instance.
     */
    public static String addProject() {
        return baseURL + "/makers/" + makerID + "/projects";
    }

    /**
     * @return Creates a new maker instance.
     */
    public static String addMaker() {
        return baseURL + "/makers";
    }
}
