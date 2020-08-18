package web.dto;

import domain.Project;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ProjectDTO {

    @NotBlank(message = "Project name is required")
    private String projectName;

    @NotBlank(message = "Project identifier is required")
    @Size(min = 4, max = 5, message = "Please use 4 to 5 characters")
    @Column(updatable = false, unique = true)
    private String projectIdentifier;

    @NotBlank(message = "Project description is required")
    private String description;

    private Project project;

    public ProjectDTO() {
        project = new Project();
    }

    public Project convertToProject() {
        project.setProjectName(projectName);
        project.setProjectIdentifier(projectIdentifier);
        project.setDescription(description);

        return project;
    }
}
