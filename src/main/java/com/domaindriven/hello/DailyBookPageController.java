package com.domaindriven.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tony on 2016. 1. 22..
 */
@Controller
public class DailyBookPageController {

    private static FakeRecords fakeRecords = new FakeRecords();

    @RequestMapping("list")
    public String list(Model model){
        List<Record> recordList = new ArrayList<Record>();
        for(int i = 1; i < 14; i++){
            recordList.add(fakeRecords.getRecord(i));
        }
        model.addAttribute("list", recordList);
        return "list";
    }



}

