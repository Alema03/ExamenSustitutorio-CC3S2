package org.example;

import java.util.List;
import java.util.Map;

public class SecurityPerspective {
    private List<String> threats;
    private List<String> vulnerabilities;

    public SecurityPerspective(List<String> threats, List<String> vulnerabilities) {
        this.threats = threats;
        this.vulnerabilities = vulnerabilities;
    }

    public List<String> getThreats() {
        return threats;
    }

    public void setThreats(List<String> threats) {
        this.threats = threats;
    }

    public List<String> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(List<String> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    @Override
    public String toString() {
        return "Security Perspective:\n" +
                "Threats: " + threats + "\n" +
                "Vulnerabilities: " + vulnerabilities;
    }

}
