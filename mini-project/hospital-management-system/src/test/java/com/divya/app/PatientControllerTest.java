package com.divya.app;

import com.divya.app.controller.PatientController;
import com.divya.app.model.Appointment;
import com.divya.app.repository.AppointmentRepository;
import org.junit.jupiter.api.BeforeEach;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class PatientControllerTest {
    @InjectMocks
    private PatientController patientController;
    @Mock
    Appointment appointment;
    @Mock
    AppointmentRepository appointmentRepos;
    @BeforeEach
    void setUp(){
        appointment= Mockito.mock(Appointment.class);
    }
 @Test
    public void TestMethod1() {
     List test = new ArrayList();
     when(appointmentRepos.findBypatientName(anyString())).thenReturn(test);
     List result = patientController.getMyAppointments("ranjith");
     assertEquals(test, result);
 }
  @Test
  public void TestMethod2() {
      Appointment ap1 = new Appointment();
      when(appointmentRepos.save(any(Appointment.class))).thenReturn(ap1);
      Appointment result = patientController.saveAppointment(appointment);
      assertEquals(ap1, result);
  }






}
