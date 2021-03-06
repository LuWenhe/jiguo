package edu.just.jiguo.dao;

import edu.just.jiguo.model.BestPlay;
import edu.just.jiguo.util.MyMapper;

import java.util.List;

public interface BestPlayMapper extends MyMapper<BestPlay> {

    public boolean addBestPlay(BestPlay bestPlay);
    public BestPlay getBestPlayById(Integer bestplayId);
    public List<BestPlay> getAllBestPlays();
    public boolean deleteBestPlay(Integer bestplayId);
    public boolean updateBestPlay(BestPlay bestPlay);
}