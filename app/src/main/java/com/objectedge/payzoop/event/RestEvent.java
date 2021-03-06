package com.objectedge.payzoop.event;


import com.objectedge.payzoop.model.APIKey;
import com.objectedge.payzoop.model.GetAllCategoriesListModel;
import com.objectedge.payzoop.model.GetProductsListModel;
import com.objectedge.payzoop.model.ProductModel;


/**
 * Created by michaelkatkov on 8/4/16.
 */
public class RestEvent extends Event {

    public static class GetProductsListSuccessEvent extends RestEvent {

        public GetProductsListModel products;


        public GetProductsListSuccessEvent(GetProductsListModel products) {
            this.products = products;
        }
    }



    public static class GetProductsListFailureEvent extends RestEvent {

    }



    public static class GetProductByIdSuccessEvent extends RestEvent {

        public ProductModel productData;


        public GetProductByIdSuccessEvent(ProductModel productData) {
            this.productData = productData;
        }
    }



    public static class GetProductByIdFailureEvent extends RestEvent {

    }

    public static  class GetCategoriesListSuccessEvent extends RestEvent{

        public GetAllCategoriesListModel categories;

        public GetCategoriesListSuccessEvent(GetAllCategoriesListModel categories){
            this.categories = categories;
        }
    }

    public static class GetCategoriesListFailureEvent extends RestEvent{
    }

    public static class GetAPIKeySuccessEvent extends RestEvent {

        public APIKey key;


        public GetAPIKeySuccessEvent(APIKey key) {
            this.key = key;
        }
    }



    public static class GetAPIKeyFailureEvent extends RestEvent {
        public String response;

        public GetAPIKeyFailureEvent(String response) {
            this.response = response;
        }
    }

    public static class GetProductByBarcodeSuccessEvent extends RestEvent {

        public ProductModel product;


        public GetProductByBarcodeSuccessEvent(ProductModel product) {
            this.product = product;
        }
    }



    public static class GetProductByBarcodeFailureEvent extends RestEvent {
    }

}
