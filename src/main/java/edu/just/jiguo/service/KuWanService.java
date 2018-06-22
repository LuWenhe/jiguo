package edu.just.jiguo.service;

import edu.just.jiguo.model.KuWan;

import java.util.List;

public interface KuWanService {

    public List<KuWan> getAllKuwan();

    public List<KuWan> getKuwanById(Integer kuwanId);

}
