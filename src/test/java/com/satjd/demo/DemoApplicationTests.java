package com.satjd.demo;

import com.satjd.demo.domain.MonthArrangementRepository;
import com.satjd.demo.domain.StaffRepository;
import com.satjd.demo.domain.WeekArrangementRepository;
import com.satjd.demo.domain.WeekdayDescriptorRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableJpaAuditing
public class DemoApplicationTests {

    @Autowired
    private StaffRepository repo;

    @Autowired
    private MonthArrangementRepository monthRepo;

    @Autowired
    private WeekArrangementRepository weekRepo;

    @Autowired
    private WeekdayDescriptorRepository weekdesRepo;

	@Test
    public void jpaTest() {

//	    repo.save(new Staff("张三",30,false,true,2));
//        repo.save(new Staff("李四",22,false,false,1));
//        repo.save(new Staff("王五",27,false,true,3));
//        repo.save(new Staff("赵六",18,false,true,3));



//        MonthArrangement m1 = new MonthArrangement();
//        m1.setNight(new HashSet<>());
//        m1.getNight().add(repo.getOne(1));
//        m1.getNight().add(repo.getOne(5));
//
//        monthRepo.save(m1);


//        weekdesRepo.deleteAllInBatch();
//
//        ArrayList<WeekdayDescriptor> l = new ArrayList<>();
//        for(short i=1;i<=7;i++) {
//            WeekdayDescriptor wd = new WeekdayDescriptor();
//            wd.setIdle(true);
//            wd.setWeekDay(i);
//            l.add(wd);
//        }
//
//        weekdesRepo.saveAll(l);

//        WeekArrangement w1 = weekRepo.getOne(1);
//        WeekdayDescriptor ww = weekdesRepo.getOne(3);
//        ww.setArrangementOfDescriptor(w1);
//        w1.getTodayDescriptors().add(ww);
//
//        weekRepo.save(w1);

        System.out.println(" = " + weekRepo.findAll().get(0).getTodayDescriptors());



        //monthRepo.save(m1);
        //monthRepo.save(m2);
        //Assert.assertEquals(4, repo.findAll().size());

    }

}
