package me.ryanw.diy.REST;

public class REST_GET {

    /**
     * Achievements - Achievements represent completed and pending challenge solutions for a maker.
     * @return Returns the specified maker's achievements.
     */
    public static String getAchievements(int limit, int offset) {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID() + "/achievements";
    }

    /**
     * Challenges - A challenge represents a single task towards earning a skill.
     * @return Returns a list of all challenges for the specified skill.
     */
    public static String getChallenges(int limit, int offset) {
        return REST.getBaseURL() + "/skills/" + REST.getSkillID() + "/challenges";
    }

    /**
     * Examples - An example represents a reference or guide for completing a challenge.
     * @return Returns a list of all examples for the specified skill.
     */
    public static String getExamples(int limit, int offset) {
        return REST.getBaseURL() + "/skills/" + REST.getSkillID()
                + "/challenges/" + REST.getChallengeID() + "/examples";
    }

    /**
     * Featured - Explore provides lists of featured and/or trending projects in the community.
     * @return Returns a list of featured projects.
     */
    public static String getFeatured(int limit, int offset) {
        return REST.getBaseURL() + "/explore/featured";
    }

    /**
     * 15s Intro - Explore provides lists of featured and/or trending projects in the community.
     * @return Returns a list of new 15 second intro videos.
     */
    public static String getIntros(int limit, int offset) {
        return REST.getBaseURL() + "/explore/introducing";
    }

    /**
     * Trending - Explore provides lists of featured and/or trending projects in the community.
     * @return Returns a list of trending projects.
     */
    public static String getTrending(int limit, int offset) {
        return REST.getBaseURL() + "/explore/trending";
    }

    /**
     * Favorites - Favorites represent projects that have been selected by a maker.
     * @return Returns the specified maker's favorite projects.
     */
    public static String getMakerFavorites(int limit, int offset) {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID() + "/favorites";
    }

    /**
     * Favorites - Favorites represent projects that have been selected by a maker.
     * @return Returns all makers who have favorited the specified project.
     */
    public static String getProjectFavorites(int limit, int offset) {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID()
                + "/projects/" + REST.getProjectID() + "/favorites";
    }

    /**
     * Followers - Friends represent makers that have been either followed or are following a maker.
     * @return Returns list of followers for the specified maker.
     */
    public static String getFollowers(int limit, int offset) {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID() + "/followers";
    }

    /**
     * Following - Friends represent makers that have been either followed or are following a maker.
     * @return Returns list of followed makers.
     */
    public static String getFollowing(int limit, int offset) {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID() + "/following";
    }

    /**
     * Clips - A clip represents a single piece of media from a maker related to a project.
     * @return Returns an array of clips for the specified project instance.
     */
    public static String getClips(int limit, int offset) {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID()
                + "/projects/" + REST.getProjectID() + "/clips";
    }

    /**
     * Comments - A comment represents a single text object from a maker related to a project.
     * @return Returns an array of comments for the specified project instance.
     */
    public static String getComments(int limit, int offset) {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID()
                + "/projects/" + REST.getProjectID() + "/comments";
    }

    /**
     * Projects - A maker represents a single child user within the DIY ecosystem.
     * @return Returns the specified maker's projects.
     */
    public static String getProjects(int limit, int offset) {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID() + "/projects";
    }

    /**
     * Skills - A skill represents a set of challenges, references, and materials that relate to a theme.
     * @return Returns all skills.
     */
    public static String getSkills(int limit, int offset) {
        return REST.getBaseURL() + "/skills";
    }

    /**
     * Materials - A material represents a single tool or object that can be used to complete a challenge.
     * @return Returns a list of all materials for the specified skill.
     */
    public static String getMaterials(int limit, int offset) {
        return REST.getBaseURL() + "/skills/" + REST.getSkillID() + "/materials";
    }

    /**
     * Authorization - Returns maker authorization information
     * @return Returns an authorization object including HMAC token, maker ID and type information
     */
    public static String Authorization() {
        return REST.getBaseURL() + "/authorize";
    }

    /**
     * Challenge - A challenge represents a single task towards earning a skill.
     * @return Returns a single challenge by id.
     */
    public static String getChallenge() {
        return REST.getBaseURL() + "/skills/" + REST.getSkillID()
                + "/challenges/" + REST.getChallengeID();
    }

    /**
     * Example - An example represents a reference or guide for completing a challenge.
     * @return Returns a single example by id.
     */
    public static String getExample() {
        return REST.getBaseURL() + "/skills/" + REST.getSkillID()
                + "/challenges/" + REST.getChallengeID();
    }

    /**
     * Project - A project represents a collection of unique shots of various media types from a maker.
     * @return Returns the specified project instance.
     */
    public static String getProject() {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID()
                + "/projects/" + REST.getProjectID();
    }

    /**
     * Maker - A maker represents a single child user within the DIY ecosystem.
     * @return Returns the specified maker instance.
     */
    public static String getMaker() {
        return REST.getBaseURL() + "/makers/" + REST.getMakerID();
    }

    /**
     * Skill - A skill represents a set of challenges, references, and materials that relate to a theme.
     * @return Returns the specified skill instance.
     */
    public static String getSkill() {
        return REST.getBaseURL() + "/skills/" + REST.getSkillID();
    }

}