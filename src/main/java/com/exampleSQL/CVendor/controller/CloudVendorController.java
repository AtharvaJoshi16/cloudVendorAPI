
package com.exampleSQL.CVendor.controller;

import com.exampleSQL.CVendor.model.CloudVendor;
import com.exampleSQL.CVendor.service.CVService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cloudvendor")



public class CloudVendorController {

   CVService cvs;
   public CloudVendorController(CVService cvs){
       this.cvs =cvs;
   }
    //CloudVendor cv;
    // CloudVendor cv = new CloudVendor("abc","213","ADD@023","47656275673");
    //     @GetMapping("{vendorID}")
    //    public CloudVendor getvendorDetails(String vendorID){
    //      return  new CloudVendor("ABC", "200","Add1","4568261346");
    //    }

    @GetMapping("/demo")
    public String getDetails(String vendorName){
        return "Please add name";
    }
    //Read all Cvendors from db
    @GetMapping
    public List<CloudVendor> getAllCloudVendorDetails()
    {

        return cvs.getAllCloudVendors();

    }

    //Read Specific CVendor from db
    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendor(@PathVariable("vendorID") String vendorID)
    {
        return cvs.getCloudVendor(vendorID);
    }


    @PostMapping                   //input taken from user to save in obj"cloudvendordata"
    public String createVendorDetails(@RequestBody CloudVendor cloudVendorData)
    {
        cvs.createCloudVendor(cloudVendorData);
        return "Cloud Vendor Created Successfully";
    }
    @PutMapping                   //input taken from user to save in obj"cloudvendordata"
    public String updateVendorDetails(@RequestBody CloudVendor cloudVendorData){
        cvs.updateCloudVendor(cloudVendorData);
        return "Cloud Vendor updated Successfully";
    }
    @DeleteMapping("{vendorID}")
    public String deleteVendorDetails(@PathVariable("vendorID") String vendorID){
        cvs.deleteCloudVendor( vendorID);
        return "Cloud Vendor deleted Successfully";
    }
}
