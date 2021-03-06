package edu.just.jiguo.dao;

import edu.just.jiguo.model.HotTiYan;
import edu.just.jiguo.util.MyMapper;

import java.util.List;

public interface HotTiYanMapper extends MyMapper<HotTiYan> {

    public boolean addHotTiYan(HotTiYan hotTiYan);
    public HotTiYan getHotTiYanById(Integer hotTiYanId);
    public List<HotTiYan> getAllHotTiYans();
    public boolean deleteHotTiYan(Integer hotTiYanId);
    public boolean updateHotTiYan(HotTiYan hotTiYan);
}