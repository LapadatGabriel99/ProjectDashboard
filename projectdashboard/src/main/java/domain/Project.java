package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    private String projectName;

    @Setter
    @Getter
    private String projectIdentifier;

    @Setter
    @Getter
    private String description;

    @Setter
    @Getter
    private Date startDate;

    @Setter
    @Getter
    private Date endDate;

    @Setter
    @Getter
    private Date createdAt;

    @Setter
    @Getter
    private Date updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
}
