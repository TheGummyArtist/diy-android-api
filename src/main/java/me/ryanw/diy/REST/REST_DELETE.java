package me.ryanw.diy.REST;

public class REST_DELETE {

    /**
     * Clips - A clip represents a single piece of media from a maker related to a project.
     * @return Deletes a specified clip.
     */
    public static String removeClip() {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID()
                + "/projects/" + REST.getProjectID() + "/clips/" + REST.getClipID();
    }

    /**
     * Comments - A comment represents a single text object from a maker related to a project.
     * @return Deletes a specified comment.
     */
    public static String removeComment() {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID()
                + "/projects/"  + REST.getProjectID() + "/comments/" + REST.getCommentID();
    }

    /**
     * Examples - An example represents a reference or guide for completing a challenge.
     * @return Removes a example for the specified skill and challenge.
     */
    public static String removeExample() {
        return REST.getBaseURL() + "/skills/" + REST.getSkillID()
                + "/challenges/" + REST.getChallengeID() + "/examples/" + REST.getExampleID();
    }

    /**
     * Favorites - Favorites represent projects that have been selected by a maker.
     * @return Removes a favorite for the specified project.
     */
    public static String removeFavorite() {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID()
                + "/projects/" + REST.getProjectID() + "/favorites";
    }

    /**
     * Friends - Friends represent makers that have been either followed or are following a maker.
     * @return Removes a follower.
     */
    public static String removeFollower() {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID() + "/following";
    }

    /**
     * Projects - A project represents a collection of unique shots of various media types from a maker.
     * @return Deletes the specified project instance.
     */
    public static String removeProject() {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID() + "/projects/" + REST.getProjectID();
    }
}
