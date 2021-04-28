package com.example.dogdaycare.rest;

import com.example.dogdaycare.entity.Visit;
import com.example.dogdaycare.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VisitController {
    private final VisitService visitService;

    @Autowired
    public VisitController(@Qualifier("visitServiceIMPL") VisitService visitService) {
        this.visitService = visitService;
    }

    // get request for list of visits
    @GetMapping("/visits")
    public List<Visit> findAll(){
        return visitService.findAll();
    }

    // post request to add new visit object
    @PostMapping("/visits")
    public Visit addVisit(@RequestBody Visit theVisit){
        theVisit.setId(0);
        visitService.saveOrUpdate(theVisit);
        return theVisit;
    }

    @PutMapping("/visits")
    public Visit updateVisit(@RequestBody Visit theVisit){
        visitService.saveOrUpdate(theVisit);
        return theVisit;
    }

    // delete request to remove visit
    @DeleteMapping("/visits/{visitId}")
    public String deleteVisit(@PathVariable int visitId){
        visitService.deleteById(visitId);
        return "Deleted visit id: " + visitId;
    }
}
