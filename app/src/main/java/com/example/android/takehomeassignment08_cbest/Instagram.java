package com.example.android.takehomeassignment08_cbest;


public class Instagram {

    public int username;
    public int postInfo;
    public int photoId;
    public int postUsername;

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public int getPostInfo() {
        return postInfo;
    }

    public void setPostInfo(int postInfo) {
        this.postInfo = postInfo;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }



    public Instagram(int username, int postInfo, int photoId, int postUsername) {
        this.username = username;
        this.postInfo = postInfo;
        this.photoId = photoId;
        this.postUsername = postUsername;
    }
}
