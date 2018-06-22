package edu.just.jiguo.dao;

import edu.just.jiguo.model.KuWan;
import edu.just.jiguo.util.MyMapper;

import java.util.List;

public interface KuWanMapper extends MyMapper<KuWan> {

    public List<KuWan> getKuWan();

    public List<KuWan> getKuWanById(Integer kuWan_Id);

}