package me.ryanw.diy.API;

public class DiyDelete {

    /**
     * Clips - A clip represents a single piece of media from a maker related to a project.
     * @return Deletes a specified clip.
     */
    public static String removeClip() {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID()
                + "/projects/" + QueryData.getProjectID() + "/clips/" + QueryData.getClipID();
    }

    /**
     * Comments - A comment represents a single text object from a maker related to a project.
     * @return Deletes a specified comment.
     */
    public static String removeComment() {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID()
                + "/projects/"  + QueryData.getProjectID() + "/comments/" + QueryData.getCommentID();
    }

    /**
     * Examples - An example represents a reference or guide for completing a challenge.
     * @return Removes a example for the specified skill and challenge.
     */
    public static String removeExample() {
        return QueryData.getBaseURL() + "/skills/" + QueryData.getSkillID()
                + "/challenges/" + QueryData.getChallengeID() + "/examples/" + QueryData.getExampleID();
    }

    /**
     * Favorites - Favorites represent projects that have been selected by a maker.
     * @return Removes a favorite for the specified project.
     */
    public static String removeFavorite() {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID()
                + "/projects/" + QueryData.getProjectID() + "/favorites";
    }

    /**
     * Friends - Friends represent makers that have been either followed or are following a maker.
     * @return Removes a follower.
     */
    public static String removeFollower() {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID() + "/following";
    }

    /**
     * Projects - A project represents a collection of unique shots of various media types from a maker.
     * @return Deletes the specified project instance.
     */
    public static String removeProject() {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID() + "/projects/" + QueryData.getProjectID();
    }

    // End of file
}
