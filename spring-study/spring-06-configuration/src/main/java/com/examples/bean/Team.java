package com.examples.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "app")
//也可以在AppConfig里统一导入
//@PropertySource(value = {"classpath:team.properties"})
@Validated
public class Team {

    @NotBlank
    private String team;
    @NumberFormat
    private int teamSize;
    @Size(max = 30)
    private String teamLeader;
    @NotNull
    private Company company;
    @NotEmpty
    private List<Employee> employees;
    @NotEmpty
    private Map<String, String> technologies;


    private String[] clients;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(String teamLeader) {
        this.teamLeader = teamLeader;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Map<String, String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(Map<String, String> technologies) {
        this.technologies = technologies;
    }

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Team{" +
                "team='" + team + '\'' +
                ", teamSize=" + teamSize +
                ", teamLeader='" + teamLeader + '\'' +
                ", company=" + company +
                ", employees=" + employees +
                ", technologies=" + technologies +
                ", clients=" + Arrays.toString(clients) +
                '}';
    }
}