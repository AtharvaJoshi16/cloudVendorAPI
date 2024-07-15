package com.exampleSQL.CVendor.execption;


import org.springframework.http.HttpStatus;


public class CloudVendorException {

   private final String message;
   private final Throwable throwable;
   private final HttpStatus httpStatus;


    public CloudVendorException(String msg, Throwable thr, HttpStatus http){
        this.message = msg;
        this.throwable= thr;
        this.httpStatus = http;

    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public Throwable getThrowable() {
        return throwable;
    }


}
