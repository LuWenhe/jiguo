package edu.just.jiguo.service.impl;

import edu.just.jiguo.dao.HotTiYanMapper;
import edu.just.jiguo.model.HotTiYan;
import edu.just.jiguo.service.HotTiYanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("hotTiYanService")
public class HotTiYanServiceImpl implements HotTiYanService {

    @Autowired
    private HotTiYanMapper hotTiYanMapper;

    @Override
    public boolean addHotTiYan(HotTiYan hotTiYan) {
        return hotTiYanMapper.addHotTiYan(hotTiYan);
    }

    @Override
    public HotTiYan getHotTiYanById(Integer hotTiYanId) {
        return hotTiYanMapper.getHotTiYanById(hotTiYanId);
    }

    @Override
    public List<HotTiYan> getAllHotTiYans() {
        return hotTiYanMapper.getAllHotTiYans();
    }

    @Override
    public boolean deleteHotTiYan(Integer hotTiYanId) {
        return hotTiYanMapper.deleteHotTiYan(hotTiYanId);
    }

    @Override
    public boolean updateHotTiYan(HotTiYan hotTiYan) {
        return hotTiYanMapper.updateHotTiYan(hotTiYan);
    }
}
