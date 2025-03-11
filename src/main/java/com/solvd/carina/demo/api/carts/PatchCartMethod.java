package com.solvd.carina.demo.api.carts;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/carts/1", methodType = HttpMethodType.PATCH)
@RequestTemplatePath(path = "api/carts/_patch/rq.json")
@ResponseTemplatePath(path = "api/carts/_patch/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PatchCartMethod extends AbstractApiMethodV2 {

    public PatchCartMethod() {
        super("api/carts/_patch/rq.json", "api/carts/_patch/rs.json", "api/carts/cart.properties");
        replaceUrlPlaceholder("base_url",Configuration.getRequired("api_url"));
    }
}
