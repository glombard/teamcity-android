package com.erioxyde.android.teamcity.bo;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {



    public static final class Projects {
        public List<Project> project;

        public CharSequence[] getProjectsNames() {
            if (project != null) {
                List<String> names = new ArrayList<String>();
                for (Project projectItem : project) {
                    names.add(projectItem.name);
                }
                return names.toArray(new String[names.size()]);
            }
            return new String[] { "" };
        }

        public CharSequence[] getProjectsIds() {
            if (project != null) {
                List<String> names = new ArrayList<String>();
                for (Project projectItem : project) {
                    names.add(projectItem.id);
                }
                return names.toArray(new String[names.size()]);
            }
            return new String[] { "" };
        }
    }

    public String id;

    public String name;

    public String href;

    public ProjectInfos informations;

    public int success = 0;

    public int errors = 0;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (href == null ? 0 : href.hashCode());
        result = prime * result + (id == null ? 0 : id.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Project other = (Project) obj;
        if (href == null) {
            if (other.href != null) {
                return false;
            }
        } else if (!href.equals(other.href)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

}
