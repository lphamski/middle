package com.middle.middle.buckets;

public enum BucketName {
    PROFILE_IMAGE("middle-images-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
