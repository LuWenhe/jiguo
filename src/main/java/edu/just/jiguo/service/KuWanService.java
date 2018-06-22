package edu.just.jiguo.service;

import edu.just.jiguo.model.KuWan;

import java.util.List;

public interface KuWanService {

    public boolean addKuWan(KuWan kuWan);
    public List<KuWan> getAllKuWans();
    public KuWan getKuWanById(Integer kuWanId);
    public boolean deleteKuWan(Integer kuWanId);
    public boolean updateKuWan(KuWan kuWan);

}
