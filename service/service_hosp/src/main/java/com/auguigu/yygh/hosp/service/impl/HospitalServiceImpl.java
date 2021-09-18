package com.auguigu.yygh.hosp.service.impl;

import com.atguigu.yygh.hosp.mapper.HospitalSetMapper;
import com.atguigu.yygh.model.hosp.HospitalSet;
import com.auguigu.yygh.hosp.service.HospitalService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalService {
}
