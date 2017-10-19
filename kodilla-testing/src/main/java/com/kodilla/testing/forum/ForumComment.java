package com.kodilla.testing.forum;

/**Class represents comments to forum posts.*/
public class ForumComment {
    private final ForumPost forumPost;
    private final String commentBody;
    private final String author;

    /**Constructor with forumPost, commentBody and author of comment arguments.*/
    public ForumComment(final ForumPost forumPost, final String commentBody, final String author) {
        this.forumPost = forumPost;
        this.commentBody = commentBody;
        this.author = author;
    }

    /**Returns commented forum post.*/
    public ForumPost getForumPost() {
        return forumPost;
    }

    /**Returns comment body.*/
    public String getCommentBody() {
        return commentBody;
    }

    /**Returns author of the comment.*/
    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ForumComment)) {
            return false;
        }

        ForumComment that = (ForumComment) o;

        if (!forumPost.equals(that.forumPost)) {
            return false;
        }
        if (!commentBody.equals(that.commentBody)) {
            return false;
        }
        return author.equals(that.author);
    }

    @Override
    public int hashCode() {
        int result = forumPost.hashCode();
        result = 31 * result + commentBody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}
