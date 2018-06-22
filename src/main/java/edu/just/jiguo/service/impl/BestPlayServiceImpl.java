package edu.just.jiguo.service.impl;

import edu.just.jiguo.dao.BestPlayMapper;
import edu.just.jiguo.model.BestPlay;
import edu.just.jiguo.service.BestPlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bestPlayService")
public class BestPlayServiceImpl implements BestPlayService{

    @Autowired
    private BestPlayMapper bestPlayMapper;

    @Override
    public boolean addBestPlay(BestPlay bestPlay) {
        return bestPlayMapper.addBestPlay(bestPlay);
    }

    @Override
    public BestPlay getBestPlayById(Integer bestplayId) {
        return bestPlayMapper.getBestPlayById(bestplayId);
    }

    @Override
    public List<BestPlay> getAllBestPlays() {
        return bestPlayMapper.getAllBestPlays();
    }

    @Override
    public boolean deleteBestPlay(Integer bestplayId) {
        return bestPlayMapper.deleteBestPlay(bestplayId);
    }

    @Override
    public boolean updateBestPlay(BestPlay bestPlay) {
        return bestPlayMapper.updateBestPlay(bestPlay);
    }
}
