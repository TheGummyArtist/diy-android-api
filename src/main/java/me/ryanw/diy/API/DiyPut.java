package me.ryanw.diy.API;

public class DiyPut {

    /**
     * Clip - A clip represents a single piece of media from a maker related to a project.
     * @return Updates a specified clip.
     */
    public static String updateClip(String location) {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID()
                + "/projects/" + QueryData.getProjectID() + "/clips/" + QueryData.getClipID();
    }

    /**
     * Comment - A comment represents a single text object from a maker related to a project.
     * @return Updates a specified comment.
     */
    public static String updateComment(String comment, boolean reply, boolean flag) {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID()
                + "/projects/" + QueryData.getProjectID()+ "/comments/" + QueryData.getCommentID();
    }

    /**
     * Example - An example represents a reference or guide for completing a challenge.
     * @return Updates a example for the specified skill and challenge.
     */
    public static String updateExample(String location) {
        return QueryData.getBaseURL() + "/skills/" + QueryData.getSkillID()
                + "/challenges/" + QueryData.getChallengeID()+ "/examples/" + QueryData.getExampleID();
    }

    /**
     * Project - A project represents a collection of unique shots of various media types from a maker.
     * @return Updates the specified project instance.
     */
    public static String updateProject(String location) {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID() + "/projects/" + QueryData.getProjectID();
    }

    /**
     * Maker - A maker represents a single child user within the DIY ecosystem.
     * @return Updates the specified maker instance.
     */
    public static String updateMaker() {
        return QueryData.getBaseURL() + "/makers/" + QueryData.getMakerID();
    }

    // End of file
}
