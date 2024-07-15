package com.exampleSQL.CVendor.repository;


import com.exampleSQL.CVendor.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;



//interface because only declaration of methods           <model_class_name,@ID field>

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String>
{




}
