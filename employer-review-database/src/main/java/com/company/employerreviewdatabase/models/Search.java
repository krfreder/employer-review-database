package com.company.employerreviewdatabase.models;

import java.util.ArrayList;

public class Search {

    public static ArrayList<Job> findSearchValue(String searchValue, Iterable<Job> allJobs) {

        String lowerSearchVal = searchValue.toLowerCase();

        ArrayList<Job> results = new ArrayList<>();

        for (Job job : allJobs) {
            if(job.toString().toLowerCase().contains(lowerSearchVal)) {
                results.add(job);
            }

//            for(int i = 0; i < job.size; i++ )

//            if (job.getJobTitle().toLowerCase().contains(lowerSearchVal)) {
//                results.add(job);
//            } else if (job.getCompany().toLowerCase().contains(lowerSearchVal)) {
//                results.add(job);
//            } else if (job.getCultures().toString().toLowerCase().contains(lowerSearchVal)) {
//                results.add(job);
//            } else if (job.getIdentities().toString().toLowerCase().contains(lowerSearchVal)) {
//                results.add(job);
//            } else if (job.toString().toLowerCase().contains(lowerSearchVal)) {
//                results.add(job);
//            }

        }

        return results;
    }

//    public static ArrayList<Job> findByColumnAndValue(String column, String value, Iterable<Job> allJobs) {
//
//        ArrayList<Job> results = new ArrayList<>();
//
//        if (value.toLowerCase().equals("all")){
//            return (ArrayList<Job>) allJobs;
//        }
//
//        if (column.equals("all")){
//            results = findByValue(value, allJobs);
//            return results;
//        }
//        for (Job job : allJobs) {
//
//            String aValue = getFieldValue(job, column);
//
//            if (aValue != null && aValue.toLowerCase().contains(value.toLowerCase())) {
//                results.add(job);
//            }
//        }
//
//        return results;
//    }
//
//    public static String getFieldValue(Job job, String fieldName){
//        String theValue;
//        if (fieldName.equals("jobTitle")){
//            theValue = job.getJobTitle();
//        } else if (fieldName.equals("company")) {
//            theValue = job.getCompany();
//        } else if (fieldName.equals("culture")) {
//            theValue = job.getCultures().toString();
//        } else {
//            theValue = job.getIdentities().toString();
//        }
//
//        return theValue;
//    }

    //    public static ArrayList<Job> findByValue(String value, Iterable<Job> allJobs) {
//        String lower_val = value.toLowerCase();
//
//        ArrayList<Job> results = new ArrayList<>();
//
//        for (Job job : allJobs) {
//
//            if (job.getJobTitle().toLowerCase().contains(lower_val)) {
//                results.add(job);
//            } else if (job.getCompany().toLowerCase().contains(lower_val)) {
//                results.add(job);
//            } else if (job.getCultures().toString().toLowerCase().contains(lower_val)) {
//                results.add(job);
//            } else if (job.getIdentities().toString().toLowerCase().contains(lower_val)) {
//                results.add(job);
//            } else if (job.toString().toLowerCase().contains(lower_val)) {
//                results.add(job);
//            }
//
//        }
//
//        return results;
//    }

}
