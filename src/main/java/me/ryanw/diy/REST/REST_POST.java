package me.ryanw.diy.REST;

public class REST_POST {

    /**
     * Achievement - Achievements represent completed and pending challenge solutions for a maker.
     * @return Creates a new maker achievement for the specified project and challenge id.
     */
    public static String addAchievement(int projectID, int challengeID) {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID() + "/achievements";
    }

    /**
     * Clip - A clip represents a single piece of media from a maker related to a project.
     * @return Creates a new clip for the specified project.
     */
    public static String addClip() {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID()
                + "/projects/" + REST.getProjectID() + "/clips";
    }

    /**
     * Comment - A comment represents a single text object from a maker related to a project.
     * @return Creates a new comment for the specified project.
     */
    public static String addComment() {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID()
                + "/projects/" + REST.getProjectID() + "/comments";
    }

    /**
     * Example - An example represents a reference or guide for completing a challenge.
     * @return Creates a new example for the specified skill and challenge.
     */
    public static String addExample() {
        return REST.getBaseURL() + "/skills/" + REST.getSkillID()
                + "/challenges/" + REST.getChallengeID() + "/examples";
    }

    /**
     * Favorite - Favorites represent projects that have been selected by a maker.
     * @return Creates a new favorite for the specified project.
     */
    public static String addFavorite() {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID()
                + "/projects/" + REST.getProjectID() + "/favorites";
    }

    /**
     * Friend - Friends represent makers that have been either followed or are following a maker.
     * @return Adds a new follower.
     */
    public static String addFollower() {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID() + "/following";
    }

    /**
     * Project - A project represents a collection of unique shots of various media types from a maker.
     * @return Creates a new project instance.
     */
    public static String addProject() {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID() + "/projects";
    }

    /**
     * Maker - A maker represents a single child user within the DIY ecosystem.
     * @return Creates a new maker instance.
     */
    public static String addMaker() {
        return REST.getBaseURL() + "/makers";
    }
}
