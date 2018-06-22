package edu.just.jiguo.dao;

import edu.just.jiguo.model.KuWan;
import edu.just.jiguo.util.MyMapper;

import java.util.List;

public interface KuWanMapper extends MyMapper<KuWan> {

    public boolean addKuWan(KuWan kuWan);
    public List<KuWan> getAllKuWans();
    public KuWan getKuWanById(Integer kuWanId);
    public boolean deleteKuWan(Integer kuWanId);
    public boolean updateKuWan(KuWan kuWan);

}