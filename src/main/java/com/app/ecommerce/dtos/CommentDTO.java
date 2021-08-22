package com.app.ecommerce.dtos;

public class CommentDTO {
    private Long idComment;
    private Boolean blocked;
    private String content;
    private Integer rating;
    private Long articleIdArticle;
    private Long userIdUser;

    public Long getIdComment() {
        return this.idComment;
    }

    public void setIdComment(Long idComment) {
        this.idComment = idComment;
    }

    public Boolean getBlocked() {
        return this.blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getRating() {
        return this.rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Long getArticleIdArticle() {
        return this.articleIdArticle;
    }

    public void setArticleIdArticle(Long articleIdArticle) {
        this.articleIdArticle = articleIdArticle;
    }

    public Long getUserIdUser() {
        return this.userIdUser;
    }

    public void setUserIdUser(Long userIdUser) {
        this.userIdUser = userIdUser;
    }
}
