package web.validation;

import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.BindingResult;

public class Validator {

    @Getter
    @Setter
    private ValidationTool tool;

    public Validator(ValidationTool tool) {
        this.tool = tool;
    }

    public void validate(BindingResult result) {
        tool.validate(result);
    }
}
