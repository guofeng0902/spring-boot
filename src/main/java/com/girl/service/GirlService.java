package com.girl.service;

import com.girl.domain.Girl;
import com.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


/**
 * Created by hlwen on 2017/3/13.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    /**
     * 并行处理事物
     */
    @Transactional
    public void insertTwo(){
        Girl girlA  =new Girl();
        girlA.setAge(18);
        girlA.setCupSize("A");
        girlRepository.save(girlA);

        Girl girlB  =new Girl();
        girlB.setAge(19);
        girlB.setCupSize("B");
        girlRepository.save(girlB);
    }
    public void getAge(Integer id){
        Girl girl= girlRepository.findOne(id);
        Integer age = girl.getAge();

        if(age <10){
            //返回你还在上小学吧
        }else if(age >10 && age <16){
            //返回你还在上初中吧
        }
    }

}
