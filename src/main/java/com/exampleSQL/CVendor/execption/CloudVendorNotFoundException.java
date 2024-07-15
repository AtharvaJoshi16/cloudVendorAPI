package com.exampleSQL.CVendor.execption;

public class CloudVendorNotFoundException extends RuntimeException{


     public  CloudVendorNotFoundException(String msg)
    {
        super (msg);
    }


     public CloudVendorNotFoundException(String msg,Throwable cause)
    {
        super(msg, cause);
    }
}
