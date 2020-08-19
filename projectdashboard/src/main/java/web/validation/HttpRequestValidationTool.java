package web.validation;

import org.springframework.validation.BindingResult;

import java.util.HashMap;
import java.util.Map;

public class HttpRequestValidationTool implements ValidationTool {
    @Override
    public Map<String, String> validate(BindingResult result) {
        if (result.hasErrors()) {
            var errorsMap = new HashMap<String, String>();
            for (var error : result.getFieldErrors()) {
                errorsMap.put(error.getField(), error.getDefaultMessage());
            }

            return errorsMap;
        }

        return null;
    }
}
