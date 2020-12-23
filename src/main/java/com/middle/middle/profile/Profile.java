package com.middle.middle.profile;

import java.util.Objects;
import java.util.UUID;

public class Profile {
    private UUID profileId;
    private String userName;
    private String userImageLink;

    public Profile(UUID profileId, String userName, String userImageLink) {
        this.profileId = profileId;
        this.userName = userName;
        this.userImageLink = userImageLink;
    }

    public UUID getProfileId() {
        return profileId;
    }

    public void setProfileId(UUID profileId) {
        this.profileId = profileId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImageLink() {
        return userImageLink;
    }

    public void setUserImageLink(String userImageLink) {
        this.userImageLink = userImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return Objects.equals(profileId, profile.profileId) &&
                Objects.equals(userName, profile.userName) &&
                Objects.equals(userImageLink, profile.userImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileId, userName, userImageLink);
    }
}
