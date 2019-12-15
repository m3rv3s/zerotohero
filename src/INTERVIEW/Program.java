package INTERVIEW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Program {

        List<String> languages=new ArrayList<>();
        public Collection<String> getAllLanguages(){
            return languages;

        }

    public void  addLanguages(String language){
    languages.add(language);



        }
}
