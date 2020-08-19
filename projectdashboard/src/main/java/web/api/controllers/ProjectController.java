package web.api.controllers;

import domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import services.ProjectService;
import web.dto.ProjectDTO;
import web.validation.HttpRequestValidationTool;

import javax.validation.Valid;
import web.validation.Validator;

import java.util.Map;

@RestController
@RequestMapping("/api/v1.0/project")
@CrossOrigin
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("")
    public ResponseEntity<?> createNewProject(@Valid @RequestBody ProjectDTO projectDTO, BindingResult result) {
        var validator = new Validator(new HttpRequestValidationTool());
        var validationResult = validator.validate(result);

        if ( validationResult!= null) {

            return new ResponseEntity<Map<String, String>>(validationResult, HttpStatus.BAD_REQUEST);
        }

        var newProject = projectService.saveOrUpdate(projectDTO.convertToProject());
        var responseDTO = new ProjectDTO();
        responseDTO.setProject(newProject);

        return new ResponseEntity<ProjectDTO>(responseDTO, HttpStatus.CREATED);
    }
}
