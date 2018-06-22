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
    public List<KuWan> getAllKuwan() {
        List<KuWan> kuWans = kuWanMapper.getKuWan();
        return kuWans;
    }

    @Override
    public List<KuWan> getKuwanById(Integer kuwanId) {
        List<KuWan> kuWan = kuWanMapper.getKuWanById(kuwanId);
        return kuWan;
    }

}
