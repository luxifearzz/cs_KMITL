import java.util.ArrayList;

class Lab1Coder {
    private String name;
    int experience;
    private ArrayList<String> languages = new ArrayList<>();

    Lab1Coder() {
    }

    Lab1Coder(String n) {
        name = n;
    }

    Lab1Coder(String n, int exp) {
        name = n;
        experience = exp;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setExperience(int exp) {
        experience = exp;
    }

    int getExperience() {
        return experience;
    }

    void setLanguages(String... lang) {
        ArrayList<String> langList = new ArrayList<>();
        for (String l : lang) {
            langList.add(l);
        }
        languages = langList;
    }

    ArrayList<String> getLanguages() {
        return languages;
    }

    ArrayList<String> findCommonLanguages(Lab1Coder other) {
        ArrayList<String> common = new ArrayList<>();
        for (String l : languages) {
            if (other.getLanguages().contains(l)) common.add(l);
        }
        if (common.isEmpty()) common.add("none");
        return common;
    }

    public String toString() {
        String str = String.format("%s(%d) knows", name, experience);
        for (String l : languages) {
            str += " " + l;
        }
        return str;
    }

}