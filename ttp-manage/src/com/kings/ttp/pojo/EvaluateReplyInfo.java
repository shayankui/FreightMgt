package com.kings.ttp.pojo;

public class EvaluateReplyInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_evaluate_reply.F_REPLY_NUM
     *
     * @mbggenerated
     */
    private String replyNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_evaluate_reply.F_USER_ID
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_evaluate_reply.F_REPLY_DETAIL
     *
     * @mbggenerated
     */
    private String replyDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_evaluate_reply.F_REPLY_TIME
     *
     * @mbggenerated
     */
    private String replyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_evaluate_reply.F_REPLY_NUM
     *
     * @return the value of t_evaluate_reply.F_REPLY_NUM
     *
     * @mbggenerated
     */
    public String getReplyNum() {
        return replyNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_evaluate_reply.F_REPLY_NUM
     *
     * @param replyNum the value for t_evaluate_reply.F_REPLY_NUM
     *
     * @mbggenerated
     */
    public void setReplyNum(String replyNum) {
        this.replyNum = replyNum == null ? null : replyNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_evaluate_reply.F_USER_ID
     *
     * @return the value of t_evaluate_reply.F_USER_ID
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_evaluate_reply.F_USER_ID
     *
     * @param userId the value for t_evaluate_reply.F_USER_ID
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_evaluate_reply.F_REPLY_DETAIL
     *
     * @return the value of t_evaluate_reply.F_REPLY_DETAIL
     *
     * @mbggenerated
     */
    public String getReplyDetail() {
        return replyDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_evaluate_reply.F_REPLY_DETAIL
     *
     * @param replyDetail the value for t_evaluate_reply.F_REPLY_DETAIL
     *
     * @mbggenerated
     */
    public void setReplyDetail(String replyDetail) {
        this.replyDetail = replyDetail == null ? null : replyDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_evaluate_reply.F_REPLY_TIME
     *
     * @return the value of t_evaluate_reply.F_REPLY_TIME
     *
     * @mbggenerated
     */
    public String getReplyTime() {
        return replyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_evaluate_reply.F_REPLY_TIME
     *
     * @param replyTime the value for t_evaluate_reply.F_REPLY_TIME
     *
     * @mbggenerated
     */
    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime == null ? null : replyTime.trim();
    }
}