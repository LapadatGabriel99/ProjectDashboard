package web.validation;

import org.springframework.validation.BindingResult;

import java.util.Map;

public interface ValidationTool {
    Map<String, String> validate(BindingResult result);
}
