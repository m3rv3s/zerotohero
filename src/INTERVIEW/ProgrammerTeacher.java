package INTERVIEW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProgrammerTeacher extends Program{

    List<String> teacherLanguages=new ArrayList<String>();

    @Override
    public Collection<String> getAllLanguages(){
        return teacherLanguages;
    }

    @Override
    public  void addLanguages(String language){
        teacherLanguages.add(language);
    }
    public boolean teach(Program programmer , String language){
        for (String teacherL: teacherLanguages){
            if (teacherL == language){
                programmer.addLanguages(language);
                return true;
            }
        }
        return false;
    }
}
