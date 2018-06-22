package edu.just.jiguo.service;

import edu.just.jiguo.model.BestGuid;

import java.util.List;

public interface BestGuidService {
    public boolean addBestGuid(BestGuid bestGuid);
    public BestGuid getBestGuidById(Integer bestguidId);
    public List<BestGuid> getAllBestGuids();
    public boolean deleteBestGuid(Integer bestguidId);
    public boolean updateBestGuid(BestGuid bestGuid);
}
