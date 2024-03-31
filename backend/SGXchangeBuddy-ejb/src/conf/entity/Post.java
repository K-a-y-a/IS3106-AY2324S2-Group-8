
package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author kaavya
 */

@Entity
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Student creator;
    private String desc; //Post Description
    private List<String> tags;
    private List<String> imageURL;
    private int likeCount;
    private int shareCount;
    @ManyToMany(mappedBy = "replies")
    private List<Post> replies;
    @ManyToOne
    private Post prevPost; //If the current post was a reply to another post( This is the attribute pertaining to the previous post)
    private boolean ifReported; // To check if the post has been reported by another student

 //Getters and Setters :D
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Student getCreator() {
        return creator;
    }
    
    public void setCreator(Student creator) {
        this.creator = creator;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public List<String> getTags() {
        return tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags; 
    }
    
    public List<String> getImageURLS() {
        return imageURL;
    }
    
    public void setImageURL(List<String> imageURL) {
        this.imageURL = imageURL; 
    } 
    
    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
    
    public int getLikeCount() {
        return likeCount;
    }
    
    public void setShareCount(int shareCount) {
        this.shareCount =shareCount;
    }
    
    public int getShareCount() {
        return shareCount;
    }
    
    public List<Post> getReplies() {
        return replies;
    }
    
    public void setReplies(List<Post> replies) {
        this.replies = replies; 
    }
    
    public Post getPrevPost() {
        return prevPost;
    }
    
    public void setPrevPost(Post prevPost) {
        this.prevPost = prevPost; 
    }
    
    public boolean getIfReported() {
        return ifReported;
    }
    
    public void setIfReported(boolean ifReported) {
        this.ifReported = ifReported;
    }
    

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Post[ id=" + id + " ]";
    }
    
}
