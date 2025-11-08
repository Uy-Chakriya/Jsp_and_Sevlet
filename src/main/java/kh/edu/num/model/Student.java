package kh.edu.num.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class Student {
    private Long id;
    
    // Validation constraints (Step 7)
    @NotEmpty(message = "Name is required")
    private String name;

    @NotEmpty(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotEmpty(message = "Major is required")
    private String major;

    // Static counter for simple ID generation
    private static Long idCounter = 0L;

    public Student() {
        // Default constructor required for form binding
    }

    public Student(String name, String email, String major) {
        // Only generate new ID if we are creating a NEW student
        this.id = ++idCounter;
        this.name = name;
        this.email = email;
        this.major = major;
    }

    // Constructor for use during Update (to retain original ID)
    public Student(Long id, String name, String email, String major) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.major = major;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
}