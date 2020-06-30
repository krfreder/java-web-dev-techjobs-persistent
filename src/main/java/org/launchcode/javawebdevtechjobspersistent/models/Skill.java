package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    private String skillsExtended;

    public Skill() {}

    public String getSkillsExtended() { return skillsExtended; }

    public void setSkillsExtended(String skillsExtended) { this.skillsExtended = skillsExtended; }

}