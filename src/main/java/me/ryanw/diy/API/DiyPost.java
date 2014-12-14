package me.ryanw.diy.API;

public class DiyPost {

    /**
     * Achievement - Achievements represent completed and pending challenge solutions for a maker.
     * @return Creates a new maker achievement for the specified project and challenge id.
     */
    public static String addAchievement(int projectID, int challengeID) {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID() + "/achievements";
    }

    /**
     * Clip - A clip represents a single piece of media from a maker related to a project.
     * @return Creates a new clip for the specified project.
     */
    public static String addClip() {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID()
                + "/projects/" + QueryData.getProjectID() + "/clips";
    }

    /**
     * Comment - A comment represents a single text object from a maker related to a project.
     * @return Creates a new comment for the specified project.
     */
    public static String addComment() {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID()
                + "/projects/" + QueryData.getProjectID() + "/comments";
    }

    /**
     * Example - An example represents a reference or guide for completing a challenge.
     * @return Creates a new example for the specified skill and challenge.
     */
    public static String addExample() {
        return QueryData.getBaseURL() + "/skills/" + QueryData.getSkillID()
                + "/challenges/" + QueryData.getChallengeID() + "/examples";
    }

    /**
     * Favorite - Favorites represent projects that have been selected by a maker.
     * @return Creates a new favorite for the specified project.
     */
    public static String addFavorite() {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID()
                + "/projects/" + QueryData.getProjectID() + "/favorites";
    }

    /**
     * Friend - Friends represent makers that have been either followed or are following a maker.
     * @return Adds a new follower.
     */
    public static String addFollower() {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID() + "/following";
    }

    /**
     * Project - A project represents a collection of unique shots of various media types from a maker.
     * @return Creates a new project instance.
     */
    public static String addProject() {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID() + "/projects";
    }

    /**
     * Maker - A maker represents a single child user within the DIY ecosystem.
     * @return Creates a new maker instance.
     */
    public static String addMaker() {
        return QueryData.getBaseURL() + "/makers";
    }

    // End of file
}
