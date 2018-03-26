package com.satjd.demo.web;

import com.satjd.demo.domain.Staff;
import com.satjd.demo.domain.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    StaffRepository staffRepository;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Staff> getStaffList() throws Exception {

        // TODO fetch staff data from db
        List<Staff> s = staffRepository.findAll();



        if(s.isEmpty()) throw new Exception();

        return s;

    }
}
