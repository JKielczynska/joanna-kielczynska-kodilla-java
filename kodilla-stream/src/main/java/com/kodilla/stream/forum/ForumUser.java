package com.kodilla.stream.forum;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**Class creates forum user with username, real name and location arguments.*/
public final class ForumUser {
    private final String username;
    private final String realName;
    private final String location;
    private final Set<ForumUser> friends = new HashSet<>();

    /**Constructor contains username, real name and location arguments.*/
    public ForumUser(final String username, final String realName, final String location) {
        this.username = username;
        this.realName = realName;
        this.location = location;
    }

    /**Method adds friends of user to Set collection.*/
    public void addFriend(final ForumUser user) {
        friends.add(user);
    }

    /**Method remove friends of user from Set collection.*/
    public boolean removeFriend(final ForumUser user) {
        return friends.remove(user);
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getLocation() {
        return location;
    }

    public Set<ForumUser> getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", location='" + location + '\'' +
                ", friends=" + friends +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final ForumUser forumUser = (ForumUser) o;

        if (!username.equals(forumUser.username)) {
            return false;
        }
        if (!realName.equals(forumUser.realName)) {
            return false;
        }
        if (!location.equals(forumUser.location)) {
            return false;
        }
        return friends.equals(forumUser.friends);
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }

    /**Method returns location of friends of the user.*/
    public Set<String> getLocationsOfFriends() {
        return friends.stream()
                .map(friend -> friend.getLocation())
                .collect(Collectors.toSet());
    }

    /**Method retrns location of friends of friends of the user.*/
    public Set<String> getLocationsOfFriendsOfFriends() {
        return friends.stream()
                .flatMap(user -> user.getFriends().stream())
                .filter(user -> user != this)
                .map(ForumUser::getLocation)
                .collect(Collectors.toSet());
    }
}
