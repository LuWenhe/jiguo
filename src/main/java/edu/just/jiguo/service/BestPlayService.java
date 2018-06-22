package edu.just.jiguo.service;

import edu.just.jiguo.model.BestPlay;

import java.util.List;

public interface BestPlayService {

    public boolean addBestPlay(BestPlay bestPlay);
    public BestPlay getBestPlayById(Integer bestplayId);
    public List<BestPlay> getAllBestPlays();
    public boolean deleteBestPlay(Integer bestplayId);
    public boolean updateBestPlay(BestPlay bestPlay);
}
