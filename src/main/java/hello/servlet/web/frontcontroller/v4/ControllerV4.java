package hello.servlet.web.frontcontroller.v4;

import java.util.Map;
import java.util.Objects;

/**
 * ControllerV4 interface
 */
public interface ControllerV4 {
    String process(Map<String,String> paramMap, Map<String, Object> model);
}
