package com.divya.app;

import com.divya.app.controller.PrescriptionController;
import com.divya.app.model.Prescription;
import com.divya.app.repository.PrescriptionRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class PrescriptionControllerTest {
    @InjectMocks
    private PrescriptionController prescriptionController;
    @Mock
    Prescription prescription;
    @Mock
    PrescriptionRepository prescriptionRepository;

    @BeforeEach
    void setUp() {
        prescription = Mockito.mock(Prescription.class);
        prescriptionRepository = Mockito.mock(PrescriptionRepository.class);
    }
    @Test
    public void TestGetAllPrescriptions() {
        List<Prescription> viewprescription = new ArrayList();
        Prescription prescription2 = new Prescription("p04","a03","Medicine xyz","pat01","doc02");
        viewprescription.add(prescription2);
        when(prescriptionRepository.findAllByPatientName(anyString())).thenReturn(viewprescription);
        List<Prescription> result = prescriptionController.getAllPrescriptions("pat01");
        assertEquals(viewprescription.size(), 1);
        assertEquals(viewprescription.get(0).getPrescriptionId(),result.get(0).getPrescriptionId());
        assertEquals(viewprescription.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(viewprescription.get(0).getDescription(),result.get(0).getDescription());
        assertEquals(viewprescription.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(viewprescription.get(0).getDoctorName(),result.get(0).getDoctorName());
    }
    @Test
    public void TestSavePrescription() {
        Prescription saveprescription = new Prescription();
        saveprescription.setAppointmentId("a03");
        saveprescription.setPrescriptionId("p04");
        saveprescription.setDescription("Medicine xyz");
        saveprescription.setDoctorName("doc04");
        saveprescription.setPatientName("pat04");
        when(prescriptionRepository.save(any(Prescription.class))).thenReturn(saveprescription);
        Prescription result = prescriptionController.savePrescription(prescription);
        assertEquals(saveprescription.getPrescriptionId(), result.getPrescriptionId());
        assertEquals(saveprescription.getAppointmentId(),result.getAppointmentId());
        assertEquals(saveprescription.getDescription(),result.getDescription());
        assertEquals(saveprescription.getDoctorName(),result.getDoctorName());
        assertEquals(saveprescription.getPatientName(),result.getPatientName());
    }
}
