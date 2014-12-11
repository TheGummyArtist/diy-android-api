package me.ryanw.diy.REST;

public class Fetch {

    private static String baseURL = "https://api.diy.org";
    private static Long makerID;
    private static Long skillID;
    private static Long challengeID;
    private static Long projectID;

    // ***** List Results ***** //

    /**
     * @return Returns the specified maker's achievements.
     */
    public static String getAchievements(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/achievements";
    }

    /**
     * @return Returns a list of all challenges for the specified skill.
     */
    public static String getChallenges(int limit, int offset) {
        return baseURL + "/skills/" + skillID + "/challenges";
    }

    /**
     * @return Returns a list of all examples for the specified skill.
     */
    public static String getExamples(int limit, int offset) {
        return baseURL + "/skills/" + skillID + "/challenges/" + challengeID + "/examples";
    }

    /**
     * @return Returns a list of featured projects.
     */
    public static String getFeatured(int limit, int offset) {
        return baseURL + "/explore/featured";
    }

    /**
     * @return Returns a list of new 15 second intro videos.
     */
    public static String getIntros(int limit, int offset) {
        return baseURL + "/explore/introducing";
    }

    /**
     * @return Returns a list of trending projects.
     */
    public static String getTrending(int limit, int offset) {
        return baseURL + "/explore/trending";
    }

    /**
     * @return Returns the specified maker's favorite projects.
     */
    public static String getMakerFavorites(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/favorites";
    }

    /**
     * @return Returns all makers who have favorited the specified project.
     */
    public static String getProjectFavorites(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/projects/" + projectID + "/favorites";
    }

    /**
     * @return Returns list of followers for the specified maker.
     */
    public static String getFollowers(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/followers";
    }

    /**
     * @return Returns list of followed makers.
     */
    public static String getFollowing(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/following";
    }

    /**
     * @return Returns an array of clips for the specified project instance.
     */
    public static String getClips(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/projects/" + projectID + "/clips";
    }

    /**
     * @return Returns an array of comments for the specified project instance.
     */
    public static String getComments(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/projects/" + projectID + "/comments";
    }

    /**
     * @return Returns the specified maker's projects.
     */
    public static String getProjects(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/projects";
    }

    /**
     * @return Returns all skills.
     */
    public static String getSkills(int limit, int offset) {
        return baseURL + "/skills";
    }

    /**
     * @return Returns a list of all materials for the specified skill.
     */
    public static String getMaterials(int limit, int offset) {
        return baseURL + "/skills/" + skillID + "/materials";
    }


    // ***** Single Results ***** //

    /**
     * @return Returns an authorization object including HMAC token, maker ID and type information
     */
    public static String Authorization() {
        return baseURL + "/authorize";
    }

    /**
     * @return Returns a single challenge by id.
     */
    public static String getChallenge() {
        return baseURL + "/skills/" + skillID + "/challenges/" + challengeID;
    }

    /**
     * @return Returns a single example by id.
     */
    public static String getExample() {
        return baseURL + "/skills/" + skillID +"/challenges/" + challengeID;
    }

    /**
     * @return Returns the specified project instance.
     */
    public static String getProject() {
        return baseURL + "/makers/" + makerID + "/projects/" + projectID;
    }

    /**
     * @return Returns the specified maker instance.
     */
    public static String getMaker() {
        return baseURL + "/makers/" + makerID;
    }

    /**
     * @return Returns the specified skill instance.
     */
    public static String getSkill() {
        return baseURL + "/skills/" + skillID;
    }

}
