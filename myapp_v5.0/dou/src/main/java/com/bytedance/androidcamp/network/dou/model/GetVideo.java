package com.bytedance.androidcamp.network.dou.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetVideo {
    @SerializedName("feeds") List<Video> video;
    public List<Video> getVideos(){
        return video;
    }
}
