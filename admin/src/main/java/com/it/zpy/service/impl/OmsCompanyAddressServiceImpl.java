package com.it.zpy.service.impl;

import com.it.zpy.mapper.OmsCompanyAddressMapper;
import com.it.zpy.model.OmsCompanyAddress;
import com.it.zpy.model.OmsCompanyAddressExample;
import com.it.zpy.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created by macro on 2018/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
