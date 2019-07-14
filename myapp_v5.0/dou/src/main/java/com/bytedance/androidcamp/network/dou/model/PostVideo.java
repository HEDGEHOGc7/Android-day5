package com.bytedance.androidcamp.network.dou.model;

import com.google.gson.annotations.SerializedName;

public class PostVideo {
    @SerializedName("success") 	private boolean success;
    public boolean isSuccess() {
        return success;
    }
}
