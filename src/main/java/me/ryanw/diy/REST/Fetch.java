package me.ryanw.diy.REST;

public class Fetch {

    private static String baseURL = "https://api.diy.org";
    private static Long makerID;
    private static Long skillID;
    private static Long challengeID;
    private static Long projectID;

    // ***** List Results ***** //

    /**
     * @return Gets a list of achievements from specified maker
     */
    public static String getAchievements(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/achievements";
    }

    /**
     * @return Gets all challenges for specific skill
     */
    public static String getChallenges(int limit, int offset) {
        return baseURL + "/skills/" + skillID + "/challenges";
    }

    /**
     * @return Gets all examples for specified challenge
     */
    public static String getExamples(int limit, int offset) {
        return baseURL + "/skills/" + skillID + "/challenges/" + challengeID + "/examples";
    }

    /**
     * @return Gets a list of featured projects from explorer
     */
    public static String getFeatured(int limit, int offset) {
        return baseURL + "/explore/featured";
    }

    /**
     * @return Gets a list of 15 second intro projects
     */
    public static String getIntros(int limit, int offset) {
        return baseURL + "/explore/introducing";
    }

    /**
     * @return Gets a list of trending projects
     */
    public static String getTrending(int limit, int offset) {
        return baseURL + "/explore/trending";
    }

    /**
     * @return Gets a list of clients favorite projects
     */
    public static String getMakerFavorites(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/favorites";
    }

    /**
     * @return Gets all makers that favorited a project
     */
    public static String getProjectFavorites(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/projects/" + projectID + "/favorites";
    }

    /**
     * @return Gets a list of the clients followers
     */
    public static String getFollowers(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/followers";
    }

    /**
     * @return Gets list of makers that the client follows
     */
    public static String getFollowing(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/following";
    }

    /**
     * @return Gets all media clips for specified project
     */
    public static String getClips(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/projects/" + projectID + "/clips";
    }

    /**
     * @return Gets all comments for specified project
     */
    public static String getComments(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/projects/" + projectID + "/comments";
    }

    /**
     * @return Gets all projects for specified makerID
     */
    public static String getProjects(int limit, int offset) {
        return baseURL + "/makers/" + makerID + "/projects";
    }

    /**
     * @return Gets a list of skills from skills page
     */
    public static String getSkills(int limit, int offset) {
        return baseURL + "/skills";
    }

    /**
     * @return Gets a list of all materials needed to complete a challenge
     */
    public static String getMaterials(int limit, int offset) {
        return baseURL + "/skills/" + skillID + "/materials";
    }


    // ***** Single Results ***** //

    /**
     * @return Gets authentification address
     */
    public static String Authorization() {
        return baseURL + "/authorize";
    }

    /**
     * @return Returns a single specified challenge for specified skill
     */
    public static String getChallenge() {
        return baseURL + "/skills/" + skillID + "/challenges/" + challengeID;
    }

    /**
     * @return Gets a example for completing a specific challenge
     */
    public static String getExample() {
        return baseURL + "/skills/" + skillID +"/challenges/" + challengeID;
    }

    /**
     * @return Gets a specific project based on makerID and projectID
     */
    public static String getProject() {
        return baseURL + "/makers/" + makerID + "/projects/" + projectID;
    }

    /**
     * @return Gets the specific maker instance
     */
    public static String getMaker() {
        return baseURL + "/makers/" + makerID;
    }

    /**
     * @return Gets a specific skill based on its ID
     */
    public static String getSkill() {
        return baseURL + "/skills/" + skillID;
    }

}
