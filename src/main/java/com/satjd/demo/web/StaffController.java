package com.satjd.demo.web;

import com.satjd.demo.domain.Staff;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/staff")
public class StaffController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Staff> getStaffList() throws Exception {

        List<Staff> s = new ArrayList<>();

        // TODO fetch staff data from db

        if(s.isEmpty()) throw new Exception();

        return s;

    }
}
