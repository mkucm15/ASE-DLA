package com.DrLabs.DLA.entity;

import com.DrLabs.DLA.TestMode;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tests")
public class Test {

    @Id
    private String id;

    private String testName;
    //private Date testDate;
    private TestMode testMode;
    private String testResults;

    @OneToMany(mappedBy = "Test", cascade = CascadeType.ALL)
    private List<Appointment> appointments;
    // Constructors, getters, setters, and other methods
}

