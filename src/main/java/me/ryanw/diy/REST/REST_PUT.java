package me.ryanw.diy.REST;

public class REST_PUT {

    /**
     * Clip - A clip represents a single piece of media from a maker related to a project.
     * @return Updates a specified clip.
     */
    public static String updateClip(String location) {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID()
                + "/projects/" + REST.getProjectID() + "/clips/" + REST.getClipID();
    }

    /**
     * Comment - A comment represents a single text object from a maker related to a project.
     * @return Updates a specified comment.
     */
    public static String updateComment(String comment, boolean reply, boolean flag) {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID()
                + "/projects/" + REST.getProjectID()+ "/comments/" + REST.getCommentID();
    }

    /**
     * Example - An example represents a reference or guide for completing a challenge.
     * @return Updates a example for the specified skill and challenge.
     */
    public static String updateExample(String location) {
        return REST.getBaseURL() + "/skills/" + REST.getSkillID()
                + "/challenges/" + REST.getChallengeID()+ "/examples/" + REST.getExampleID();
    }

    /**
     * Project - A project represents a collection of unique shots of various media types from a maker.
     * @return Updates the specified project instance.
     */
    public static String updateProject(String location) {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID() + "/projects/" + REST.getProjectID();
    }

    /**
     * Maker - A maker represents a single child user within the DIY ecosystem.
     * @return Updates the specified maker instance.
     */
    public static String updateMaker() {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID();
    }
}
