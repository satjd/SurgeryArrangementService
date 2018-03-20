package com.satjd.demo.web;

import com.satjd.demo.domain.MonthArrangement;
import com.satjd.demo.domain.WeekArrangement;
import com.satjd.demo.domain.WeekdayDescriptor;
import com.satjd.demo.dto.InsertIdResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/list")
public class ListController {

    @RequestMapping(value = "/month",method = RequestMethod.GET)
    public List<MonthArrangement> getMonthArrangement(@RequestParam int y,@RequestParam int m) {
        List<MonthArrangement> li = new ArrayList<>();


        // TODO fetch data
        li.add(new MonthArrangement());
        li.get(0).setId(1);
        li.add(new MonthArrangement());
        li.get(1).setId(2);

        return li;
    }

    @RequestMapping(value = "/month",method = RequestMethod.PUT)
    public InsertIdResponse updateMonthArrangement(@RequestParam Boolean create,@RequestBody(required = false) MonthArrangement newArrangement) {
        if(create) {
            // TODO create a new arrangement

            InsertIdResponse res = new InsertIdResponse();
            res.setNewId(10001);
            return res;
        } else {
            // TODO update to new arrangement from request body
            return null;
        }
    }

    @RequestMapping(value = "/month",method = RequestMethod.DELETE)
    public String deleteMonthArrangement(@RequestParam int id) {
        // TODO delete arrangement by id
        return "m";
    }

    @RequestMapping(value = "/week",method = RequestMethod.GET)
    public List<WeekArrangement> getWeekArrangement(@RequestParam int y,@RequestParam int m,@RequestParam int d) {
        // TODO fetch data

        List<WeekArrangement> li = new ArrayList<>();
        li.add(new WeekArrangement());
        li.get(0).setArrangements(new ArrayList<>());
        for(int i=1;i<=7;i++) {
            li.get(0).getArrangements().add(new WeekdayDescriptor());
        }
        li.get(0).setId(1);

        return li;
    }

    @RequestMapping(value = "/week",method = RequestMethod.PUT)
    public InsertIdResponse updateWeekArrangement(@RequestParam Boolean create,@RequestBody(required = false)WeekArrangement newArrangement) {
        if(create) {
            // TODO create a new arrangement

            InsertIdResponse res = new InsertIdResponse();
            res.setNewId(10001);
            return res;
        } else {
            // TODO update to new arrangement from request body
            return null;
        }
    }

    @RequestMapping(value = "/week",method = RequestMethod.DELETE)
    public String deleteWeekArrangement(@RequestParam int id) {
        // TODO delete arrangement by id
        return "m";
    }



}
