package com.exampleSQL.CVendor.service.impl;

import com.exampleSQL.CVendor.execption.CloudVendorNotFoundException;
import com.exampleSQL.CVendor.model.CloudVendor;
import com.exampleSQL.CVendor.repository.CloudVendorRepository;
import com.exampleSQL.CVendor.service.CVService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudServiceImpl implements CVService {

    //obj creation of Repository,because Repository is the actual layer connecting to DB
    CloudVendorRepository repo;

    //Constructor_Creation
    public CloudServiceImpl( CloudVendorRepository cvrepo){
       this.repo=cvrepo;
    }

    @Override
    public String createCloudVendor(CloudVendor cvdata) {
        repo.save(cvdata);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cvdata) {
        repo.save(cvdata);
        return "Updated";
    }

    @Override
    public CloudVendor getCloudVendor(String cvID) {
        if(repo.findById(cvID).isEmpty()){
           throw new CloudVendorNotFoundException("Entered ID is does not exist");
        }
        return repo.findById(cvID).get();

    }
    @Override
    public String deleteCloudVendor(String cvID) {
        repo.deleteById(cvID);
        return"Data Deleted";
    }



    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return repo.findAll();
    }
}
