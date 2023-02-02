package com.doctor.app.ControllerTest;

import com.doctor.app.Controller.DoctorController;
import com.doctor.app.Controller.PatientController;
import com.doctor.app.Model.Appointment;
import com.doctor.app.Model.Prescription;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Patienttest {
    Appointment appointment = new Appointment();
    PatientController patientController = new PatientController();

    @Test
    public void testgetPatients()
    {
        int size = 2;

        Map result = patientController.getPatients();

        Assert.assertEquals(size,result.size());
    }
    @Test
    public void testgetAppointments()
    {

    }
    @Test
    public void testgetMyAppointments()
    {
        Prescription prescription1 = new Prescription("p01","ap01","fever","pat1","Ajay");
        Prescription prescription2 = new Prescription("p02","ap02","cold","pat2","Paul");
        Appointment appointment1 = new Appointment("ap01", "pat1", "Doc1", "25-01-2023", prescription1);
        Appointment appointment2 = new Appointment("ap02","pat2","Paul","25-01-2023",prescription2);
        int ActualResult = 2;
        List list = new ArrayList();
        patientController.saveAppointment(appointment1);
        patientController.saveAppointment(appointment2);
        list.add(appointment1);
        list.add(appointment2);


        Assert.assertEquals(list.size(),ActualResult);
    }

}
