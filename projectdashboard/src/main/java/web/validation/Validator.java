package web.validation;

import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.BindingResult;

import java.util.Map;

public class Validator {

    @Getter
    @Setter
    private ValidationTool tool;

    public Validator(ValidationTool tool) {
        this.tool = tool;
    }

    public Map<String, String> validate(BindingResult result) {
        return tool.validate(result);
    }
}
