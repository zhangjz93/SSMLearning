package cn.zjz.model;

import org.apache.ibatis.type.Alias;

@Alias("User")
public class User {
    private String userId;
    private String name;
    private String job;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
