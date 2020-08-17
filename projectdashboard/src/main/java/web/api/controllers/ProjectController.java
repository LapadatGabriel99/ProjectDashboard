package web.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ProjectService;

@RestController
@RequestMapping("/api/v1.0/project")
@CrossOrigin
public class ProjectController {

    @Autowired
    private ProjectService projectService;
}
