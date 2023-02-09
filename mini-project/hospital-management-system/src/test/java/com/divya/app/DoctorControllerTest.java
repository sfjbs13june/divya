package com.divya.app;

import com.divya.app.controller.DoctorController;
import com.divya.app.model.Appointment;
import com.divya.app.repository.AppointmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class DoctorControllerTest {
    @InjectMocks
    private DoctorController docController;
    @Mock
    Appointment appointment;
    @Mock
    AppointmentRepository appointmentrepos;
    @BeforeEach
    void setup(){
        appointment= Mockito.mock(Appointment.class);
        appointmentrepos =Mockito.mock(AppointmentRepository.class);
    }

@Test
    public void testMethod1()
{
    List test =new ArrayList();
    when(appointmentrepos.findBydoctorName(anyString())).thenReturn(test);
    List result=docController.getAppointments("ranjith");
    assertEquals(test,result);
}
@Test
    public void TestMethod2(){
        Appointment ap1 =new Appointment();
        when(appointmentrepos.save(any(Appointment.class))).thenReturn(ap1);
        Appointment result=docController.saveAppointment(appointment);
        assertEquals(ap1,result);
}
}
