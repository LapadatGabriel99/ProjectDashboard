package web.api.controllers;

import domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.ProjectService;

@RestController
@RequestMapping("/api/v1.0/project")
@CrossOrigin
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("")
    public ResponseEntity<?> createNewProject(@RequestBody Project project) {

        var newProject = projectService.saveOrUpdate(project);

        return new ResponseEntity<Project>(newProject, HttpStatus.CREATED);
    }
}
