package web.validation;

import org.springframework.validation.BindingResult;

public interface ValidationTool {
    void validate(BindingResult result);
}
