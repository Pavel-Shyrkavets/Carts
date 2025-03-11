package com.solvd.carina.demo.carts;

import com.solvd.carina.demo.api.carts.DeleteCartMethod;
import com.solvd.carina.demo.api.carts.GetCartsMethod;
import com.solvd.carina.demo.api.carts.PatchCartMethod;
import com.solvd.carina.demo.api.carts.PostCartMethod;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class APICartsTest {

    @Test
    public void addCart() {
        PostCartMethod api = new PostCartMethod();

        api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstSchema("api/carts/_post/rs.schema");
    }

    @Test
    public void getAllCarts() {
        GetCartsMethod api = new GetCartsMethod();

        api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstSchema("api/carts/_get/rs.schema");
    }

    @Test
    public void updateCart() {
        PatchCartMethod api = new PatchCartMethod();

        api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstSchema("api/carts/_patch/rs.schema");
    }

    @Test
    public void deleteCart() {
        DeleteCartMethod api = new DeleteCartMethod();

        api.callAPIExpectSuccess();
        api.validateResponseAgainstSchema("api/carts/_delete/rs.schema");
    }
}
