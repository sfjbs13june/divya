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
    public void TestMethod1() {
        List test = new ArrayList();
        when(PrescriptionRepository.findByPatientName(anyString())).thenReturn(test);
        List result = prescriptionController.getAllPrescriptions("ranjith");
        assertEquals(test, result);
    }

    @Test
    public void TestMethod2() {
        Prescription p1 = new Prescription();
        when(prescriptionRepository.save(any(Prescription.class))).thenReturn(p1);
        Prescription result = PrescriptionController.savePrescription(prescription);
        assertEquals(p1, result);
    }
}