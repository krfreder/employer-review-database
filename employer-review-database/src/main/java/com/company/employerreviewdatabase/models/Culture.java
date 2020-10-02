package com.company.employerreviewdatabase.models;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Culture extends AbstractEntity{

    public static void main(String[] args) {
        ArrayList<String> cultureDescriptors = new ArrayList<String>();
        cultureDescriptors.add("Competitive");
        cultureDescriptors.add("Collaborative");
        cultureDescriptors.add("Heavily-Managed");
        cultureDescriptors.add("Self-Directed");
        cultureDescriptors.add("Formal");
        cultureDescriptors.add("Relaxed");
        cultureDescriptors.add("Promote-Outside");
        cultureDescriptors.add("Promote-Within");
        cultureDescriptors.add("Progressive");
        cultureDescriptors.add("Conservative");
        cultureDescriptors.add("Unclear-Communication");
        cultureDescriptors.add("Clear-Communication");
    }

}
