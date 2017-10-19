package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

/**Class represents forum user with his nickname, real name, posts and comments.*/
public class ForumUser {
    private final String name;
    private final String realName;
    private final ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private final LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(final String name, final String realName) {
        this.name = name;
        this.realName = realName;
    }

    /**Adds post body and his author.*/
    public void addPost(final String author, final String postBody) {
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }

    /**Adds comment to forum post.*/
    public void addComment(final ForumPost thePost, final String author, final String commentBody) {
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);
    }

    /**Returns number of user's posts.*/
    public int getPostsQuantity() {
        return posts.size();
    }

    /**Returns number of user's comments.*/
    public int getCommentsQuantity() {
        return comments.size();
    }

    /**Retrieves user's posts from the collection.*/
    public ForumPost getPost(final int postNumber) {
        ForumPost thePost = null;
        if (postNumber >= 0 && postNumber < posts.size()) {
            thePost = posts.get(postNumber);
        }
        return thePost;
    }

    /**Retrieves user's comments from the collection.*/
    public ForumComment getComment(final int commentNumber) {
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()) {
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }

    /**Removes post.*/
    public boolean removePost(final ForumPost thePost) {
        boolean result = false;
        if (posts.contains(thePost)) {
            posts.remove(thePost);
            result = true;
        }
        return result;
    }

    /**Removes comment.*/
    public boolean removeComment(final ForumComment theComment) {
        boolean result = false;
        if (comments.contains(theComment)) {
            comments.remove(theComment);
            result = true;
        }
        return result;
    }

    /**Returns user's nickname.*/
    public String getName() {
        return name;
    }

    /**Returns user's real name.*/
    public String getRealName() {
        return realName;
    }
}