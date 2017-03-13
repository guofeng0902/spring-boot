package com.girl.controller;

import com.girl.domain.Girl;
import com.girl.repository.GirlRepository;
import com.girl.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by hlwen on 2017/3/13.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;


    /**
     * 查询列表
     *
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    /**
     * 添加一个女生
     * @param girl
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }

        girl.setCupSize(girl.getCupSize());
        girl.setAge(girl.getAge());

        return girlRepository.save(girl);
    }

    /**
     * 查询一个
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id) {

        return girlRepository.findOne(id);
    }

    /**
     * 更新
     *
     * @param id
     * @param cupSize
     * @param age
     * @return
     */

    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);

        return girlRepository.save(girl);
    }

    /**
     * 删除
     *
     * @param id
     */
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id) {

        girlRepository.delete(id);
    }

    /**
     * 通过年龄查询
     *
     * @param age
     * @return
     */
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age) {

        return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public void girlTwo(){
        girlService.insertTwo();

    }


}
