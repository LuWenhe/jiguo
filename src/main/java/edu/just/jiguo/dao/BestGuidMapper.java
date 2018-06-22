package edu.just.jiguo.dao;

import edu.just.jiguo.model.BestGuid;
import edu.just.jiguo.util.MyMapper;

import java.util.List;

public interface BestGuidMapper extends MyMapper<BestGuid> {

    public boolean addBestGuid(BestGuid bestGuid);
    public BestGuid getBestGuidById(Integer bestguidId);
    public List<BestGuid> getAllBestGuids();
    public boolean deleteBestGuid(Integer bestguidId);
    public boolean updateBestGuid(BestGuid bestGuid);
    public BestGuid searchGuidByName(String name);

}