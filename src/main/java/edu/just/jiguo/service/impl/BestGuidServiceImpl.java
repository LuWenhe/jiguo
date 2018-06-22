package edu.just.jiguo.service.impl;

import edu.just.jiguo.dao.BestGuidMapper;
import edu.just.jiguo.model.BestGuid;
import edu.just.jiguo.service.BestGuidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bestGuidService")
public class BestGuidServiceImpl implements BestGuidService {

    @Autowired
    private BestGuidMapper bestGuidMapper;

    @Override
    public boolean addBestGuid(BestGuid bestGuid) {
        return bestGuidMapper.addBestGuid(bestGuid);
    }

    @Override
    public BestGuid getBestGuidById(Integer bestguidId) {
        return bestGuidMapper.getBestGuidById(bestguidId);
    }

    @Override
    public List<BestGuid> getAllBestGuids() {
        return bestGuidMapper.getAllBestGuids();
    }

    @Override
    public boolean deleteBestGuid(Integer bestguidId) {
        return bestGuidMapper.deleteBestGuid(bestguidId);
    }

    @Override
    public boolean updateBestGuid(BestGuid bestGuid) {
        return updateBestGuid(bestGuid);
    }
}
