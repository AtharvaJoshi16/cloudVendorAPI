package com.exampleSQL.CVendor.service;

import com.exampleSQL.CVendor.model.CloudVendor;

import java.util.List;

public interface CVService {
  public String  createCloudVendor(CloudVendor cvdata);
  public String  updateCloudVendor(CloudVendor cvdata);
  public String deleteCloudVendor(String cvID);
  public CloudVendor getCloudVendor(String cvID);

  public List<CloudVendor> getAllCloudVendors();
}
