package com.company.employerreviewdatabase.models;

import java.util.ArrayList;

public class Search {

    public static ArrayList<Job> findSearchValue(String searchValue, Iterable<Job> allJobs) {

        String lowerSearchVal = searchValue.toLowerCase();

        ArrayList<Job> results = new ArrayList<>();

        for (Job job : allJobs) {

            if (job.getJobTitle().toLowerCase().contains(lowerSearchVal)) {
                results.add(job);
            } else if (job.getCompany().toLowerCase().contains(lowerSearchVal)) {
                results.add(job);
            } else if (job.getCultures().toString().toLowerCase().contains(lowerSearchVal)) {
                results.add(job);
            } else if (job.getIdentities().toString().toLowerCase().contains(lowerSearchVal)) {
                results.add(job);
            } else if (job.toString().toLowerCase().contains(lowerSearchVal)) {
                results.add(job);
            }

        }

        return results;
    }

}
