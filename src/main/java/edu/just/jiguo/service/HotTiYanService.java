package edu.just.jiguo.service;

import edu.just.jiguo.model.HotTiYan;

import java.util.List;

public interface HotTiYanService {
    public boolean addHotTiYan(HotTiYan hotTiYan);
    public HotTiYan getHotTiYanById(Integer hotTiYanId);
    public List<HotTiYan> getAllHotTiYans();
    public boolean deleteHotTiYan(Integer hotTiYanId);
    public boolean updateHotTiYan(HotTiYan hotTiYan);
}
