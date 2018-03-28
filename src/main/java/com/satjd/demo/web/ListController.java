package com.satjd.demo.web;

import com.satjd.demo.domain.*;
import com.satjd.demo.dto.InsertIdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/list")
public class ListController {

    @Autowired
    private MonthArrangementRepository monthRepo;

    @Autowired
    private WeekArrangementRepository weekRepo;

    @Autowired
    private  WeekdayDescriptorRepository weekDesRepo;

    @Autowired StaffRepository staffRepo;

    @RequestMapping(value = "/month",method = RequestMethod.GET)
    public List<MonthArrangement> getMonthArrangement(@RequestParam int y,@RequestParam int m) {

        return monthRepo.findAll();
    }

    @RequestMapping(value = "/month",method = RequestMethod.PUT)
    public InsertIdResponse updateMonthArrangement(@RequestParam Boolean create,@RequestBody(required = false) MonthArrangement newArrangement) {
        if(create) {
            // TODO create a new arrangement
            if(newArrangement == null) {
                MonthArrangement newArr = new MonthArrangement();
                monthRepo.save(newArr);
                InsertIdResponse res = new InsertIdResponse();
                res.setNewId(newArr.getMonthArrangementId());
                return res;
            }
        } else {
            MonthArrangement dst = monthRepo.getOne(newArrangement.getMonthArrangementId());
            dst.setDate(newArrangement.getDate());
            dst.setNight(newArrangement.getNight());
            dst.setNightStandby(newArrangement.getNightStandby());
            monthRepo.save(dst);
        }
        return null;
    }

    @RequestMapping(value = "/month",method = RequestMethod.DELETE)
    public void deleteMonthArrangement(@RequestParam int id) {
        // TODO delete arrangement by id
        monthRepo.deleteById(id);
        return;
    }

    @RequestMapping(value = "/week",method = RequestMethod.GET)
    public List<WeekArrangement> getWeekArrangement(@RequestParam int y,@RequestParam int m,@RequestParam int d) {
        // TODO fetch data
        return weekRepo.findAll();
    }

    @RequestMapping(value = "/week",method = RequestMethod.PUT)
    public InsertIdResponse updateWeekArrangement(@RequestParam Boolean create,@RequestBody(required = false)WeekArrangement newArrangement) throws Exception {
        if(create) {
            // TODO create a new arrangement
            WeekArrangement warr = new WeekArrangement();
            warr.setStaffThisWeekday(staffRepo.getOne(1));
            weekRepo.save(warr);

            ArrayList<WeekdayDescriptor> arlwd = new ArrayList<>();
            for(short i=1;i<=7;i++) {
                WeekdayDescriptor wd = new WeekdayDescriptor();
                wd.setIdle(true);
                wd.setKey(new WeekdayDescriptorKey());
                wd.getKey().setWeekDay(i);
                wd.setArrangementOfDescriptor(warr);
                arlwd.add(wd);
            }
            weekDesRepo.saveAll(arlwd);




            InsertIdResponse res = new InsertIdResponse();
            res.setNewId(warr.getWeekArrangementId());
            return res;
        } else {
            // TODO update to new arrangement from request body
            WeekArrangement dst = weekRepo.getOne(newArrangement.getWeekArrangementId());
            dst.setStaffThisWeekday(newArrangement.getStaffThisWeekday());
            dst.setTodayDescriptors(newArrangement.getTodayDescriptors());

            if(dst.getTodayDescriptors() == null || dst.getStaffThisWeekday() == null)
                throw new Exception("Weekday Arrangements and Staff should not be null");
            weekRepo.save(dst);

            return null;
        }
    }

    @RequestMapping(value = "/week",method = RequestMethod.DELETE)
    public void deleteWeekArrangement(@RequestParam int id) {
        // TODO delete arrangement by id
        weekRepo.deleteById(id);
        return;
    }

    @RequestMapping(value = "/surgery",method = RequestMethod.GET)
    public List<SurgeryArrangement> getSurgeryArrangement(@RequestParam int y, @RequestParam int m, @RequestParam int d) {

        // TODO fetch data
        List<SurgeryArrangement> li = new ArrayList<>();

        li.add(new SurgeryArrangement());
        li.get(0).setSurgeryId(101);
        li.add(new SurgeryArrangement());
        li.get(0).setSurgeryId(101);

        return li;
    }

    @RequestMapping(value = "/surgery",method = RequestMethod.PUT)
    public InsertIdResponse updateSurgeryArrangement(@RequestParam(required = false,defaultValue = "false") Boolean create, @RequestBody(required = false) MonthArrangement newArrangement) {
        if(create) {
            // TODO create new surgery
            return null;
        } else {
            return null;
        }
    }

    @RequestMapping(value="/surgery",method = RequestMethod.DELETE)
    public void deleteSurgeryArrangement(@RequestParam int surgeryId) {
        // TODO delete surgery by id
        return;
    }

}
