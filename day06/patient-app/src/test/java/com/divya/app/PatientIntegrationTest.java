

package com.divya.app;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.divya.app.controller.PatientController;
import com.divya.app.model.Patient;
import com.divya.app.service.PatientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.util.Base64Utils;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({PatientController.class})
@ActiveProfiles(value = "test")
public class PatientIntegrationTest {
    @InjectMocks
    PatientController patientController;
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    PatientService patientService;
    @Value("${patient.post.url}")
    String posturl;

    @Value("${patient.put.url}")
    String putUrl;

    @Test
    public void testSaveStudentPost() throws Exception {
        String secret = "Basic " + Base64Utils.encodeToString(("user123"+":"+"password").getBytes());
        Patient patient=new Patient("pat01","pat_test","30","Male","fever");
        ResultActions responseEntity  = mockMvc.perform(post(posturl).header(HttpHeaders.AUTHORIZATION, secret).contentType(MediaType.APPLICATION_JSON)
                .content(asObjectToJsonString(patient)).accept(MediaType.APPLICATION_JSON));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        Patient patientResult= asJsonStringToObject(result);
        assertNotNull(patientResult);
        assertEquals(patientResult.getId(),"pat01");
        assertEquals(patientResult.getName(),"pat_test");
        assertEquals(patientResult.getAge(),"30");
        assertEquals(patientResult.getGender(),"Male");
        assertEquals(patientResult.getDisease(),"fever");
    }

/*    @Test
    public void testSaveStudentUpdate() throws Exception {
        String secret = "Basic " + Base64Utils.encodeToString(("user123"+":"+"password").getBytes());
        Patient patient=new Patient("pat01","pat_test","30","Male","fever");
        //when mock
        when(patientController.updatePatient(any(Patient.class),anyString(),anyString())).thenReturn(patient);
        //actual call
        ResultActions responseEntity  = mockMvc.perform(put(putUrl).header(HttpHeaders.AUTHORIZATION, secret).contentType(MediaType.APPLICATION_JSON)
                .content(asObjectToJsonString(patient)).param("disease","fever").param("disease","30").accept(MediaType.APPLICATION_JSON));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        Patient patientResult= asJsonStringToObject(result);
        assertNotNull(patientResult);
        assertEquals(patientResult.getId(),"pat01");
    }*/

    private String asObjectToJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            final String jsonContent = mapper.writeValueAsString(obj);
            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Patient asJsonStringToObject( String result) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            Patient patient= mapper.readValue(result, Patient.class);
            return patient;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}