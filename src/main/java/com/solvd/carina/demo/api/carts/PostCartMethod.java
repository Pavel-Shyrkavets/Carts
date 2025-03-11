package com.solvd.carina.demo.api.carts;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/carts/add", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/carts/_post/rq.json")
@ResponseTemplatePath(path = "api/carts/_post/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
public class PostCartMethod extends AbstractApiMethodV2 {

    public PostCartMethod() {
        super("api/carts/_post/rq.json", "api/carts/_post/rs.json", "api/carts/cart.properties");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
