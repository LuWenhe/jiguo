package edu.just.jiguo.service.impl;

import edu.just.jiguo.dao.KuWanMapper;
import edu.just.jiguo.model.KuWan;
import edu.just.jiguo.service.KuWanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("kuWanService")
public class KuWanServiceImpl implements KuWanService {

    @Autowired
    private KuWanMapper kuWanMapper;


    @Override
    public boolean addKuWan(KuWan kuWan) {
        return kuWanMapper.addKuWan(kuWan);
    }

    @Override
    public List<KuWan> getAllKuWans() {
        return kuWanMapper.getAllKuWans();
    }

    @Override
    public KuWan getKuWanById(Integer kuWanId) {
        return kuWanMapper.getKuWanById(kuWanId);
    }

    @Override
    public boolean deleteKuWan(Integer kuWanId) {
        return kuWanMapper.deleteKuWan(kuWanId);
    }

    @Override
    public boolean updateKuWan(KuWan kuWan) {
        return kuWanMapper.updateKuWan(kuWan);
    }
}
