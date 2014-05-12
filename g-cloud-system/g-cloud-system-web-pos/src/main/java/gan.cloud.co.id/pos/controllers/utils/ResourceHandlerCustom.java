package gan.cloud.co.id.pos.controllers.utils;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;

/**
 * Created by Argan on 22/04/14.
 */
public class ResourceHandlerCustom extends PageableHandlerMethodArgumentResolver {

    public ResourceHandlerCustom(int size) {
//        super.setFallbackPageable(new PageRequest(0, size));
        super.setFallbackPageable(new PageRequest(0, size));
    }
}
