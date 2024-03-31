
package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author kaavya
 */

@Entity
public class Thread implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    @ManyToOne
    private Student creator;
    private String desc; // Description of the Thread and what it entails, what the rules are, etc.
    private List<String> tags;
    @OneToMany(mappedBy = "parentThread")
    private List<Thread> subThreads; 
    //If a student wishes to divulge in a subtopic of the thread, He/She can create a subThread.
    @ManyToOne
    private Thread parentThread;
    //if the current thread is a subThread, this attribute pertains to the Parent Thread
    @OneToMany
    private List<Post> postsInThread; 
    private int postCount;
    private int shareCount; 
    
    
    //Getters and Setters :D

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public void setTitle(List<String> tags) {
        this.tags = tags;
    }
    
    public List<Thread> getSubThreads() {
        return subThreads;
    }

    public void setSubThreads(List<Thread> subThreads) {
        this.subThreads = subThreads;
    }
    
    public void setParentThread(Thread parentThread) {
        this.parentThread = parentThread;
    }
    
    public Thread getParentThread() {
        return parentThread;
    }
    
    public List<Post> getPostsInThread() {
        return postsInThread;
    }

    public void setPostsInThreads(List<Post> postsInThread) {
        this.postsInThread = postsInThread;
    }
    
    public int getPostCount() {
        return postCount;
    }
    
    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }
  
    public int getShareCount() {
        return shareCount;
    }
    
    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
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
        if (!(object instanceof Thread)) {
            return false;
        }
        Thread other = (Thread) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Users[ id=" + id + " ]";
    }
    
}
